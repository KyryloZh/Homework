public class ReversedArray {
    public static void main(String[] args) {
        int testArray[] = {1, 2, 3, 4, 5, 6, 8};

//        ArrayReversing(testArray);
        SubArray(testArray,2, 9);

    }

    public static void ArrayReversing(int[] a) {
        int b[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[a.length-i-1] = a[i];
        }
        for (int iter : b){
            System.out.print(iter + " ");
        }
        }



    static int[] SubArray(int[] arrayA, int index, int count){
        int arrayB [] = new int [count];
        for (int i = 0; i < arrayB.length; i++) {
            if (index > arrayA.length - 1) {
                arrayB[i] = 1;
            }
            else {
                arrayB[i] = arrayA[index];
                index++;
            }
        }
        for (int iter : arrayB){
            System.out.print(iter + " ");
        }

        return arrayB;
    }
}



