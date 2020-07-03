import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter credit amount: ");
        int fullAmount = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the payment amount: ");
        int paidAmount= sc2.nextInt();

        int debtLeft = creditCounter(fullAmount, paidAmount);

        for (int i = 0; i < fullAmount; i++) {

            if (debtLeft > 0) {
                System.out.print("Enter the payment amount: ");
                paidAmount = sc2.nextInt();
                debtLeft = creditCounter(debtLeft, paidAmount);
            }
        }

    }


    public static int creditCounter(int a, int b) {
        int debtLeft = a - b;
        if (debtLeft > 0) {
                System.out.println("The sum left until the credit is paid is " + debtLeft);
            }
        else if (debtLeft == 0) {
                System.out.println("The debt is paid. The man is free to go.");
            }
        else {
            System.out.println("The man has paid too much. Give him back " + (b - a));
        }
        return debtLeft;
    }
}
