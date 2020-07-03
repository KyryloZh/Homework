public class UserArray {
    public static void main(String[] args) {
        int test_array[] = {1,3,5,7,8,9};
        Adding(test_array);
        newValue(test_array, 5);

    }

    static int[] Adding (int[] arrayA){
        int arrayB[] = new int [arrayA.length + 1];
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }
        for (int iter : arrayB)
            System.out.print(iter + " ");
        System.out.println("\n");
        return arrayB;
    }

    static int[] newValue (int[] arrayA, int value){
        int arrayB[] = new int [arrayA.length + 1];
        arrayB[0] = value; //есть ли более элегантный вариант это реализовать? мне кажется что выглядит криво
        for (int i = 1; i <= arrayA.length; i++) {
            arrayB[i] = arrayA[i-1];
        }
        for (int iter : arrayB)
            System.out.print(iter + " ");
        return arrayB;
    }
 }
