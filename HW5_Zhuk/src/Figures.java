public class Figures {
    public static void main(String[] args) {
        // 1. Прямокутник
        int heights = 6;
        int width = 6;

/*        for (int a = 0; a < heights; a++) {
            for (int b = 0; b < width; b++) {
                System.out.print("*");
            }
            System.out.print("\n");*/


//  2. Прямокутний трикутник
/*        for (int c = 0; c < heights; c++) {
            for (int d = 0; d < c+1; d++) {
                 System.out.print("*");
            }
            System.out.println();

            }*/

//  3. Рівносторонній трикутник(рівнобедрений)
/*        for (int e = 1; e <= heights; ++e) {
            for (int f = heights; f > e; --f)
                System.out.print(" ");

            for (int g = 1; g < 2 * e; ++g)
                System.out.print("*");


            System.out.println();
        }*/

        // 4. Ромб
        for (int e = 0; e < heights; ++e) {
            for (int f = heights; f > e; --f)
                System.out.print(" ");

            for (int g = 1; g < 2 * e; ++g)
                System.out.print("*");


            System.out.println();
        }
        for (int e = heights; e > 0; e--) {
            for (int f = heights; f > e; f--)
                System.out.print(" ");
            for (int g = 2 * e; g > 1; --g)
                System.out.print("*");

            System.out.println();
        }
    }
}





