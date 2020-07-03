import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner currency = new Scanner(System.in);
        System.out.print("Enter the currency (UAH, USD, EUR): ");
        String cur = currency.next();

        Scanner income = new Scanner(System.in);
        System.out.print("Enter your monthly income: ");
        double inc = income.nextDouble();

        if (inc > 0) {
            switch (cur) {
                case "UAH": {
                    double taxUah = inc * 0.2;  //Высчитываем налог в гривне (20%)
                    System.out.println("Your tax amount is " + taxUah + " UAH");
                    break;
                }
                case "USD": {
                    double taxUsd = inc * 0.2;
                    double taxUsdUah = taxUsd * 27.47; //Переводим в гривну по курсу 27.47
                    System.out.println("Your tax amount is " + taxUsd + " USD or " + taxUsdUah + " UAH");
                    break;
                }
                case "EUR": {
                    double taxEur = inc * 0.2;
                    double taxEurUah = taxEur * 29.95;
                    System.out.println("Your tax amount is " + taxEur + " EUR or " + taxEurUah + " UAH");
                    break;
                }
                default: {
                    System.out.println("Please enter a valid currency: UAH, USD or EUR.");
                }
            }
        }
        else {
            System.out.print("Please enter a positive number.");
        }
    }
}
