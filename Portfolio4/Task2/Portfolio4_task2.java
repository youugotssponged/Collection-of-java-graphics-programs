// File: Portfolio4_Task2.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To create a self adjusting program that creates N balls, 
//          using arrays to store ball objects and positons etc.

import java.awt.Color; // Using Java's Colour Class
import java.util.Random; // Using the inbuilt Random Class

public class Portfolio4_task2 {
    public static void main(String[] args){
        // set the scale of the coordinate system
        StdDraw.setScale(-1.0, 1.0);
      
        // Data //
        // Used to randomise values
        Random rand = new Random();
        
        // Number of balls to be created and rendered
        int nBalls = 10; // change to add or decrease balls
        
        // Possible data for the program to choose from
        double xPositions[] = new double[]{0.5, -0.35, 0.2, 0.6, 0.7, 0.55, 0.45}; // Possible X's
        double yPositions[] = new double[]{0.25, 0.5, -0.5, -0.25, 0.45, 0.66, 0.7}; // Possible Y's
        double xV[]         = new double[]{0.015, 0.025, -0.015, 0.1, 0.17}; // Possible X Velocities
        double yV[]         = new double[]{0.025, 0.0225, 0.02, -0.1, -0.13}; // Possible Y Velocities
        double radius       = 0.07; // General Radius
        
        // Possible Colours To Choose from
        Color randColour[]   = new Color[]{StdDraw.RED, StdDraw.BLUE, StdDraw.GREEN, StdDraw.YELLOW, StdDraw.CYAN}; 
        
        
        // Array of Ball objecta - uninstantiated
        Ball ballArray[] = new Ball[nBalls];
        // Instantiate balls with randomly selected values from the given lists using the random object - rand
        // For every ball in the array
        for(int i = 0; i < ballArray.length; i++){
            // Construct a ball
            ballArray[i] = new Ball(
                    xPositions[rand.nextInt(xPositions.length)], // Randomly chosen X
                    yPositions[rand.nextInt(yPositions.length)], // Randomly chosen Y
                    xV[rand.nextInt(xV.length)], // Randomly Chosen xV
                    yV[rand.nextInt(yV.length)], // Randomly Chosen yV
                    radius, // General radius for all balls
                    randColour[rand.nextInt(randColour.length)] // Randomly Chosen Colour
            );
        }
        
        
        // Main animation loop
        while(true){
            // Handle collisions
            // WALLS
            // For every ball
            for(int i = 0; i < ballArray.length; i++){
                boolean hasCollided = false;
                
                // Check both X and Y bounds of the ball to see if they are touching the edge of the window
                // In this case 1.0 is the maximum in terms of the scale that has been set up
                
                if(Math.abs(ballArray[i].x + ballArray[i].vx) > 1.0 - ballArray[i].r) ballArray[i].vx = -ballArray[i].vx; // Flip vX
                if(Math.abs(ballArray[i].y + ballArray[i].vy) > 1.0 - ballArray[i].r) ballArray[i].vy = -ballArray[i].vy; // Flip vY 
                
                // BALLS
                // For every other ball
                for(int j = (i + 1); j < ballArray.length; j++){
                    
                    // Calculate distance between two balls
                    // Using the calculation from the previous task
                    double distBetweenCentres = (Math.sqrt(Math.pow(ballArray[i].x - ballArray[j].x, 2) + Math.pow(ballArray[i].y - ballArray[j].y, 2)));
                    
                    // Calculate total Radius between two balls
                    // Using the calculation from the previous task
                    double totalRadius = (ballArray[i].r + ballArray[j].r);
                    
                    // Register collision if the two radius's overlap
                    if(totalRadius > distBetweenCentres){
                        System.out.println("HAS COLLIDED!");
                        hasCollided = true;
                    }
                    
                    // Check for collision
                    if(hasCollided){
                        // Reverse to simulate bounce
                        // Initial Ball
                        ballArray[i].vx = -ballArray[i].vx; // Flip ball 1's vX
                        ballArray[i].vy = -ballArray[i].vy; // Flip ball 1's vY

                        // Other ball
                        ballArray[j].vx = -ballArray[j].vx; // Flip ball 2's vX
                        ballArray[j].vy = -ballArray[j].vy; // Flip ball 2's vY
                    }
                }
            }
           
            // UPDATE : positions
            // For every ball object
            for(Ball b : ballArray){
                b.x = b.x + b.vx; // Set X 
                b.y = b.y + b.vy; // Set Y 
            }
            
            // CLEAR
            StdDraw.clear(StdDraw.GRAY);
            
            // DRAW
            // For every ball object
            for(Ball b : ballArray){
                StdDraw.setPenColor(b.col); // Set colour
                StdDraw.filledCircle(b.x, b.y, b.r); // Draw a Ball
            }
            
            // SHOW
            StdDraw.show(20);
        }
    }
}
