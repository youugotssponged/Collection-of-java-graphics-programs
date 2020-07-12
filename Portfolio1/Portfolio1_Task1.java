// File: Portfolio1_Task1.java
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To Modify currently given code from 
//          the Portfolio 1 brief by adding features such as
//          Rectangles, Ellipses, Circles, Lines, Squares etc.

public class Portfolio1_Task1 {
    public static void main(String[] args){
        // Print out welcome message to console
        System.out.println("Welcome to Computer Graphics and Modelling Module!");
        
        // The display window is scaled to min = 0 and max = 1
        // Draw a square
        // Center x = 0.2, y = 0.2, half length = 0.1
        StdDraw.square(0.2, 0.2, 0.1); 
        
        // Graphics 2D text
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.8, "Welcome to Computer Graphics and Modelling Module!");
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.text(0.5, 0.5, "Our first Graphics 2D program!");
        
        // Modifications for Portfolio 1 task 1
        
        // 3D CUBE WIREFRAME - Using Lines as linkage between the two squares
        StdDraw.line(0.4, 0.4, 0.6, 0.6);
        StdDraw.line(0.4, 0.6, 0.6, 0.4);
        // A resized rectangle is used to demonstrate how it can also be used as a square
        StdDraw.rectangle(0.1, 0.3, 0.1, 0.1);
        // Linkage Lines will be coloured green to help identify them
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(0.2, 0.2, 0.3, 0.1);
        StdDraw.line(0.1, 0.1, 0.0, 0.2);
        StdDraw.line(0.2, 0.4, 0.3, 0.3);
        StdDraw.line(0.0, 0.4, 0.1, 0.3);
        
        // LONE RECTANGLE EXAMPLE
        StdDraw.rectangle(0.5, 0.8, 0.4, 0.1);
        
        // ELLIPSE EXAMPLE - COLOUR ORANGE TO EASILY IDENTIFY IT
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.ellipse(0.5, 0.2, 0.1, 0.2);
        // CURVE EXAMPLE - COLOUR DARK RED TO EASILY IDENTIFY IT
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.arc(0.7, 0.2, 0.1, 30, 90);
        
        // CIRCLE EXAMPLE - COLOUR YELLOW TO EASILY IDENTIFY IT
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.circle(0.8, 0.15, 0.05);
    }
}
