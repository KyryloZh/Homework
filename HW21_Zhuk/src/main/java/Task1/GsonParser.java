package Task1;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

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
    }
}
