package j.j8concepts;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLength {
    public static void main(String[] args) {
        String[] name = {"hi","hello"};
String output =        Arrays.stream(name).max(Comparator.comparingInt(String::length)).get();

        System.out.println(output);}
}
