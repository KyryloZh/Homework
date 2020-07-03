package Task2;

public class Ship extends Vehicle {
    int numOfPassengers;
    String port;

    public Ship(){}

    public Ship (int price, int speed, int modelYear, int numOfPassengers, String port){
        super(price, speed, modelYear);
        this.numOfPassengers = numOfPassengers;
        this.port = port;
    }
}
