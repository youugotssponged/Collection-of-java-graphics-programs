// File: Portfolio1_Task3.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To Draw a car that has been given as part of the Portfolio 1 brief
//          Along with features such as windows, antenna etc.

public class Portfolio1_Task3 {
    public static void main(String[] args){
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setScale(0, 2);
        
        
        StdDraw.line(0.3, 0.7, 0.6, 0.7); // Bonnet
        StdDraw.line(0.3, 0.7, 0.3, 0.5); // Front
        StdDraw.line(0.3, 0.5, 0.5, 0.5); // Bonnet-under
        StdDraw.line(0.6, 0.7, 0.8, 0.9); // Windshield
        StdDraw.line(0.8, 0.9, 1.3, 0.9); // Roof
        
        // Front Wheel
        StdDraw.circle(0.58, 0.5, 0.08);
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledCircle(0.58, 0.5, 0.065);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0.58, 0.5, 0.045);
        
        // Chasis
        StdDraw.line(0.66, 0.5, 1.25, 0.5);
        
        // Back Wheel
        StdDraw.circle(1.33, 0.5, 0.08); 
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledCircle(1.33, 0.5, 0.065);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(1.33, 0.5, 0.045);
        
        // Back door
        StdDraw.arc(1.3, 0.7, 0.2, 20, 90);
        StdDraw.line(1.41, 0.5, 1.6, 0.5);
        StdDraw.line(1.6, 0.5, 1.4835, 0.78);
        
        // EXTRA FEATURES
        
        // ANTENNA
        StdDraw.line(0.9, 0.9, 0.9, 1.0);
        StdDraw.filledCircle(0.9, 1.0, 0.025);
        
        // WINDOWS
        StdDraw.line(0.7, 0.7, 0.8, 0.9);
        StdDraw.line(1.0, 0.7, 1.0, 0.9);
        StdDraw.line(0.7, 0.7, 1.3, 0.7);
        StdDraw.line(1.3, 0.7, 1.3, 0.9);
        
    }
}
