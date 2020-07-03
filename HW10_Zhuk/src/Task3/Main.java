package Task3;

public class Main {
    public static void main(String[] args) {

    Car Jaguar = new Car (2004, 243.00, "black");
    Car RollsRoyce = new Car (2009);
    Car Mazda = new Car ("blue", 2042);
    Car Tesla = new Car (2008, 314.00,1182, "white");
    Car Zhiguli = new Car();

        System.out.println("Year: " + Jaguar.year + "; speed: " + Jaguar.speed +"; weight: " + Jaguar.weight +
                "; color: " + Jaguar.color);
        System.out.println("Year: " + RollsRoyce.year + "; speed: " + RollsRoyce.speed +"; weight: "
                + RollsRoyce.weight + "; color: " + RollsRoyce.color);
        System.out.println("Year: " + Mazda.year + "; speed: " + Mazda.speed +"; weight: " + Mazda.weight +
                "; color: " + Mazda.color);
        System.out.println("Year: " + Tesla.year + "; speed: " + Tesla.speed +"; weight: " + Tesla.weight +
                "; color: " + Tesla.color);
        System.out.println("Year: " + Zhiguli.year + "; speed: " + Zhiguli.speed +"; weight: " + Zhiguli.weight +
                "; color: " + Zhiguli.color);
    }
}
