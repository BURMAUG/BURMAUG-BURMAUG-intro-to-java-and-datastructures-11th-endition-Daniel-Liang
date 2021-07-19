package chapter18;

public class ComputeFib {
    public static long fib(long number)
    {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return fib(number-1) + fib(number -2);
    }

    public static void x(long i ){
        if (i > 0)
        {
            System.out.print(i + " ");
            x(i-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
        x(5);
    }
}
