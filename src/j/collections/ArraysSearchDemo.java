package j.collections;

import java.util.*;
import static java.util.Arrays.*;

public class ArraysSearchDemo {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,6));//1
        System.out.println(Arrays.binarySearch(a,14));//-5

        String[] s={"A","Z","B"};
        Arrays.sort(s);
        System.out.println(binarySearch(s,"Z"));//2
        System.out.println(binarySearch(s,"S"));//-3

        Arrays.sort(s,new MyComparator4());
        System.out.println(binarySearch(s,"Z", new MyComparator4()));//0
        System.out.println(binarySearch(s,"S", new MyComparator4()));//-2
        System.out.println(binarySearch(s,"N"));//unpredicable result

    }
}
class MyComparator4 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String n1 = (String) o1;
        String n2 = (String) o2;
        return n2.compareTo(n1);
    }
}
