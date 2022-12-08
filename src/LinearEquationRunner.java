import java.util.Scanner;
public class LinearEquationRunner {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter coordinate 1:");
        String coordinate1 = scan.nextLine();
        int firstNum = coordinate1.length();
        int comma = coordinate1.indexOf(",");
        String x1 = coordinate1.substring(1, comma);
        int x1int = Integer.parseInt(x1);
        String y1 = coordinate1.substring(comma + 1, coordinate1.indexOf(")"));
        int y1int = Integer.parseInt(y1);

        // SECOND COORDINATE
        System.out.print("Enter coordinate 2:");
        String coordinate2 = scan.nextLine();
        String x2 = coordinate2.substring(1, comma);
        int x2int = Integer.parseInt(x2);
        String y2 = coordinate2.substring(comma + 1, coordinate1.indexOf(")"));
        int y2int = Integer.parseInt(y2);



        if (x1int == x2int) {
            System.out.println("Vertical line, x = " + x1int);
            System.out.println("Please choose a different x coordinate.");
            // if the user enters two points that would create a vertical line,
            // (5, 7) and (5, 10), then print "vertical line, x = 5" and end the program
        } else {
            // create our LinearEquation object with x1, y1, x2, y2, which were parsed from the user's input
            // object is named equation
            LinearEquation equation = new LinearEquation(x1int, y1int, x2int, y2int);
            System.out.println("");
            System.out.println("----- Line Info -----");


            System.out.println(equation.lineInfo());

            System.out.println();

            // ask user to enter an X
            System.out.println("Enter an X value");
            int xValue = scan.nextInt();


            // they enter an x value
            System.out.println("Coordinate for x: " + equation.coordinateForX(xValue));

            // call the coordinateforx  method and print the returned string
        }

        // end of your program

    }
}
