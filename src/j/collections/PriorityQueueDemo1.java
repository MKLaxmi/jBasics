package j.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(15, new MyComparator());
        pq.offer("Z");
        pq.offer("a");
        pq.offer("Y");
        pq.offer("X");
        System.out.println(pq);
    }
}

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = String.valueOf(o2);

        return s2.compareTo(s1);
    }
}
