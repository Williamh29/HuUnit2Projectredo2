public class LinearEquation {
    private int x1;
     private int x2;
     private int y1 ;
     private int y2;

     public LinearEquation(int x1, int y1, int x2, int y2) {
         this.x1 = x1;
         this.y1 = y2;
         this.x2 = x2;
         this.y2 = y2;
     }
     public double distance() {
         return roundedToHundredth (Math.sqrt((Math.pow((x2-x1), 2))+ (Math.pow((y2-y1), 2)))); // square root of a^2 + b^2 is hypotenuse c.
     }
     public double yIntercept() {
        double yint = y2 - slope() * x2;
        return yint;
     }

     public double slope() {
         double rise = (y2 - y1);
         double run = (x2 - x1);
         double slope = ((double) rise/run);
         return slope;
     }
     public String equation() {
        return "y = " + (y2 - y1) + "/" + (x2 - x1) + " + y-intercept" ;
     }

     public String coordinateForX(double xValue) {
         double y = slope() * xValue + yIntercept() ;
         return "(" + xValue + ", " + y + ")";
     }

     public double roundedToHundredth(double toRound) {
         return Math.round (toRound * 100.0) / 100.0;

     }
     public String lineInfo() {
        String s = "Your points are: (" + x1 + ", " + y1 + ")\n";
        s += "The slope is: " + slope() + "\n";
        s += "The y-intercept is: " + yIntercept() + "\n";
        s += "The equation is: " + equation() + "\n";
        // distance
        return s;
     }


}
