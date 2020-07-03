import java.util.Scanner;

public class OneToSeven {
    public static void main(String[] args) {
        int num = 1;
        int num2 = 2;

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i+1; j++)
                System.out.print(j);

            for (int k = 6; k > i; k--)
                System.out.print("*");


            System.out.println();

        }

    }
}
