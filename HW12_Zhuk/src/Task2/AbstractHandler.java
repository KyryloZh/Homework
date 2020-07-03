package Task2;

public abstract class AbstractHandler {

    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();
}



/*Створіть абстрактний клас AbstractHandler.
У тілі класу створити абстрактні методи void open (), void create (), void change (), void save ().
Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
Написати програму, яка буде виконувати визначення документа і для кожного формату повинні
бути методи відкриття, створення, редагування, збереження певного формату документа.*/