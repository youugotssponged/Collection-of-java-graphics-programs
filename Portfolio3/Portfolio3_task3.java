// File: Portfolio3_Task3.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To draw procedurally generated lines 
//          between points based off of a probability factor



import java.util.Random; // Using the Random class for random number generation and seeding

public class Portfolio3_task3 {
    
    public static int numberOfPoints = 0; // To Hold the number of points needed plotting
    public static int xpositions[]; // To hold the X-coordinates of the points
    public static int ypositions[]; // To hold the Y-coordinates of the points
    
    
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
        
        numberOfPoints = n; // Sets the internal variable for use elsewhere.
        xpositions = new int[n]; // Initialise array
        ypositions = new int[n]; // Initalise array
        
        // For every point
        for(int i = 0; i <= n - 1; i++){
            // Find the angle
            double t  = i * (2 * Math.PI) / n;
            
            // Find the coordinates based on the angle t
            // Rounding for precision
            double x = Math.round(xc + r * Math.cos(t));
            double y = Math.round(yc + r * Math.sin(t));
            
            xpositions[i] = (int) x; // Insert X coord into array
            ypositions[i] = (int) y; // Insert Y coord into array
            
            // Draw the point
            StdDraw.point(x, y);
        }
    }
    
    /**
     * Plot Lines 
     * 
     * Draws procedurally plotted lines depending on the probability factor
     * 
     * @param probability used to define the probability of drawing a line on a certain point 
     */
    public static void PlotLines(double probability){
        Random r = new Random(); // Random Object for random number generation
        // For every point
        for(int i = 0; i < numberOfPoints; i++){
            int xpos = xpositions[i]; // access the x coordinate of a point
            int ypos = ypositions[i]; // access the y coordinate of a point
            
            // For every point
            for(int j = 0; j < numberOfPoints; j++){
                
                // Generate a random double to compare with the probability factor
                double randomNumber = r.nextDouble();

                // If the random number is less than or equal to the probability factor
                if(randomNumber <= probability){
                    int xpos2 = xpositions[j]; // Access the second point's X coord
                    int ypos2 = ypositions[j]; // Access the second point's Y coord
                    
                    // Draw the line based of the accessed points
                    StdDraw.line(xpos, ypos, xpos2, ypos2);
                }
            }
            
        }
    }
    
    public static void main(String[] args){
        
        // Set up window appropriately
        StdDraw.setScale(0, 600);
        
        // Set to a suitable size to show the plot points correctly
        StdDraw.setPenRadius(0.010);
        
        // Draw the circle
        Portfolio3_task3.DrawPlottedCircle(300, 300, 16, 200);
        StdDraw.setPenColor(StdDraw.GRAY);
        
        // Set smaller pen radius to help differ the lines from the points
        StdDraw.setPenRadius(0.002);
        
        // Draw the generated lines
        
        //Portfolio3_task3.PlotLines(0.25);
        //Portfolio3_task3.PlotLines(0.5);
        Portfolio3_task3.PlotLines(1.0);    
    }
}
