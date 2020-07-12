// File: Portfolio1_Task2.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To Draw the phrase "Hello World" using 2D Primatives

public class Portfolio1_Task2 {
    public static void main(String[] args){
        // HELLO WORLD USING 2D PRIMITAVES
        
        // Sizing the window to allow enough space 
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setScale(0, 2);
        
        // H 
        StdDraw.line(0.1, 0.1, 0.1, 0.2);
        StdDraw.line(0.1, 0.15, 0.15, 0.15);
        StdDraw.line(0.15, 0.2, 0.15, 0.1);
       
        // E
        StdDraw.line(0.2, 0.2, 0.2, 0.1);
        StdDraw.line(0.2, 0.2, 0.25, 0.2);
        StdDraw.line(0.2, 0.15, 0.25, 0.15);
        StdDraw.line(0.2, 0.1, 0.25, 0.1);
        
        // L
        StdDraw.line(0.3, 0.1, 0.3, 0.2);
        StdDraw.line(0.3, 0.1, 0.35, 0.1);
        
        // L
        StdDraw.line(0.4, 0.1, 0.4, 0.2);
        StdDraw.line(0.4, 0.1, 0.45, 0.1);
        
        // O
        StdDraw.circle(0.55, 0.15, 0.06);
        
        
        // W
        StdDraw.line(0.75, 0.1, 0.7, 0.25);
        StdDraw.line(0.75, 0.1, 0.8, 0.25);
        StdDraw.line(0.8, 0.25, 0.85, 0.1);
        StdDraw.line(0.85, 0.1, 0.9, 0.25);
        
        // O
        StdDraw.circle(0.95, 0.15, 0.06);
        
        // R
        StdDraw.line(1.05, 0.1, 1.05, 0.25);
        StdDraw.line(1.05, 0.25, 1.15, 0.25);
        StdDraw.arc(1.15, 0.20, 0.05, 0, 90);
        StdDraw.line(1.1, 0.2, 1.2, 0.2);
        StdDraw.line(1.1, 0.2, 1.2, 0.1);
        
        // L
        StdDraw.line(1.25, 0.1, 1.25, 0.25);
        StdDraw.line(1.25, 0.1, 1.35, 0.1);
        
        // D
        StdDraw.line(1.4, 0.1, 1.4, 0.3);
        StdDraw.arc(1.4, 0.20, 0.1, 270, 90);
    }
}
