package chapter20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class TestCcollection {
    public static void main(String[] args) {
        java.util.ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Boston");
        collection1.add("Madison");
        System.out.println(collection1);
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next().toUpperCase(Locale.ROOT) + " ");

        System.out.println("\nIS DALLAS IN COLLECTION " + collection1.contains("Dallas"));
        collection1.remove("Dallas");
        collection1.trimToSize();

        System.out.println(collection1.size() + " cities are in collection1 now");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("\nA list of cities in collection2");
        System.out.println(collection2);
        collection2.forEach(e -> System.out.print(e.toUpperCase(Locale.ROOT)+ " "));

        java.util.ArrayList<String> c1 = (ArrayList<String>) collection1.clone();
        c1.addAll(collection2);

        System.out.println("\nCities in collection1 and collection2 ");
        System.out.println(c1);

        c1 = ((ArrayList<String>) collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2");
        System.out.println(c1);

        c1 = ((ArrayList<String>) collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1, but not 2: ");
        System.out.println(c1);


    }
}
