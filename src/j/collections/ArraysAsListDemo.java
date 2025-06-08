package j.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        String[] s ={"A","Z","B"};
        List l = Arrays.asList(s);
        System.out.println(l);//[A,Z,B]
        s[0] ="K";
        System.out.println(l);//[K,Z,B]
        l.set(1,"L");
        for (String s1:s){
            System.out.println(s1);
        }
        //UnsupportedOperationException on changing th size of array
//        l.add("H");
//        l.remove(2);
        //ArrayStoreExceptio on adding heterogenous elements to array
//        l.set(1, new Integer(2));

    }
}
