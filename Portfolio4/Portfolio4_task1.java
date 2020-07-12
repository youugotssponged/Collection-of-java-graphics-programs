// File: Portfolio4_Task1.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To implement collision between two bouncing circles

////////////////////////////////////////////////////////////////////
// Modifying: Modifying original source code given as part of the///
// Portfolio 4 Coursework 1 brief...///////////////////////////////
///////////////////////////////////////////////////////////////////


public class Portfolio4_task1 {
    public static void main(String[] args){
        
        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        // Initial Values for the first circle
        double rxCircle1 = 0.480, ryCircle1 = 0.860; // Position of Circle 1
        double vxCircle1 = 0.015, vyCircle1 = 0.024; // Velocity of Circle 1
        double radiusCircle1 = 0.05;          // Radius of Circle 1
        
        // Initial Values for the second circle
        double rxCircle2 = 0.040, ryCircle2 = 0.220; // Position of Circle 2
        double vxCircle2 = 0.025, vyCircle2 = 0.045; // Velocity of Circle 2
        double radiusCircle2 = 0.12;                // Radius of Circle2 
        
        // Main animation loop
        while(true){
            // Bounce off wall according to law of elastic collision
            // Check for first circle
            if(Math.abs(rxCircle1 + vxCircle1) > 1.0 - radiusCircle1) 
                vxCircle1 = -vxCircle1;
            
            if(Math.abs(ryCircle1 + vyCircle1) > 1.0 - radiusCircle1)
                vyCircle1 = -vyCircle1;
            
            // Check for second circle
            if(Math.abs(rxCircle2 + vxCircle2) > 1.0 - radiusCircle2) 
                vxCircle2 = -vxCircle2;
            
            if(Math.abs(ryCircle2 + vyCircle2) > 1.0 - radiusCircle2)
                vyCircle2 = -vyCircle2;
            
           
            
            // COLLISION DETECTION CHECK 
            boolean hasCollided = false;
            
            // Follows the formula for calculating distance between two 2D vectors.
            // In this case, StdDraw draws the shapes from their centre points given in X & Y, so the need for calculating a circles centre is unneccessary for now.
            double distBetweenCentres = Math.sqrt(Math.pow(rxCircle1 - rxCircle2, 2) + Math.pow(ryCircle1 - ryCircle2, 2));
            double totalRadius = (radiusCircle1 + radiusCircle2);
            
            // Register Collision
            if(totalRadius > distBetweenCentres){
                hasCollided = true;
                System.out.println("HAS COLLIDED!");
            }
            
            // Send Circles in the opposite direction if they collide
            if(hasCollided){
                vxCircle1 = -vxCircle1;
                vxCircle2 = -vxCircle2;
                
                vyCircle1 = -vyCircle1;
                vyCircle2 = -vyCircle2;
            }
            
            
            
            // Update positions
            // First circle
            rxCircle1 = rxCircle1 + vxCircle1;
            ryCircle1 = rxCircle1 + vyCircle1;
            // Second Circle
            rxCircle2 = rxCircle2 + vxCircle2;
            ryCircle2 = rxCircle2 + vyCircle2;
            
            
            // Clear background
            StdDraw.clear(StdDraw.GRAY);
            
            // Draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rxCircle1, ryCircle1, radiusCircle1);
            
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(rxCircle2, ryCircle2, radiusCircle2);
            
            
            // Display and pause for 20ms
            StdDraw.show(20);
            
        }
        
    }
}
