package Chap13.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestingFileClassWithRemix01 {
    public static void main(String[] args) throws Exception {
        java.io.File file = new File("og.txt");
        System.out.println("Exist " + file.exists());
        System.out.println("Is this a file: " + file.isFile());
        System.out.println("Give me the abolutePath: " + file.getAbsolutePath());
        System.out.println("Give me the file name: " + file.getName());
        System.out.println("Give me the immediate parent of this file:  " + file.getParent());
        System.out.println("Can I read into this file?: " + file.canRead());
        System.out.println( "Last modified: " + file.lastModified() );
        System.out.println("Can i write into this file: " + file.canWrite());
        System.out.println("Can i execute this file?: " + file.canExecute());
        System.out.println("What's the length of this file: " +  file.length());
        System.out.println("Give me the absolute file: " +  file.getAbsoluteFile());
        System.out.println(file.isAbsolute());

        //create a file to store data with automatic close() since the try-with-resource logic
        try(java.io.PrintWriter result =  new java.io.PrintWriter(file)) {
            //variables to check if the getAbsoluteFile() and  getAbsolutePath() with in the same manner
            String ab_file = file.getAbsoluteFile().toString();
            String ab_path = file.getAbsolutePath().toString();
            //log(n^2) bad
            //loop through  the first and second string variables
            look: for (int i = 0; i < ab_file.length(); i++) {
                char c = ab_file.charAt(i);
                for (int j = 0; j < ab_path.length(); j++)
                {
                    //check if they do the same thing by looking at the same individual letters
                    if (ab_path.charAt(j) == c)
                    {
                        //store the character in the og.txt file
                        result.print(c);
                        //j++;
                        continue look;
                    }
                    //continue look;
                }
            }

        }




    }
}
