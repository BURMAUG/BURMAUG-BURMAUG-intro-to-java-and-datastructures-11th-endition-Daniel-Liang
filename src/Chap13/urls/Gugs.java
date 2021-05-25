package Chap13.urls;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Gugs {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/index.html");
            url.openConnection();
        }catch (MalformedURLException ex)
        {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
