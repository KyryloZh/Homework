package Task1;

public class Map {
    private String city;
    private String size;
    private String street;
    private String house;

    public Map(){}
    public Map(String city, String street, String house){
        this.city = city;
        this.street = street;
        this.house = house;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
