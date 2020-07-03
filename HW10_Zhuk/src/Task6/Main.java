package Task6;

public class Main {
    public static void main(String[] args) {
        Computer testObject = new Computer();

        for (int i = 0; i < testObject.counter; i++) {
            Computer test = new Computer();
            testObject.array[i] = test;
        }
    }
}


/*
    икористовуючи IDEA, створіть проект з пакетом.
        Створити клас Computer.
        Створити масив об'єктів в цьому класі  розміром 5 елементів, як поле класу.
        Computers розміром 5. Далі вручну створити 5 об’єктів класу і записати в масив
        (Використовуючи цикл)
*/