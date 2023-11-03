package bridgesoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        String name = "my name is vamshi krishna";
        int[] array = {1, 2, 2, 2, 3, 1, 1, 2, 4, 5, 6, 7, 5, 4};
//        uniqueString(name);
        uniqueArray(array);
    }


    public static void uniqueArray(int[] array) {
        List<Integer> list = Arrays.asList(1,1,2,1,2,3,4,5,6,7,8,4);
        List<Integer> collect = list.stream().distinct().sorted().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
        System.out.println(collect);
    }


    public static void uniqueString(String name) {
        String s = Arrays.stream(name.split("")).distinct().sorted().collect(Collectors.joining()).toString();
        System.out.println(s);
    }
}
