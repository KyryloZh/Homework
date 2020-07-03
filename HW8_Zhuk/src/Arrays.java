public class Arrays {
    public static void main(String[] args) {
        int a = 10;
        int testArray[] = new int[a];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i + 1;
        }
        for (int i = a - 1; i >= 0; i--) {
            System.out.println(testArray[i]);
        }
    }
}
