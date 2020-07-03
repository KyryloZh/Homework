import java.sql.SQLOutput;

public class CustomerArray {
    public static void main(String[] args) {
        int CustomerArray [] =  {12, 35, -7, -12, 5, 44, 0};
        int max = CustomerArray[0], min = CustomerArray[0], sum = 0, arith = 0;

        for (int j = 0; j < CustomerArray.length; j++) {
            if (CustomerArray[j] > max)
                max = CustomerArray[j];

            if (CustomerArray[j] < min)
                min = CustomerArray[j];

            sum += CustomerArray[j];
        }
        arith = sum / CustomerArray.length;

        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        System.out.println("The sum of the elements is " + sum);
        System.out.println("The arithmetic mean is " + arith);
        System.out.print("All uneven numbers here are ");
        for (int l = 0; l < CustomerArray.length; l++) {
            if (CustomerArray[l] % 2 == 0)
                System.out.print(l + " ");

        }
    }
}
/*Створити масив розміром N елементів, заповнити його довільними цілими значеннями (розмір масиву задає користувач).
Вивести на екран: найбільше значення масиву, найменше значення масиву, загальну суму всіх елементів,
середнє арифметичне всіх елементів, вивести всі непарні значення.*/
