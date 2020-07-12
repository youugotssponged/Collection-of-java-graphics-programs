// File: Portfolio2_Task1.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To implement a working bruteforced Line draw algorithm to draw
//          lines, with given inputs.

public class Portfolio2_task1 {
    /**
     * Line Draw using the brute forced algorithm
     * @param x1    : point 1
     * @param x2    : point 2
     * @param m     : slope
     * @param c     : Y-Intercept
     */
    public void lineDraw_BF(double x1, double x2, double m, double c){
        // Loop from point one, through to point two
        // (start point, end point)
        for(double x_ = x1; x_ <= x2; x_++){ 
            double y = (m * x_) + c; // Calculate the Y
            // Plot point, round Y coord for accuracy
            StdDraw.point(x_, Math.round(y)); 
        }
    }
    
    public static void main(String[] args){
        // New instance of this class to access the newly
        // Implemented Brute forced line draw function
        Portfolio2_task1 t1 = new Portfolio2_task1();
        
        // Set up suitable screensize and scale
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setScale(0, 600);
        
        // Set Pet colour to something much more visible.
        StdDraw.setPenColor(StdDraw.RED);
        
        // Incremental slope
        // using the bruteforced line draw algorithm
        t1.lineDraw_BF(0.0, 500.0, 0, 10.0);        // 0
        t1.lineDraw_BF(0.0, 500.0, 0.5, 10.0);      // 0.5 
        t1.lineDraw_BF(0.0, 500.0, 1.0, 10.0);      // 1
        t1.lineDraw_BF(0.0, 500.0, 2.0, 10.0);      // 2
        t1.lineDraw_BF(0.0, 500.0, 5.0, 10.0);      // 5
        t1.lineDraw_BF(0.0, 500.0, 10.0, 10.0);     // 10
        
    }
}
