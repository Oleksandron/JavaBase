package Lesson5_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(11);
        arr.add(13);
        arr.add(15);
        arr.add(17);
        arr.add(19);
        System.out.println(arr.size());
        ListIterator<Integer> itr = arr.listIterator();
        while (itr.hasNext()) {
            int count = itr.next();
            System.out.print(count + " ");
        }
        System.out.println(" ");
        ListIterator<Integer> itr2 = arr.listIterator();
        while (itr2.hasNext()) {
            int count = itr2.next();
            System.out.print(1 + count + " ");
        }
    }
}
