public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0, d = 0;

        for (int i = 0; i < 10; i++) {
            b = a;
            a = c;
            c = a + b;

            System.out.print(c + " ");


        }
            
        }

    }

