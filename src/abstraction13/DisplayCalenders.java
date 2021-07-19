package abstraction13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class DisplayCalenders {
    public static void main(String[] args) {
        ArrayList<Number> n = new ArrayList<>();
        n.add(1);
        n.add(new BigInteger("2373489123912398732498671423"));
        n.add(new BigDecimal(2332.23));
        n.add(238);
        Number largest = n.get(0);
        for (Number i : n) {
            if ( i.doubleValue() > largest.doubleValue())
                largest = i;
        }
        System.out.println(largest);
    }
}
