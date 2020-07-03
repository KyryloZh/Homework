package Task2;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car(int year){                                            //1 variable
    this.year = year;
    }
    public Car(double speed){                                        //1 variable
        this.speed = speed;
    }
    public Car(String color){                                        //1 variable
        this.color = color;
    }
    public Car(int year, double speed){                               //2 variables
        this.year = year;
        this.speed = speed;
    }
    public Car(int year, int weight){                                 //2 variables
        this.year = year;
        this.weight = weight;
    }
    public Car(int year, String color){                               //2 variables
        this.year = year;
        this.color = color;
    }
    public Car(double speed, int weight){                             //2 variables
        this.speed = speed;
        this.weight = weight;
    }
    public Car(double speed, String color){                            //2 variables
        this.speed = speed;
        this.color = color;
    }

    public Car(int year, double speed, int weight){                   //3 variables
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }
    public Car(int year, double speed, String color){                   //3 variables
        this.year = year;
        this.speed = speed;
        this.color = color;
    }
    public Car(int year, int weight, String color){                     //3 variables
        this.year = year;
        this.weight = weight;
        this.color = color;
    }
    public Car(double speed, int weight, String color){                   //3 variables
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }
    public Car(int year, double speed, int weight, String color){     //4 variables
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;

    }
}





/*
Завдання 2
        Використовуючи Intelij IDEA створити проект, пакет.
        (Заново!) Створити клас Car з полями рік (int), швидкість (double), вага (int) колір (String).
        Створити конструктор за замовчуванням, конструктор з 1-м параметром, 2-а, 3-а, 4-а.
        Перевантажити конструктори.
        Створити клас Main, в якому створити екземпляр класу Car з різними параметрами.*/
