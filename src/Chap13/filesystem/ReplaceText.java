package Chap13.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 4)
        {
            System.out.println("Usaage: java ReplaceText sourceFile targetFile oldstr newStr");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists())
        {
            System.out.println("the source file " + args[0] + " does not exist.");
            System.exit(2);
        }
        File sourceFile2 = new File(args[1]);
        if (!sourceFile2.exists())
        {
            System.out.println("the source file " + args[1] + " does not exist.");
            System.exit(3);
        }
        try (Scanner in = new Scanner(sourceFile); PrintWriter writer = new PrintWriter(sourceFile2)) {
            while (in.hasNext())
            {
                String s = in.nextLine();
                String sw = s.replaceAll(args[2], args[1]);
                writer.println(sw);
            }
        }
    }
}
