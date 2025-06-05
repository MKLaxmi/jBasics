package j.j8concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindHighestSalFromEachDept {
    public static void main(String[] args) {

        int[] num ={21,12,31,22};

        List<String> op = Arrays.stream(num).boxed().map(e->e+"")
                .filter(e -> e.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(op);
    }
}
