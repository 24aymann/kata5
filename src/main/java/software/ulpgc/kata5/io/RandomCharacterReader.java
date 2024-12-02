package software.ulpgc.kata5.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Random;

public class RandomCharacterReader implements CharacterReader{
    @Override
    public String read() {
        try {
            return read(randomURL());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String randomURL() {
        String url = "https://dragonball-api.com/api/characters/";

        Random random = new Random();
        int number = random.nextInt(35) + 1;
        url += number;

        return url;
    }

    private String read(String url) throws IOException {
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .header("accept", "text/*")
                .method(Connection.Method.GET)
                .execute();
        if (response.statusCode() != 200) throw new RuntimeException("Fatal issue.");
        return response.body();
    }
}
