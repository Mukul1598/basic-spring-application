package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {

        List<Integer> arrayList = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Iterator<Integer> itr = arrayList.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }





        ListIterator<Integer> listIterator = arrayList.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());


//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.);


    }
}
