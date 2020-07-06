package Task2;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Price> pricelist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String itemName;
        String storeName;
        String userStoreName;
        float price = 0;
        boolean match = false;

        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter description for item No " + (i + 1));
            System.out.print("Item name: ");
            itemName = sc.next();

            System.out.print("Store name: ");
            storeName = sc.next();

            System.out.print("Price: ");
            price = sc.nextFloat();

            Price p = new Price(itemName, storeName, price);
            pricelist.add(p);
        }

        Collections.sort(pricelist);

        System.out.print("Please enter the store name: ");
        userStoreName = sc.next();
        Iterator i = pricelist.iterator();



        while (i.hasNext()) {
            Price priceIterator = (Price) i.next();
            if (priceIterator.getStoreName().equals(userStoreName)) {
                System.out.println(priceIterator.toString());
                match = true;
            }
        }

        if (match == false) {
            try {
                throw new Exception("There are no items from the mentioned store.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }

    }
}




/*Створіть проект, використовуючи IntelliJ IDEA.
Потрібно: Описати клас з ім'ям Price, що містить наступні поля:
 назва товару;
 назва магазину, в якому продається товар;
 вартість товару в гривнях.
Написати програму, що виконує наступні дії:
 введення з клавіатури даних в масив, що складається з двох елементів типу Price (записи повинні
бути впорядковані в алфавітному порядку за назвами магазинів);
 вивід на екран інформації про товари, що продаються в магазині, назва якого(магазину) введено з
клавіатури (якщо такого магазину немає, вивести виняток).*/
