package Task1;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void ParseJson (String url) throws IOException{
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        Currency[] currencies = gson.fromJson(jsonReader,Currency[].class);

        for (Currency currency : currencies) {
            System.out.println(currency);
        }


        String gsonString = gson.toJson(currencies);

        Files.write(Paths.get("/Users/kyrylozhuk/IdeaProjects/HW21_Zhuk/src/main/resources/CurrencyListIn.json"),
                gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
