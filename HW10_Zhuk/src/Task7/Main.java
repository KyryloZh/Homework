package Task7;

public class Main {
    public static void main(String[] args) {
        Address test = new Address();
        test.setIndex("87531");
        test.setCountry("Ukraine");
        test.setCity("Mariupol");
        test.setStreet("Main st.");
        test.setHouse("34");
        test.setApartment("12");

        System.out.println("Index: " + test.getIndex());
        System.out.println("Country: " + test.getCountry());
        System.out.println("City: " + test.getCity());
        System.out.println("Street: " + test.getStreet());
        System.out.println("House: " + test.getHouse());
        System.out.println("Apartment: " + test.getApartment());
    }
}
