import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter the sum of money: ");
        int sumMoney = sum.nextInt();

        Scanner rate = new Scanner(System.in);
        System.out.print("Enter the conversion rate: ");
        int convRate = rate.nextInt();

        int result = Conversion(sumMoney, convRate);
        System.out.println("The result is " + result);

    }

    static int Conversion (int a, int b){
        int result = a * b;
        return result;
    }
}
