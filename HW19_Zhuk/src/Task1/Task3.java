package Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String text = "Follow Developers Toolkit Getting Started with IPLA 72 SDK.pdf document (included into the devseat package) to install and run the following projects (included into the devseat package)";
        String[] textArray = new String [2];
        int half = text.length() / 2;
        textArray[0] = text.substring(0, half);
        textArray[1] = text.substring(half);

        for (String node : textArray){ System.out.println(node); }

        String[] wordsArray1 = textArray[0].split(" ");
        String[] wordsArray2 = textArray[1].split(" ");

        for (int i = 0; i < (wordsArray1.length); i++) {
            System.out.print(wordsArray1[i] + " ");
            System.out.print(wordsArray2[i] + "\n");
        }


    }
}
