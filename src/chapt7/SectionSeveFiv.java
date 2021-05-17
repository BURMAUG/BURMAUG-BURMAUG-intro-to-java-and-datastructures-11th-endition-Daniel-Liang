package chapt7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SectionSeveFiv {


    /* 7.4*
     * (Printing distinct numbers) Write a program
     *  that reads in ten numbers and displays distinct
     *  numbers (i.e., if a number appears multiple times, it
     *  is displayed only once). Hint: Read a number and store
     *  it to an array if it is new. If the number is already in
     *  the array, ignore it. After the input, the array contains
     *  the distinct numbers. Here is the sample run of the program:
     *
     *  */

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //creating a set to display set
        Set<Integer> distinct = new TreeSet<Integer>();
        boolean flag = false;
        //loop
        while( !flag )
        {
            System.out.print("Enter the a digit greater than 0 and press 0 to exit: ");
            Integer digit = in.nextInt();
            distinct.add(digit);
            if(digit == 0)
                flag = true;
        }

        System.out.print(distinct);
    }
}
