import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner xAxis = new Scanner(System.in);
        System.out.print("Enter your rectangle width: ");
        int x = xAxis.nextInt();

        Scanner yAxis = new Scanner(System.in);
        System.out.print("Enter your rectangle height: ");
        int y = yAxis.nextInt();

        for (int i = 0; i < y; i++){
            for ( int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

