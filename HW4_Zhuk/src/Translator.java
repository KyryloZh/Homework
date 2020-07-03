import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {
        System.out.print("Введіть слово для перекладу: ");

        Scanner in = new Scanner(System.in);

        String Word = in.next();

        switch (Word) {
            case "сонячно":
                System.out.println("сонячно->sunny");
             break;
            case "хмарно":
                System.out.println("хмарно->cloudy");
             break;
            case "туман":
                System.out.println("туман->fog");
                break;
            case "дощ":
                System.out.println("дощить->rain");
                break;
            case "сніг":
                System.out.println("сніг->snow");
                break;
            case "ожеледь":
                System.out.println("ожеледь->ice");
                break;
            case "вітер":
                System.out.println("вітер->wind");
                break;
            case "холодно":
                System.out.println("холодно->cold");
                break;
            case "жарко":
                System.out.println("жарко->hot");
                break;
            case "опади":
                System.out.println("опади->precipitation");
                break;
            default:
                System.out.println("Це ти що таке написав?");
        }
    }
}
