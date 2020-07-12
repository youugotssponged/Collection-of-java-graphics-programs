
import java.awt.Color;

// File: Ball.java 
// Author: Jordan McCann
// Student ID: 23571144
// Purpose: To hold attributes related to a Ball, in conjunction with Portfolio4_task2.java

// Ball Class
public class Ball {
    // Members
    public double x; // X-Position
    public double y; // Y-Position
    public double r; // Radius
    public double vx; // X-Velocity
    public double vy; // Y-Velocity
    public Color col; // Colour associated with the ball
    
    
    /**
     * Empty Ball Constructor with Debug Message
     */
    public Ball(){
        // Print Debug Message
        System.out.println("A Ball has been created");
    }
    
    /**
     * Ball Constructor with Params
     * @param x  X Position to be set
     * @param y  Y position to be set
     * @param vx  X velocity to be set
     * @param vy  Y velocity to be set
     * @param r  Radius to be set
     * @param col Colour to be set
     */
    public Ball(double x, double y, double vx, double vy, double r, Color col){
        // Set attributes
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = vx;
        this.vy = vy;
        this.col = col;
        
        // Print debug message
        System.out.println("A Ball has been created");

    }
}
