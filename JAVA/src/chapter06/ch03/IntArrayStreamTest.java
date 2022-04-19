package chapter06.ch03;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
        Arrays.stream(arr).forEach(n-> System.out.println(n));

        IntStream is = Arrays.stream(arr);
    }
}
