// File: Portfolio2_Task3.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To implement a working Line Draw algorithm that draws between 
//          two given points

public class Portfolio2_task4 {
    
    /**
     * LineDrawTwoPoints
     * @param x1 x-coordinate of the starting point 
     * @param y1 y-coordinate of the staring point
     * @param x2 x-coordinate of the ending point
     * @param y2 y-coordinate of the ending point
     */
    public void LineDrawTwoPoints(double x1, double y1, double x2, double y2){
        double deltaY = (y2 - y1); // Calculate the difference between Y in both points
        double deltaX = (x2 - x1); // Calculate the difference between X in both points
        
        double m_slope = (deltaY / deltaX); // Calculate the slope (M)
        
        double c_y_intercept = y1 - (m_slope * x1); // Calculate C (Y-intercept)
        
        // Loop through from the x coord (start)
        // in point one, to the x coord in point two (end)
        for(double x = x1; x < x2; x++){ 
            double y = (m_slope * x) + c_y_intercept; // Calculate the Y
            StdDraw.point(x, Math.round(y)); // Plot point.
        }
    }
    
    public static void main(String[] args){
        // New instance of this class to access the newly
        // Implemented Brute forced line draw function
        Portfolio2_task4 t3 = new Portfolio2_task4();
        
        // Set up suitable screensize and scale
        StdDraw.setScale(0, 500);
       
        
        // Draw two lines, given from the coursework brief
        // = Vector2(10, 10), Vector2(40, 30)
        t3.LineDrawTwoPoints(10.0, 10.0, 40.0, 30.0);
        // = Vector2(10, 10), Vector2(40, 90)
        t3.LineDrawTwoPoints(10.0, 10.0, 40.0, 90.0);
    }    
}
