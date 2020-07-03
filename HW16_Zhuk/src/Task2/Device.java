package Task2;

import java.util.Objects;

public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device(String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }    //constructor

    public String getManufacturer(){return manufacturer;}
    public void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}

    public float getPrice(){return price;}
    public void setPrice(float price){this.price = price;}

    public String getSerialNumber(){return serialNumber;}
    public void setSerialNumber(String serialNumber){this.serialNumber = serialNumber;}

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;

        return serialNumber.equals(device.serialNumber);
    }

    @Override
    public String toString(){
        return "Device: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
    }
}

class Monitor extends Device {
    protected int resolutionX, resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;


    }

    public String getManufacturer(){return manufacturer;}
    public void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}

    public float getPrice(){return price;}
    public void setPrice(float price){this.price = price;}

    public String getSerialNumber(){return serialNumber;}
    public void setSerialNumber(String serialNumber){this.serialNumber = serialNumber;}

    public int getResolutionX(){return resolutionX;}
    public void setResolutionX(int resolutionX){this.resolutionX = resolutionX;}

    public int getResolutionY(){return resolutionY;}
    public void setResolutionY(int resolutionY){this.resolutionY = resolutionY;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }

    @Override
    public String toString(){
        return "Monitor: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber
                + ", X = " + resolutionX + ", Y = " + resolutionY;

    }
}

class EthernetAdapter extends Device {
    protected int speed;
    protected String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac){
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
    public String getManufacturer(){return manufacturer;}
    public void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}

    public float getPrice(){return price;}
    public void setPrice(float price){this.price = price;}

    public String getSerialNumber(){return serialNumber;}
    public void setSerialNumber(String serialNumber){this.serialNumber = serialNumber;}

    public int getSpeed(){return speed;}
    public void setSpeed(int speed){this.speed = speed;}

    public String getMac(){return mac;}
    public void setMac(String mac){this.mac = mac;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
                mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}
