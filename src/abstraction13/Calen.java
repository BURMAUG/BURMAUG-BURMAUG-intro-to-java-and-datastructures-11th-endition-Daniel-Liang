package abstraction13;

import java.util.*;

public class Calen {
    public static void main(String[] args) {
        boolean flag = true;
        int month = 0, year;
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.util.Calendar calendar = new java.util.GregorianCalendar();
        Map<Integer, String> months = new HashMap<>();

        //i wanna get the month and year and then displpay the calender
        do {
            try {
                System.out.print("Enter the month here: ");
                month = input.nextInt();
                flag = false;
                input.nextLine();
            }catch (InputMismatchException ex)
            {
                System.err.println("Please make sure to enter an number!");
            }
        }while (flag);

        //set the flag to true
        flag = true;

        //get the month
        do {
            try {
                System.out.print("Enter the month here: ");
                year = input.nextInt();
                flag = false;
                input.nextLine();
            }catch (InputMismatchException ex)
            {
                System.err.println("Please make sure to enter an number!");
            }
        }while (flag);





    }
}
