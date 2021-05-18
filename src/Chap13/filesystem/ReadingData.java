package Chap13.filesystem;

import java.io.File;
import java.util.Scanner;

public class ReadingData {
    public static void main(String[] args) throws Exception {
        java.io.File file = new File("Welcome.txt");

        java.util.Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            String first = scan.next();
            String sex = scan.next();
           // String thr = scan.next();
            //String hr = scan.next();
            System.out.println(first + " " + sex + " "  );
        }
        scan.close();

    }
}
