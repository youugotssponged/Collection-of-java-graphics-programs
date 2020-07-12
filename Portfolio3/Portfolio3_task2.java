// File: Portfolio3_Task2.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To draw a procedurally generated spaced out plotted circle

public class Portfolio3_task2 {
    
    /**
     * Draw Plotted Circle
     * 
     * Draws a circle using spread out plot points
     * @param xc    - Centre X
     * @param yc    - Centre Y
     * @param n     - Number of plot points
     * @param r     - Radius Size
     */
    public static void DrawPlottedCircle(int xc, int yc, int n, int r){
        // For each step
        for(int i = 0; i <= n - 1; i++){
            // Find the angle
            double t  = i * (2 * Math.PI) / n;
            
            // Find the coordinates based on the angle t
            // Rounding for precision
            double x = Math.round(xc + r * Math.cos(t));
            double y = Math.round(yc + r * Math.sin(t));
            
            // Draw the point
            StdDraw.point(x, y);
        }
    }
    
    public static void main(String[] args){
        
        // Set up window appropriately
        StdDraw.setScale(0, 600);
        
        // Set to a suitable size to show the plot points correctly
        StdDraw.setPenRadius(0.009);
        
        // Draw the circle
        Portfolio3_task2.DrawPlottedCircle(300, 300, 16, 200);    
    }
}
