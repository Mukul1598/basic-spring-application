package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {








        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.clear();
        arrayList.remove(0);
        arrayList.isEmpty();
        arrayList.size();


        Iterator<Integer> li = arrayList.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }



        for(Integer no: arrayList){
            System.out.println(no);
        }





        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        int size = pq.size();
        pq.remove(1);
        boolean isEmpty = pq.isEmpty();
        boolean contains =  pq.contains(2);


        for(Integer integer:pq){
            System.out.println(integer);
        }


    HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.size();
        hashSet.remove(1);
        hashSet.contains(1);
        hashSet.isEmpty();


        for(Integer no:hashSet)
        {
            System.out.println(no);
        }

    Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.remove(1);
        stack.size();
        stack.isEmpty();
        stack.contains(1);






    }
}
