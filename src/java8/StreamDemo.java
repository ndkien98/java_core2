package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);

    public void withoutStream() {
        long count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.printf("There are %d elements that are even", count);
    }

    public void withStream() {
        long count = numbers.stream().filter((num) -> num % 2 == 0).count();
        System.out.printf("There are %d elements that are even", count);
    }

    public static void main(String[] args) {

        String[] languages = {"java","C#","C++","PHP","Java Script"};
        // get Stream using the array Stream
        Stream<String> testStream1 = Arrays.stream(languages);

        testStream1.forEach(System.out::println);

        // version 2
        Stream.of(languages).forEach(obj -> System.out.println(obj));

        // convert to list
        List<String> list = Stream.of(languages).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }

}
