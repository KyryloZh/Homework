import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        PositivityCheck(num);

        PrimeCheck(num);

        DivideCheck(num);


    }
    static int PositivityCheck(int a) {
        if (a > 0) System.out.println(a+" is a positive number.");
        else if (a < 0) System.out.println(a+" is a negative number.");
        else System.out.println("It's just a zero");
        return a;
    }

    static int PrimeCheck(int a) {
     if (a <= 3){
         if (a >= 1) System.out.println(a+" is a prime number.");
     }
     else if (a % 2 == 0) {
         System.out.println(a+" is not a prime number.");
     }
     else if (a % 3 == 0) {
         System.out.println(a+" is not a prime number.");
     }
     else {
         System.out.println(a+" is a prime number.");
     }
     return a;
    }
    static int DivideCheck(int a) {
        System.out.print("Number "+a+" can be divided by");
        if (a%2 == 0) System.out.print(" 2 ");
        else if (a%3 == 0) System.out.print(" 3 ");
        else if (a%5 == 0) System.out.print(" 5 ");
        else if (a%6 == 0) System.out.print(" 6 ");
        else if (a%9 == 0) System.out.print(" 9 ");


        return a;
    }
}
