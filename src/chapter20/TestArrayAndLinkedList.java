package chapter20;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        int i=0;
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        while (i<5) {
            arrayList.add(i);
            i++;
        }
        System.out.println(arrayList);
        arrayList.add(0, 10);
        arrayList.add(3,20);
        System.out.println(arrayList);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1,"red");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.addFirst("Green");
        System.out.println(linkedList);

        System.out.println("***************************REVERSING LINKED LIST*************************");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");
        System.out.println();
        ListIterator<Object> listIterator2 = linkedList.listIterator(linkedList.size());
        while (listIterator2.hasPrevious())
            System.out.print(listIterator2.previous() + " ");



    }
}
