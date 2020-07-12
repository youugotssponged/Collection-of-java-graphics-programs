// File: Portfolio2_Task6.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To implement circle drawing via the 8-way symmetry algorithm

public class Portfolio2_task6 {

    /**
     * Draw8wayCircle
     * 
     * @param xCentre X coordinate to begin drawing from
     * @param yCentre Y coordinate to begin drawing from
     * @param radius  the radius of the circle
     */
    public static void Draw8wayCircle(double xCentre, double yCentre, double radius){
        // For every point in the radius
        for(double x = 0; x < radius; x++){
            double y = Math.sqrt((radius * radius) - (x * x)); // Calculate
            
            // Draw each of the 8 points from the lecture slides
            StdDraw.point(x + xCentre, y + yCentre); // X, Y
            StdDraw.point(y + xCentre, x + yCentre); // Y, X
            StdDraw.point(y + xCentre, -x + yCentre); // Y, -X
            StdDraw.point(x + xCentre, -y + yCentre); // X, -Y
            StdDraw.point(-x + xCentre, -y + yCentre); // -X, -Y
            StdDraw.point(-y + xCentre, -x + yCentre); // -Y, -X
            StdDraw.point(-y + xCentre, x + yCentre); // -Y, X
            StdDraw.point(-x + xCentre, y + yCentre); // -X, Y
        }  
    }
   
    public static void main(String[] args){
        
        // Set Scaling
        StdDraw.setScale(0, 200);
        
        // Draw 3 Circles using the implemented algorithm with different a different radius for each
        Portfolio2_task6.Draw8wayCircle(100, 60, 35);
        Portfolio2_task6.Draw8wayCircle(100, 60, 45);
        Portfolio2_task6.Draw8wayCircle(100, 60, 55);
         
    }
}
