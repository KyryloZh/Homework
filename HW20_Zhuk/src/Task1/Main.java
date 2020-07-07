package Task1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regex = "^(\\D)([^aieou])([^bcDF])(\\S)([^AEIOU])([^.,])$";
        String S;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a string to match: ");
        S = sc.next();

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(S);

        if (m.matches() == true){
            System.out.println("String " + S + " matches the pattern.");
        }
        else {
            System.out.println("String " + S + " doesn't match the pattern.");
        }
    }
}
