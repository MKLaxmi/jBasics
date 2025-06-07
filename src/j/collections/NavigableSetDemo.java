package j.collections;

import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(100);
        t.add(200);
        t.add(300);
        t.add(400);
        t.add(500);
        System.out.println(t);

        //returns lowsest greater than/equals to e - 200 = 200
        System.out.println(t.ceiling(200));

        //return lowest ele greater than e - 200 = 300
        System.out.println(t.higher(200));

        //return highest ele less than or = to e e-300 = 300
        System.out.println(t.floor(300));

        //return highest ele less than e -300 =200
        System.out.println(t.lower(300));

        //poolFirst() remove and return 1st ele
        System.out.println(t.pollFirst());

        //poolLast() remove and return last ele
        System.out.println(t.pollLast());

        //return in reverse order
        System.out.println(t.descendingSet());

        System.out.println(t);
    }
}
