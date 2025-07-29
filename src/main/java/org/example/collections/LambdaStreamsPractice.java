package org.example.collections;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaStreamsPractice {

    static void threadInvocation() {
        Runnable r = () -> {
            int i = 0;
            while (true) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        };
        Thread thread = new Thread(r);
        thread.start();
        int i = 10000;
        while (true) {
            System.out.println(i);
            i--;
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // functional Interface
        // Syntax -> (parameter) -> { body }
//        Greeting greeting = (str, location) ->  System.out.println("Hello " + str + " from location " + location);
//        greeting.sayHello("Salma", "Tamil Nadu");

        // Predicate
//        Predicate<String> startsWith = str -> str.startsWith("A");
//        System.out.println(startsWith.test("Audi"));
//        System.out.println(startsWith.test("BMW"));

        // Function
//        Function<String, Boolean> stringLength = str -> str.startsWith("A");
//        System.out.println(stringLength.apply("Audi"));
//        System.out.println(stringLength.apply("BMW"));

        // Consumer - Take input, Return nothing
//        Consumer<String> consumer = s -> System.out.println(s.toLowerCase());
//        consumer.accept("SALMA");

        // Supplier - Return a value, no input.
//        Supplier<Integer> supplier = () -> 100;
//        System.out.println(supplier.get());

        List<Integer> numbers = Arrays.asList(1, 22, 3, 74, 5, 7, 7, 8, 1);
        List<Integer> evenNumbers = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                evenNumbers.add(numbers.get(i));
//            }
//        }
//        System.out.println(evenNumbers);


        // Streams
//        evenNumbers = numbers.stream().filter(num -> num % 2 == 0).toList();
//        System.out.println(evenNumbers);

//        numbers.forEach(s -> System.out.println(s));
//        System.out.println("Before manipulation");
//        System.out.println(numbers);
//
//        Optional<Integer> maximumElement = numbers.stream().map(num -> num * 2)
//                .sorted()
//                .distinct()
//                .max(Comparator.naturalOrder());
//
//        System.out.println(maximumElement.get());

//        System.out.println("After manipulation");
//        System.out.println(numbers);

        List<Person> people = Arrays.asList(
                new Person("Hari", LocalDateTime.of(1992, 4, 15, 0, 0)),
                new Person("Ram", LocalDateTime.of(1997, 3, 12, 0, 0)),
                new Person("Arun", LocalDateTime.of(1997, 4, 10, 0, 0))
        );

        Optional<Person> oldest = people.stream().max(Comparator.comparing(s -> s.getAge()));
        System.out.println(oldest.get());
    }
}
