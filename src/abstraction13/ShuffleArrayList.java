package abstraction13;

import java.util.*;

public class ShuffleArrayList {

    public static void main(String[] args){
        ArrayList<Number> n = new ArrayList<>(List.of(91,32,12,23,3));
        shuffleArray(n);
    }
    public static void shuffleArray(ArrayList<Number> list){
        Collections.shuffle(list);
        System.out.println(list);
    }
    public static  void sortArrayList(ArrayList<Number> list)
    {

    }
}
