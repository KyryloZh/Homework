package Task1.Gson;

import Task1.Gson.GsonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser.ParseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}
