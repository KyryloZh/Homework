import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of clients you'd like to send packages to: ");

        int clients = sc.nextInt();
        int cars = 1;

        for (int i = clients; i > 0; i--){
        cars *= clients--;
        }

        System.out.println("You have " + cars + " delivery routes");
    }
}
