// File: Portfolio2_Task5.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To implement Bresenhams Line draw Algorithm that 
//          draws points using integers as opposed to floats

public class Portfolio2_task5 {
    
    /**
     * Bresenham's Line Draw Algorithm
     * @param x1 x-coordinate of the starting point 
     * @param y1 y-coordinate of the staring point
     * @param x2 x-coordinate of the ending point
     * @param y2 y-coordinate of the ending point
     */
    public void BLD(int x1, int y1, int x2, int y2){
        int deltaY = (y2 - y1); // Calculate the difference between Y in both points
        int deltaX = (x2 - x1); // Calculate the difference between X in both points
        
        int X = x1; // X coord of point 1
        int Y = y1; // Y coord of point 2
        
        int D = 2 * deltaY - deltaX; // Difference
        
        int deltaE = 2 * deltaY; // change in East
        int deltaNE = 2 * (deltaY - deltaX); // Change in North East
        
        StdDraw.point(X, Y); // Plot point
        
        X += 1; // Increment X coord
        
        // While the current (x1) coord is less than x2
        while(X < x2){
            // If the difference is Negative
            if(D < 0){ 
                D = D + deltaE; // add deltaE to the difference
            }
            // If the difference is positive
            else{ 
                D = D + deltaNE; // Add deltaNE to the difference
                Y += 1; // Increment Y coord
            }
            StdDraw.point(X, Y); // Plot point
            X += 1; // Increment X coord
        }
    }
    
    public static void main(String[] args){
        // New instance of this class to access the newly
        // Implemented Brute forced line draw function
        Portfolio2_task5 t4 = new Portfolio2_task5();
        
        // Set up suitable screensize and scale
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setScale(0, 200);
     
        // Draw both coord sets from the previous task. (as integer)
        t4.BLD(10, 10, 40, 30); // = Vector2(10, 10), Vector2(40, 30)
        t4.BLD(10, 10, 40, 90); // = Vector2(10, 10), Vector2(40, 90)
        
    }
}
