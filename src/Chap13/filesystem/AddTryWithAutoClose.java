package Chap13.filesystem;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AddTryWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists())
        {
            System.out.println("Already exist");
            //System.exit(0);
        }
        //CREAT A FILE AND POPU;ATE IT USING THE TRY-WITH-RESOURCE
        try(java.io.PrintWriter output = new java.io.PrintWriter(file))
        {
            output.println("THIS IS BURMAU");
            output.println("no man, no cry");
        }

        System.out.println(file.canRead());
    }
}
