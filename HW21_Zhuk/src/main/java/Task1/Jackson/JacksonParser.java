package Task1.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.net.URL;
import java.nio.file.StandardOpenOption;

import java.io.IOException;

public class JacksonParser {
    public static void parseJackson(String url) throws IOException{
        ObjectMapper mapper = new ObjectMapper();

        Currency[] currencies = mapper.readValue(new URL(url), Currency[].class);

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(currencies);

        Files.write(Paths.get("/Users/kyrylozhuk/IdeaProjects/HW21_Zhuk/src/main/resources/JacksonCurrencyListIn.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
