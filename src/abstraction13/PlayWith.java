package abstraction13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class PlayWith {
    public static void main(String[] args) {
//        ArrayList<Number> list = new ArrayList<>();
//        list.add(12);
//        list.add(23.2);
//        //
//        list.add(new BigDecimal(23.32));
//        list.add(new BigInteger("5646564486596"));
//        System.out.println(getLargest(list));
        java.util.Calendar calendar  = new java.util.GregorianCalendar();
        System.out.println(calendar.getTime());

    }
    public static Number getLargest(ArrayList<Number> list)
    {
        int count = 1;
        Number number = list.get(0);
        while(count < list.size())
        {
            if (number.doubleValue() < list.get(count).doubleValue())
                number = list.get(count);
            count++;
        }
        return number;
    }
}
