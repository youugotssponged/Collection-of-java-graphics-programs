// File: Portfolio3_Task1.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To draw a procedurally generated grid based 
//          off of the number of squares given by the user


public class Portfolio3_task1{
    /**
     * Draw Checker Board
     * 
     * Draws a checker board based on the amount of squares specified
     * @param n             - Number of squares (n-squared)
     * @param square_size   - Size of the squares within the grid
     */
    public static void DrawCheckerBoard(int n, int square_size){
        
        // Overall Canvas size for drawing the squares
        int canvas_size = square_size * n;
        
        // Sets the scale of the canvas based on the amount of squares that was specified
        StdDraw.setScale(0, canvas_size);
        
        // For every row
        for(int row = 0; row <= n - 1; row++){
            // For every column
            for(int col = 0; col <= n - 1; col++){
                int X = col * square_size; // set X
                int Y = row * square_size; // set y
               
                // Odd / Even check to determine the colour of the squares
                if((col + row) % 2 == 0){ 
                    StdDraw.setPenColor(StdDraw.RED);
                } else{
                    StdDraw.setPenColor(StdDraw.BLACK);
                }
               
                // Draw the square
                StdDraw.filledSquare((double)X + 5 , (double)Y + 5, 5);
            }
        }
    }
    
    
    public static void main(String[] args){
        //Portfolio3_task1.DrawCheckerBoard(5, 10);
        //Portfolio3_task1.DrawCheckerBoard(8, 10);
        Portfolio3_task1.DrawCheckerBoard(25, 10);
    }
}
