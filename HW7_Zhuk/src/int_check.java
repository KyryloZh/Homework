/*реалізувати метод, який перевіряє, чи задане значення int має всі однакові цифри (наприклад, 666 або 1111)
 за допомогою рекурсії.*/
import java.util.Scanner;

public class int_check {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc1.nextInt();

        NumCheck(num);
    }

    static void NumCheck (int a) {
        int b = 0, c = 0, counter = 0;

        b = a % 10; a = a / 10; //мне кажется, что есть более элегантное решение и тут и в Иф конструкциях
        c = a % 10; a = a / 10; //но не смог его придумать

        if (a == 0) System.out.println("The digits in the number are the same.");

        if (a % 10 > 0) {
                if (b == c) {
                    NumCheck(a);
                } else System.out.println("The digits in the number are different.");
            }







    }
}
