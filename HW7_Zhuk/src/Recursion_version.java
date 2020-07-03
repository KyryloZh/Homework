public class Recursion_version {

    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calculate (b, a%b);
    }

    public static void main(String[] args) {
        System.out.println("The greatest common factor of ");

        int a = 676, b = 3676;

        System.out.println("a= " + a + ", b = " + b + ", GCM = " + calculate(a,b) + ";");

    }
}
