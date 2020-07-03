import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 10, operand2 = 5;

        operand2 = 0;

        System.out.print("We have " + operand1 + " and " + operand2 + ". Enter arithmetic operation sign: ");

        Scanner in = new Scanner(System.in);
        String sign = in.next();

        switch (sign){
            case "+":
                System.out.println("It makes " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("It makes " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("It makes " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("You can't divide by 0, silly");
                } else{System.out.println("It makes " + (operand1 / operand2));}
                break;
           default:
                System.out.println("Stop joking around and enter an arithmetic operation sign!");
                break;

        }
    }

}
