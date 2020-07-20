package Task1.Jackson;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJackson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}
