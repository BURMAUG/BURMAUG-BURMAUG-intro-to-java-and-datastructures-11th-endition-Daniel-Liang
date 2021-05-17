package chapt3;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //enter the height in feet first
        System.out.print("Enter feet 🦶 :");
        int feet = in.nextInt();

        System.out.print("enter inches: ");
        int inches = in.nextInt();

        //enter the weight lp
        System.out.print("Enter weight in pounds: ");
        int weight = in.nextInt();

        int n = (feet*inches*weight);
        System.out.println(n);
        in.close();
    }
}
