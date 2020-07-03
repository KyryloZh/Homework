package Task4;

public class Rectangle {
    private double side1, side2;

    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public static double areaCalculator (double side1, double side2){
        double area = side1 * side2;
        return area;
    }

    public static double perimeterCalculator (double side1, double side2){
        double perimeter = (side1 + side2) * 2;
        return perimeter;
    }
}




/*    Використовуючи IDEA, створіть проект c пакетом. Потрібно: Створити клас з ім'ям Rectangle. У тілі класу
        створити два поля, що описують довжини сторін double side1, double side2. Створити два методи, які
        обчислюють площу прямокутника - double areaCalculator (double side1, double side2) і периметр
        прямокутника - double perimeterCalculator (double side1, double side2). Написати програму, яка
        приймає від користувача довжини двох сторін прямокутника і виводить на екран периметр і
        площу.*/
