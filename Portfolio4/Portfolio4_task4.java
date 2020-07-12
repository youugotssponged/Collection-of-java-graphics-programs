
public class Portfolio4_task4 {
    
    // Draw Data
    public static double clockRadius = 200;
    public static double hourHandX = 300;
    public static double hourHandY = 410;
    
    public static double minuteHandX = 300;
    public static double minuteHandY = 480;
    
    public static double secondHandX = 300;
    public static double secondHandY = 350;
    
    public static int minuteSections = 60;
    public static int hourSections = 12;
    
    public static double centre = 300;
    
    // Timing Data
    public static int minutes = 60; // STARTS AT 60 as it gets reset to 0 on the 60th
    public static int seconds = 60; // STARTS AT 60 as it gets reset to 0 on the 60th 
    public static int hours = 12; // STARTS AT 12 as it gets reser to 0 on the 12th 
    
    // Using a modified version of the Portfolio 3 task 3 Plotted Circle Function
    /**
     * Draw Plotted Circle
     * 
     * Draws a circle using spread out plot points
     * @param xc    - Centre X
     * @param yc    - Centre Y
     * @param n     - Number of plot points
     * @param r     - Radius Size
     */
    public static void DrawPlottedCircle(double xc, double yc, int n, double r){
        
        // For every point
        for(int i = 0; i <= n - 1; i++){
            // Find the angle
            double t  = i * (2 * Math.PI) / n;
            
            // Find the coordinates based on the angle t
            // Rounding for precision
            double x = Math.round(xc + r * Math.cos(t));
            double y = Math.round(yc + r * Math.sin(t));
            
            // Draw the point
            StdDraw.point(x, y);
        }
    }

    public static void main(String[] args){
        StdDraw.setScale(0, 600);
        
        
        // Animation loop
        while(true){
            
            // LOGIC
            // SECONDS
            if(seconds >= 0){
                // RESET
                if(seconds == 60){ 
                    seconds = 0;
                    
                    if(minutes == 60){
                        minutes = 0;
                        
                        // CALCULATE
                        double hoursAngle = Math.toRadians((360 / 12) * hours);
                        hourHandX = Math.round(centre + (clockRadius - 60) * Math.sin(hoursAngle));
                        hourHandY = Math.round(centre + (clockRadius - 60) * Math.cos(hoursAngle));

                        hours++;
                    }
                    
                    // CALCULATE
                    double minutesAngle = Math.toRadians((360 / 60) * minutes);
                    minuteHandX = Math.round(centre + (clockRadius - 30) * Math.sin(minutesAngle));
                    minuteHandY = Math.round(centre + (clockRadius - 30) * Math.cos(minutesAngle));
                                    
                    minutes++;
                }
                
                // CALCULATE
                double secondsAngle = Math.toRadians((360 / 60) * seconds);
                secondHandX = Math.round(centre + clockRadius * Math.sin(secondsAngle));
                secondHandY = Math.round(centre + clockRadius * Math.cos(secondsAngle));
                
                seconds++;
                
            }
            
            StdDraw.clear(StdDraw.WHITE);
            
            // Draw Hour Faces
            StdDraw.setPenRadius(0.04);
            DrawPlottedCircle(300, 300, hourSections, clockRadius);
            
            // Draw Minute Faces
            StdDraw.setPenRadius(0.01);
            DrawPlottedCircle(300, 300, minuteSections, clockRadius);
            
            // Hour hand
            StdDraw.setPenRadius(0.025);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(300, 300, hourHandX, hourHandY);
            
            // Minute Hand
            StdDraw.setPenRadius(0.015);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(300, 300, minuteHandX, minuteHandY);
            
            // Second Hand
            StdDraw.setPenRadius(0.007);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(300, 300, secondHandX, secondHandY);
           
            
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.show(1000);
        }
        
    }
}
