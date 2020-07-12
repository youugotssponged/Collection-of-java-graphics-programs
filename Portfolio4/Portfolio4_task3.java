// File: Portfolio4_Task3.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To draw spaced out text in a circular form 
//          and manipulate the text via rotation

public class Portfolio4_task3 {
    
    // Data
    // Holds the message given as part of the portfolio4 task 3 brief - "COMPUTER GRAPHICS"
    public static char[] message = new char[]{
        ' ', 
        'r', 'e', 't', 'u', 'p', 'm', 'o', 'C', 
        ' ', 
        'G', 'r', 'a', 'p', 'h', 'i', 'c', 's'
    };
    
    
    // Modified drawPlottedCircle function from 
    // Portfolio 3 task 2
    
    /**
     * DrawPlottedText
     * 
     * Draws Given Text in a circular format
     * 
     * @param xc  Centre X position
     * @param yc  Centre Y position
     * @param n  Number of elements to be drawn
     * @param r  Radius
     * @param msg  Message to be used 
     * @param startAngle  Starting Angle
     * @param rotation   Rotation
     */
    public static void DrawPlottedText(int xc, int yc, int n, int r, char[] msg, double startAngle, double rotation){
        // For each step
        for(int i = 0; i <= n - 1; i++){
            // Find the angle
            double angle = i * startAngle + rotation;
            
            // Find the coordinates based on the angle t
            // Rounding for precision
            double x = Math.round(xc + r * Math.cos(angle));
            double y = Math.round(yc + r * Math.sin(angle));
            
            // Convert the character to a string for use with StdDraw.text as it requires a string param
            String conversion = Character.toString(msg[i]);
            
            // Draw the point
            StdDraw.text(x, y, conversion);
        }
    }
    
    
    public static void main(String[] args){
        // Set window scaling
        StdDraw.setScale(0, 600);
        
        double _360toRadians = (2*Math.PI); // Java requires radians instead of degrees
        double angle = _360toRadians / message.length; // 360 / number of points e.g. 360 / 20 = 18 degrees per point
        double rotation = 0; // rotation to be applied
        
        boolean isClockwise = true; // Used to switch between Clockwise and anti-clockwise modes
        
        
        // Animation loop
        while(true){
            
            // Clockwise
            if(isClockwise) rotation -= Math.toRadians(angle); // converts to radians
            // Anti-clockwise
            else rotation += Math.toRadians(angle); // converts to radians
            
            // Clear screen
            StdDraw.clear(StdDraw.WHITE);
            
            // Run Plotting function to draw the circle
            DrawPlottedText(300, 300, message.length, 200, message, angle, rotation);
            
            // Show every 10ms
            StdDraw.show(10);
        }
    }
}
