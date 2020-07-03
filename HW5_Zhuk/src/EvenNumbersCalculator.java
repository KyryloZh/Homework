/*4. Написати програму, яка зчитує введені користувачем числа і рахує суму парних чисел і непарних.
        Програма працює до тих пір, поки користувач не введе 0.*/

import java.util.Scanner;

public class EvenNumbersCalculator {
    public static void main(String[] args) {
        int res = 0, res2 = 0;
        Scanner one = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = one.nextInt();

        Scanner two = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int secondNum = two.nextInt();

        for (int i = firstNum; i <= secondNum; i++) {

            if (firstNum == 0) {
                System.out.println("Please enter a positive first number.");
                break;
            }

            else if (firstNum % 2 == 0) {
                int c = firstNum;
                int d = res;
                res = c + d;
                firstNum += 1;
            }
            else {
                int e = firstNum; int g = res2;
                res2 = e + g;
                firstNum += 1;

            }
        }
        System.out.println("The sum of even numbers is " + res);
        System.out.println("The sum of uneven numbers is " + res2);

        }

    }

