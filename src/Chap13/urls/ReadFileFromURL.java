package Chap13.urls;

import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("Enter a URL HERE: ");
        String urlString = new Scanner(System.in).next();
        try
        {
            java.net.URL url = new java.net.URL(urlString);
            int count = 0;
            Scanner in = new Scanner(url.openStream());
            while(in.hasNext())
            {
                String line = in.nextLine();
                count += line.length();
            }
            System.out.println("The size is: " + count);
        }catch (java.net.MalformedURLException ex){
            ex.printStackTrace();
            System.out.println("Invalid "  + ex.getMessage());
        }
        catch (java.io.IOException ex)
        {
            System.out.println("No such file");
        }
    }
}
