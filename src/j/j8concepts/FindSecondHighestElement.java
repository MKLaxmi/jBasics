package j.j8concepts;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestElement {
    public static void main(String[] args) {
        int[] num = {5,15,3,67,16};
        Integer secondHighest = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);
    }

}
