//package abstraction13.interfaces;
//
//import java.time.*;
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.Date;
//
//public class TestingInterface {
//    public static void main(String[] args) throws DateTimeException {
//        Animal[] animals = {
//                new Fish(12,Name.FISH),
//                new Beef(480, Name.BEEF),
//                new lion(897, Name.LION),
//                new Tiger(1283, Name.TIGER),
//                new Chicken(23, Name.CHICKEN),
//                new Gorilla(568, Name.GORILLA),
//                new Monkey(231, Name.MONKEY)
//        };
//        Fruits fruits = new Mango();
//
//        for(int i = 0; i < animals.length; i++)
//        {
//            if (animals[i] instanceof Animal)
//                System.out.println(animals[i].kingdom() + " " + animals[i].getName());
//            if (animals[i] instanceof  Edible)
//                System.out.println(((Edible) animals[i]).howToEat() + " " + animals[i].getName());
//        }
//        System.out.println("THIS IS A FRUIT");
//        System.out.println(fruits.seed());
//        System.out.println(fruits.seedless());
//        System.out.println(Edible.name);;
//
//        Date data1 = new Date(Calendar.YEAR-2, Calendar.JANUARY,Calendar.DATE);
//        Date data2 = new Date(2221, 12,2);
//        Date data3 = (Date)data1.clone();
//
//        //local date
////        LocalDate d = LocalDate.of(2333,Month.DECEMBER, 23);
//
//
//        System.out.println(data1.equals(data2));
//        System.out.println(data1 == data2);
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(data1.equals(data3)); //i think this equals() checks if they are of the same type
//        System.out.println(data1 == data3); //while the " == " checks if the contents are of the same kind (not type)\
//
//
//    }
//}
