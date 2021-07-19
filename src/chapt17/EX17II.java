package chapt17;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX17II {

    public static void main(String[] args) throws FileNotFoundException {
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("Ex17iii.txt");
        ){
            for (int i = 0; i < 100; i++)
                fileOutputStream.write(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
