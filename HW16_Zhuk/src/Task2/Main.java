package Task2;

public class Main {

    public static void main(String[] args) {
        Device genDevice = new Device("Samsung", 120, "AB1234567CD");
        Monitor SamsungMonitor = new Monitor("Samsung", 120, "AB1234567CD",
                1280, 1024);
        EthernetAdapter SamsungEther = new EthernetAdapter("Samsung", 120, "AB1234567CD",
                300, "Ab:05:ff:23:cO:7b");

        System.out.println(genDevice.toString());
        System.out.println(SamsungMonitor.toString());

        System.out.println(SamsungMonitor.equals(genDevice));
        System.out.println(genDevice.equals(SamsungMonitor));

        System.out.println(genDevice.hashCode());
        System.out.println(SamsungMonitor.hashCode());
        System.out.println(SamsungEther.hashCode());

    }
}
