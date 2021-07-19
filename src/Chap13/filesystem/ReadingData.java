package Chap13.filesystem;

import java.io.File;
import java.util.Scanner;

public class ReadingData {
    public static void main(String[] args) throws Exception {
        java.io.File file = new File("Welcome.txt");

        java.util.Scanner scan = new Scanner(file);
//        System.out.println("Asdjhasldhaks asjkdhfa;ifhds");
//        String lineSeparator = System.getProperty("line.separator");
//        //System.out.println(lineSeparator);
        while(scan.hasNext())
        {
            int number = scan.nextInt();
            System.out.println(number);
        }
        scan.close();

    }
}
