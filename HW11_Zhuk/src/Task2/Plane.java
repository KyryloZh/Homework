package Task2;

public class Plane extends Vehicle {
    int height;
    int numOfPassengers;

 public Plane(){
 }

 public Plane(int price, int speed, int modelYear, int height, int numOfPassengers){
     super(price, speed, modelYear);
     this.height = height;
     this.numOfPassengers = numOfPassengers;
 }

}



