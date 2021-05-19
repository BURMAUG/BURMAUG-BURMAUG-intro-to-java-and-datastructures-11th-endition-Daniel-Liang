package Chap13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveTxt {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("write.txt");
        if (file.exists())
        {
            System.out.println("already exist");
            //System.exit(0);
        }

        //write into the file
        try( java.io.PrintWriter output = new java.io.PrintWriter(file))
        {
            output.println("burmau garba is nothing now but wait later!");
            output.println("but this is how burmau is not Burmau");
            output.println("in what way can we all live along with no problems");
            output.println("In a world created by burmau and overseeen by burmau");
        }
        replace("burmau", file);
    }

    //get the file and target word
    public static void replace(String word, File file) throws Exception {
        //get the target word
        String target = word;
        String n = " ";
        //open the file
        //and read through file.
        try (java.util.Scanner in = new Scanner(file)){
            while (in.hasNext()){
                //i wanna check if the string of word is equal to target and change
                if(target.equals(in.next()) )
                    System.out.println(true);
                else
                    System.out.println(" nope");
            }
        }
    }
}
