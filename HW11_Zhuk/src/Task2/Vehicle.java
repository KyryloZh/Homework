package Task2;

public class Vehicle {
    protected int price;
    protected int speed;
    protected int modelYear;

 public Vehicle(int price, int speed, int modelYear){
        this.price = price;
        this.speed = speed;
        this.modelYear = modelYear;
 }

 public Vehicle(){
 }

}


    /*
        Створити клас Vehicle.
        У тілі класу створіть поля: координати і параметри засобів пересування (ціна, швидкість, рік
        випуску).
        Створіть 3 похідних класу Plane, Саг і Ship.
        Для класу Plane повинна бути визначена висота і кількість пасажирів.
        Для класу Ship - кількість пасажирів і порт приписки.
        Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
*/