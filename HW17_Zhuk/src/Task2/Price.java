package Task2;

public class Price implements Comparable {
    private String itemName;
    private String storeName;
    private float price;

    public Price (String itemName, String storeName, float price){
        this.itemName = itemName;
        this.storeName = storeName;
        this.price = price;
    }

    public String getItemName(){ return itemName; }
    public void setItemName(){ this.itemName = itemName; }

    public String getStoreName(){ return storeName; }
    public void setStoreName(){ this.storeName = storeName; }

    public float getPrice(){ return price; }
    public void setPrice(){ this.price = price; }

    @Override
    public int compareTo(Object o) {
        return this.getStoreName().compareTo(((Price)o).getStoreName());
    }

    @Override
    public String toString() {
        return "Product: " +
                "Name = '" + itemName + '\'' +
                ", Store ='" + storeName + '\'' +
                ", price =" + price;
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