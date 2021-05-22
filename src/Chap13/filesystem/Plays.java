package Chap13.filesystem;

import java.io.PrintWriter;
import java.util.*;

public class Plays {

    public static void main(String[] args) throws Exception {
        //get a randomly generated numbers for the keys
        Random rand = new Random();

        int count = 0, i = 0;

        //make an array for names and scores
        Map<Integer, String> students  = new HashMap<>();
        //Make an array list so that i can store students name and then pass the to Map;
        ArrayList<String> student_names = new ArrayList<>(
                List.of("Carmelo Cano",
                        "Lyla Foote",
                        "Kaycee Skipper",
                        "Rueben Gatlin",
                        "Floria Jolley",
                        "Sofia Greenwood",
                        "Alyse Palma",
                        "Marlys Canada",
                       " Lean Hass",
                        "Christi Holder",
                        "Nelly Hassell",
                        "Maye Sheehan",
                        "Hilary Hamblin",
                        "Gabriela Street",
                        "Virgina Schaffer",
                        "Milford Hinojosa",
                        "Janella Hales",
                        "Terra Barham",
                       " Leola Humphries",
                        "Bertram Looney",
                        "Rufina Gagnon",
                        "Lamont Everhart",
                        "Cristy Stephenson",
                        "Zena Beltran",
                        "Aaron Rees",
                       " Fonda Holm",
                        "Merrill Daigle" ,
                       " Magaret Isaac",
                        "Tyson Meyers",
                        "Charleen Hinkle",
                        "Ashlyn Bible",
                        "Sean Buckner",
                        "Mimi Neill",
                        "Thao Lucero",
                        "Vern Bobo",
                        "Raymond Spearman",
                        "Joellen Christenson",
                        "Branda Linder",
                       " Drusilla Mchugh",
                        "Kira Pedersen",
                        "Verla Packard",
                        "Sid Mcintire",
                        "Wiley Melvin",
                        "Coralee Regalado",
                        "Temika Bauer",
                        "Cinderella Babb",
                        "Dawna Catalano",
                        "Marina Le",
                        "Laraine Bowens",
                        "Ali Whitmire"));
        Iterator<String> it = student_names.iterator();
   top: for(String t : student_names)
        {
           while (it.hasNext())
           {
               students.put(i, t);
               i++;
               continue top;
           }
        }

        //get a file to read
        java.io.File file = new java.io.File("scores.txt");
        //check if its in the current directory
        if (file.exists())
            System.out.println("Exist");
        //check if its write able
        System.out.println(file.canWrite());
        //write
        try(Scanner input = new Scanner(file);
            java.io.PrintWriter in =  new PrintWriter(file)
        )
        {

            in.printf("sn \t" + " |Name \t" + "\t\t\t\t\t\t\t\t |scores \t\n");
            in.println("__________________________________________________________________________");
            while (count < students.size())
            {
                in.println(new StringBuilder().append(rand.nextInt(50)).append("\t |")
                        .append(students.get(count)).toString());
                count++;
            }
        }
    }
}
