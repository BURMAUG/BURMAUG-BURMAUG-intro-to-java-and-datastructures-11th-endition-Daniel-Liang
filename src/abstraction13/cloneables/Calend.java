package abstraction13.cloneables;

import java.util.Calendar;

public class Calend {
    public static void main(String[] args) {
        java.util.Calendar  cal = new java.util.GregorianCalendar(2221, 2, 1);
        java.util.Calendar  cal2 = cal;
        java.util.Calendar  ca3 = (Calendar)cal.clone();

        System.out.println(cal.equals(cal2));
        System.out.println(cal == ca3);
        System.out.println(cal.equals(ca3));

    }
}
