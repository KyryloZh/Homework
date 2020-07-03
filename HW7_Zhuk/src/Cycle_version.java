public class Cycle_version {
    static int calculate(int a, int b) {   // a = 30, b = 18
        int c = 0, res = 1;
        for (int i = 0; i < res; i++) {
            if (a % b == 0) {
                res = i;
            } else {
                c = a % b;
                b = c;
                res++;
            }

        }
        return c;
    }


    public static void main(String[] args) {
        int a = 3676, b = 676;
        System.out.println("The greatest common factor for " + a + " and " + b + " is " + calculate(a, b) + ";");
    }
}

