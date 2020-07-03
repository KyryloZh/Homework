import java.util.Scanner;

public class NumbersCheckAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        PrimeCheck(num);

    }

    static int PrimeCheck(int a) {
        int counter = 0;
        int res = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
            counter++;}
        }
        if (counter <= 2)
            System.out.println(a+" is a prime number.");
        else System.out.println(a+" is not a prime number.");


        return a;
    }
}