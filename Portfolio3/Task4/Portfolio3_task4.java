// File: Portfolio3_Task4.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To utilise Java's Graphic's 2D concepts for constructing complex shapes
//          such as Unions, Differences, Intersections and ExclusiveOr's of combined shapes.
public class Portfolio3_task4 {
    public static void main(String[] args){
        
        // Set the canvas size and scale
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setScale(0, 100);
        
        // Call newly declared functions for creating complex shape examples
        StdDraw.drawUnion(35, 40, 50, 60, 60, 60, 60, 90); // Unionised Draw
        StdDraw.drawDifference(140, 40, 160, 60, 60, 60, 50, 50); // Difference
        StdDraw.drawIntersection(220, 40, 240, 60, 60, 60, 50, 50); // Intersected Shape draw
        StdDraw.drawExclusiveOr(300, 40, 315, 55, 60, 60, 60, 90); // ExclusiveOrDraw
        
    }
}
