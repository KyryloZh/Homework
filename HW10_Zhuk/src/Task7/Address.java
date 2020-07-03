package Task7;

import java.util.Scanner;

public class Address {
    String index, country, city, street, house, apartment;

    public String getIndex() {
        return index;
    }
    public void setIndex (String index){
        this.index = index;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}



/*
Потрібно: Створити клас з ім'ям Address. У тілі класу потрібно створити поля: index, country, city,
        street, house, apartment.
        Для кожного поля, створити метод з двома методами доступу (get, set)
        Створити екземпляр класу Address.
        В поля екземпляра записати інформацію.
        Виведіть на екран значення полів, що описують адресу.*/
