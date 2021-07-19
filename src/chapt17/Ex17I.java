package chapt17;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Ex17I {
    public static void main(String[] args)  throws FileNotFoundException {
        java.io.File file = new java.io.File("Ex17_01.txt");
        if (file.exists())
        {
            System.out.println("This file already exist");
            System.exit(1);
        }

        try (PrintWriter out = new PrintWriter(file)){
            Random random = new Random();
            int i = 0, low = 0, high = 100;
            while(i < 100){
                int re = random.nextInt(high-low) + low;
                out.print( re + " " );
                i++;
            }
        }
    }
}
