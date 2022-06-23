package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        strings.stream().forEach(number -> System.out.println(number));
        strings.stream().forEach(number -> {
            // do this
            System.out.println(number);
        });
        // for (String string : strings) {
        //     System.out.println(string);
        // }

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }
        // System.out.println(ints);
        // 1. type cast everything into an Integer
        // 2. print it
        List<Integer> numbers = strings2.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        // List<Integer> numbers2 = new ArrayList<>();
        // strings2.stream().map(x -> Integer.parseInt(x)).forEach(x -> numbers2.add(x));
        numbers.stream().forEach(x -> System.out.println(x));
    }
}