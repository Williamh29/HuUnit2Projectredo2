public class LinearEquation {
    private int x1;
    private int x2;
    private int y1 ;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
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
        double slope = ((double)(y2 - y1)) / (x2 - x1); //Slope
        slope = roundedToHundredth(slope);
        return slope;
    }
    public String equation() {

        //if slope is 0, return y = y-intercept

        int rise = (y2 - y1);
        int run = (x2 - x1);
        String equation = "";
        // logic to build equation   // "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept();  // y = 5/6x + 5.75
        int xDiff = x2 - x1;
        int yDiff = y2 - y1;
        if (yDiff % xDiff == 0 ) {
            int wholeNum = yDiff / xDiff;
            return "y = " + wholeNum + "x + " + yIntercept();
        } else {
            //int fractionNum = yDiff / xDiff;
            if (xDiff < 0) {
                xDiff *= -1;
                yDiff *= -1;
                return "y = " + yDiff + "/" + xDiff + "x + " + yIntercept();
            } else {
                return "y = " + yDiff + "/" + xDiff + "x + " + yIntercept();
            }
        }

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


