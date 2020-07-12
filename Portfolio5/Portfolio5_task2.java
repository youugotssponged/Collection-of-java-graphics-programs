// File: Portfolio5_Task2.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To render a rotating sun and a planet rotating around the sun's orbit pathing.

public class Portfolio5_task2 {
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

        
        // Animation loop
        while(true)
        {
            // Apply rotations - decrease to simulate clockwise
            planetRotation = planetRotation - planetRotationSpeed;
            sunRot = sunRot - sunRotationSpeed;
            
            // Update coords for planet
            planetX = (orbitRadius * (orbitRadius * 2 /* diameter */) * Math.cos(planetRotation));
            planetY = (orbitRadius * (orbitRadius * 2 /* diameter */) * Math.sin(planetRotation));
           
            
            // Clear The Screen
            StdDraw3D.clear();
            
            // Draw Sun
            StdDraw3D.setPenColor(StdDraw3D.YELLOW);
            StdDraw3D.wireSphere(sunX, sunY, sunZ, 0.45, 0, 0, sunRot);

            // Draw Orbit as an overlay - to 2D space
            StdDraw3D.setPenColor(StdDraw3D.RED);
            StdDraw3D.overlayCircle(orbitX, orbitY, orbitRadius);

            // Draw Planet
            StdDraw3D.setPenColor(StdDraw3D.GREEN);
            StdDraw3D.sphere(planetX, planetY, planetZ, 0.2);
           
            // Show current frame
            StdDraw3D.show(20);
        }
    }
}
