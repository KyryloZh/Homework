public class Volume {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double R = 6,h = 10;
          double R_squared = Math.pow(R,2);
          double V = PI * R_squared * h;

        System.out.println(V);

          double sum = R + h;
          double S = 2 * PI * R * sum;
        System.out.println(S);

    }
}
// Почему-то результат V отличается от онлайн калькуляторов (1130.9733)