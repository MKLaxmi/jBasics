package j.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        System.out.println("Before Sorting Primitive:");
        for(int a1:a){
            System.out.println(a1);//[10,5,20,11,6]
        }
        Arrays.sort(a);
        System.out.println("After Sorting Primitive:");
        for(int a1:a){
            System.out.println(a1);//[5,6,10,11,20]
        }

        String[] s = {"A","Z","B"};
        System.out.println("Before Sorting Object:");
        for(String a1:s){
            System.out.println(a1);//[A,Z,B]
        }
        Arrays.sort(s);
        System.out.println("After Sorting Object:");
        for(String a1:s){
            System.out.println(a1);//[A,B,Z]
        }
       Arrays.sort(s, new MyComparator3());
        System.out.println("After Sorting Object:");
        for(String a1:s){
            System.out.println(a1);//[Z,B,A]
        }
    }
}

class MyComparator3 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = (String)o2;
        return s2.compareTo(s1);
    }
}
