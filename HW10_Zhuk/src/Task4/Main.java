package Task4;

import java.util.Scanner;

import static Task4.Rectangle.areaCalculator;
import static Task4.Rectangle.perimeterCalculator;

public class Main {
    public static void main(String[] args) {
        Scanner side1 = new Scanner(System.in);
        System.out.print("Enter your rectangle width: ");
        double width = side1.nextDouble();

        Scanner side2 = new Scanner(System.in);
        System.out.print("Enter your rectangle heights: ");
        double heights = side2.nextDouble();

        Rectangle r1 = new Rectangle(width, heights);

        System.out.println("Your rectangle area is " + areaCalculator(width, heights));
        System.out.println("Your rectangle perimeter is " + perimeterCalculator(width, heights));

    }

}
