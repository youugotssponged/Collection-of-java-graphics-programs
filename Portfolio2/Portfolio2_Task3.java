// File: Portfolio2_Task3.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To implement a working incremental line drawing algorithm


public class Portfolio2_Task3 {
    // Incremental Line Drawing Algorithm
    /**
     * incLineDraw
     * Draws a line from one point to another incrementally
     * @param x1 - Point 1
     * @param x2 - Point 2
     * @param m - Slope
     * @param c - Y-intercept
     */
    public static void incLineDraw(double x1, double x2, double m, double c){
        double y = (m * x1) + c; // Calculate  once using the line equation Y = MX + C
        
        // For every point inbetween x1 and x2
        for(double x = x1; x < x2; x++){
            // Plot point
            StdDraw.point(x, Math.round(y));
            // Add given slope to the Y each iteration
            y += m;
        }
    }
    
    public static void main(String[] args){
        // Setup scale and size appropriately
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setScale(0, 600);
        
        // Draw Lines
        Portfolio2_Task3.incLineDraw(0, 500, 0, 10);
        Portfolio2_Task3.incLineDraw(0, 500, 0.5, 10);
        Portfolio2_Task3.incLineDraw(0, 500, 1, 10);
            
    }
    
}
