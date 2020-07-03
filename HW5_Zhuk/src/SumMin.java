public class SumMin {
    public static void main(String[] args) {
       //Дано два числа A і B (A < B) виведіть суму всіх чисел, розташованих між даними числами на екран.

//        int a = 5;
//        int b = 10;
//        int result = 0;
//
//        for (int num = ++a; num < b; num++){
//            result += num;
//        }
//        System.out.println(result);

        //Дано два числа A і B (A < B) виведіть всі непарні значення, розташовані між даними числами.
        int a = 5;
        int b = 12;
        int result = 0;

        for (int num = ++a; num < b; num++){
            if (num%2!=0){
                System.out.println(num);
            }
    }


    }

}
