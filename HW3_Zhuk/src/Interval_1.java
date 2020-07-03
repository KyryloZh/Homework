import java.util.Scanner;

public class Interval_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");

        int UserNumber = sc.nextInt();
        if (UserNumber < 0) {
            System.out.println("The number is not in the range");}
        else {
            if (UserNumber <=14) {
            System.out.println("[0...14]");}
          else {
            if (UserNumber <= 35) {
                System.out.println("[15..35]");}
            else {
                if (UserNumber <= 49) {
                    System.out.println("[36...49]");}
                else {
                    if (UserNumber <= 100) {
                        System.out.println("[50...100]");}
                    else {
                        System.out.println("The number is not in the range");}
                }
            }
          };
        }
    }
}
