package Task2;

public class Distance {
    double distance;

    public static void print(){
        System.out.println("Printing...");
    }

    public static class Converter {
        public double Kilometers (double distance){
            double km = distance * 0.001;
            return km;
        }

        public double Feet (double distance){
            double feet = distance * 3.281;
            return feet;
        }
        public double Miles (double distance){
            double miles = distance / 1609;
            return miles;
        }

    }
}
