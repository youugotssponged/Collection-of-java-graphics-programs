// File: Portfolio5_Task1.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To render both 3D and wire-frame variants of the primitives that are included as part of StdDraw3D

public class Portfolio5_task1 {
    public static void main(String[] args){
        // Set window scaling
        StdDraw3D.setScale(-1, 1);
        
        // Draw Primitives
        StdDraw3D.sphere(-0.9, 0.7, 0, 0.25);
        StdDraw3D.cone(-0.3, 0.7, 0, 0.25, 0.4);
        StdDraw3D.cylinder(0.3, 0.7, 0, 0.15, 0.4);
        StdDraw3D.box(0.8, 0.7, 0, 0.2, 0.2, 0.2);
        StdDraw3D.ellipsoid(1.3, 0.7, 0, 0.2, 0.4, 0.2);
        
        // Draw their wireframes
        StdDraw3D.wireSphere(-0.9, -0.7, 0, 0.25);
        StdDraw3D.wireCone(-0.3, -0.7, 0, 0.25, 0.4);
        StdDraw3D.wireCylinder(0.3, -0.7, 0, 0.15, 0.4);
        StdDraw3D.wireBox(0.8, -0.7, 0, 0.2, 0.2, 0.2);
        StdDraw3D.wireEllipsoid(1.3, -0.7, 0, 0.2, 0.4, 0.2);
        
        // Render to screen
        StdDraw3D.finished();
    }
}
