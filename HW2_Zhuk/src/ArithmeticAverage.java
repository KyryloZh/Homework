
public class ArithmeticAverage {
    public static void main(String[] args) {
        int a = 1,b = 6,c = 7;
          float sum = a+b+c;
            float ArithmeticAverage = sum/3;
    System.out.println(ArithmeticAverage);
    /* Проблема вывода - отображается число без остатка (4 вместо 4,333...).
       Чинится переводом sum и ArithmeticAverage во float
     */
    }

}
