package Chap13.filesystem;

import java.io.FileNotFoundException;

public class TestingFileClassWithRemix {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("Welcome.txt");
        //System.out.println("Does the file exist: " + file.exists());
        if (file.exists())
        {
            System.out.println("File already here");
            System.exit(1);
        }
        java.io.PrintWriter output= new java.io.PrintWriter(file);
        output.println("no woman, no cry!");
        output.println("no woman, n cry!");
        output.println("no woman,  cry!");
        output.close();
    }
}
