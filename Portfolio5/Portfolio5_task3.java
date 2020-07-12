// File: Portfolio5_Task3.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To render a rotating sun and a planet rotating around the sun's orbit pathing.
//          and to apply mouse listener logic to add control to the program


public class Portfolio5_task3 {
     public static void main(String[] args){
        // Set scaling
        StdDraw3D.setScale(-1, 1);
        
        // Data
        // Sun attributes 
        double sunX = 0, sunY = 0, sunZ = 0;
        double sunRot = 0, sunRotationSpeed = 0.35;
        
        // Planet Attributes
        double planetX = 0, planetY = 0, planetZ = 0;
        double planetRotation = 0, planetRotationSpeed = 0.1;
        
        // Orbit circle attibutes
        double orbitX = 0, orbitY = 0, orbitRadius = 0.8;
        
        // booleans to act as decision switches
        boolean isClockwise = false;
        boolean hasStopped = false;
        
        // On screen text
        String message = "";
        
        // Animation loop
        while(true)
        {
            // Using StdDraw3D's inbuilt mouse handlers
            // Listen to events - listener logic
            if(StdDraw3D.mouse1Pressed()){ // If left mouse button is clicked
                hasStopped = false; // has not stopped - force reset if has
                
                // if has not stopped, Left mouse button will trigger the rotation to go clockwise
                if(!hasStopped) isClockwise = false;
            } 
            else if(StdDraw3D.mouse3Pressed()){ // If right mouse button is clicked
                hasStopped = false; // has not stopped - force reset if has
                
                // if has not stopped, Left mouse button will trigger the rotation to go anticlockwise
                if(!hasStopped) isClockwise = true;
            } 
            else if(StdDraw3D.mouse2Pressed()){ // If middle mouse button is clicked
                message = "Orbiting has stopped!";
                hasStopped = true; // Stop rotation
            }
            
            // Act upon mouse events - rotate planet and sun 
            // if clockwise and has not stopped
            if(isClockwise && !hasStopped){
                // Update rotations
                planetRotation = planetRotation - planetRotationSpeed;
                sunRot = sunRot - sunRotationSpeed;
                message = "The planet is orbiting: Clockwise";
            } else if(!isClockwise && !hasStopped){ // if anti-clockwise and has not stopped
                // Update rotations
                planetRotation = planetRotation + planetRotationSpeed;
                sunRot = sunRot + sunRotationSpeed;
                message = "The planet is orbiting: Anti-Clockwise";
            }
            
            
            // Update coords for planet
            planetX = (orbitRadius * (orbitRadius * 2 /* diameter */) * Math.cos(planetRotation));
            planetY = (orbitRadius * (orbitRadius * 2 /* diameter */) * Math.sin(planetRotation));
           
            
            // Clear The Screen
            StdDraw3D.clear();
            
            // Draw objects and overlay
            // Draw Sun
            StdDraw3D.setPenColor(StdDraw3D.YELLOW);
            StdDraw3D.wireSphere(sunX, sunY, sunZ, 0.45, 0, 0, sunRot);

            // Draw Orbit as an overlay - to 2D space
            StdDraw3D.setPenColor(StdDraw3D.RED);
            StdDraw3D.overlayCircle(orbitX, orbitY, orbitRadius);

            // Draw Planet
            StdDraw3D.setPenColor(StdDraw3D.GREEN);
            StdDraw3D.sphere(planetX, planetY, planetZ, 0.2);
           
            // Draw info
            StdDraw3D.setPenColor(StdDraw3D.WHITE);
            StdDraw3D.overlayText(0.5, -0.9, message);
            // Show current frame - render frame
            StdDraw3D.show(20);
        }
    }
}
