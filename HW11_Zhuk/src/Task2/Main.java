package Task2;

public class Main {
    public static void main(String[] args) {
        Car Audi = new Car(28500, 240, 2018);
        Plane Mriia = new Plane (9875000, 850, 1989, 18, 650);
        Ship USS_Nimitz = new Ship (1852000, 60, 1972, 1244, "Kitsap");

        System.out.println("Audi");
        System.out.println("Price: " + Audi.price + " USD");
        System.out.println("Speed: " + Audi.speed + " km/h");
        System.out.println("Year: " + Audi.modelYear);

        System.out.println("\nMriia");
        System.out.println("Price: " + Mriia.price + " USD");
        System.out.println("Speed: " + Mriia.speed + " km/h");
        System.out.println("Year: " + Mriia.modelYear);
        System.out.println("Height: " + Mriia.height + " m");
        System.out.println("Capacity: " + Mriia.numOfPassengers + " passengers");

        System.out.println("\nUSS Nimitz");
        System.out.println("Price: " + USS_Nimitz.price + " USD");
        System.out.println("Speed: " + USS_Nimitz.speed + " km/h");
        System.out.println("Year: " + USS_Nimitz.modelYear);
        System.out.println("Homeport: " + USS_Nimitz.port);
        System.out.println("Capacity: " + Mriia.numOfPassengers + " passengers");


    }
}
