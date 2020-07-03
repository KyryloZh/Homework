import java.sql.SQLOutput;
import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int firstNum = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int secondNum = b.nextInt();

        Scanner c = new Scanner (System.in);
        System.out.print("Enter the operation you would like to perform between the numbers: ");
        String operation = c.next();

        switch (operation){
            case "+":{
                add(firstNum, secondNum);
                break;
            }
            case "-":{
                sub(firstNum, secondNum);
                break;
            }
            case "*":{
                mul(firstNum, secondNum);
                break;
            }
            case "/":{
                if (secondNum == 0){System.out.print("You can't divide by zero");}
                else {div(firstNum, secondNum);}
                break;
            }
        }


    }
    static int add(int a, int b){
        int addRes = a + b;
        System.out.println(a+"+"+b+"="+addRes);
        return addRes;
    }

    static int sub(int a, int b){
        int subRes = a - b;
        System.out.print(a+"-"+b+"="+subRes);
        return subRes;
    }
    static int mul(int a, int b) {
        int mulRes = a * b;
        System.out.print(a+"*"+b+"="+mulRes);
        return mulRes;
    }
    static int div(int a, int b){
        int divRes = a / b;
        System.out.print(a+"/"+b+"="+divRes);
        return divRes;
    };
}
