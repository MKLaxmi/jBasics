package j.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
//                l.add(new Integer(10));// CCE exception
//        l.add(null);//RE: NPE
        System.out.println("before "+l);
        Collections.sort(l, new MyComparator1 ());
        System.out.println("after "+l);


    }
}
class MyComparator1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1= (String)o1;
        String s2= (String)o2;

        return s2.compareTo(s1);
    }
}
