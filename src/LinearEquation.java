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

     }
     public double slope() {
         double rise = (y2 - y1);
         double run = (x2 - x1);
         double slope = (rise/run);
         return
     }
     public String equation() {

     }
     public String coordinateForX(double xValue) {

     }
     public double roundedToHundredth(double toRound) {
         return Math.round (toRound * 100.0) / 100.0;

     }
     public String lineInfo() {

     }


}
