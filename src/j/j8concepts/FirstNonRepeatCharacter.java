package j.j8concepts;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String input = "INDIA";
        LinkedHashMap<String,Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String unique = collect.entrySet().stream().filter(e->e.getValue() == 1).map(e->e.getKey()).findFirst().get();
        System.out.println(unique);
Map<String,Long> mVal =        Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mVal); }
}
