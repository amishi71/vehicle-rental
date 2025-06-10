package com.example.demo;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class FeatureDemo {

    public static void runAll() {
        lambdaExample();
        streamExample();
        optionalExample();
        methodReferenceExample();
        defaultMethodExample();
        dateTimeExample();
    }

    static void lambdaExample() {
        System.out.println("Lambda Example:");
        GreetingService greet = message -> System.out.println("Hello " + message);
        greet.greet("World");
    }

    static void streamExample() {
        System.out.println("\nStream API Example:");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("C"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'C': " + filtered);
    }

    static void optionalExample() {
        System.out.println("\nOptional Example:");
        Optional<String> optionalName = Optional.ofNullable(getName());
        optionalName.ifPresent(name -> System.out.println("Name: " + name));
    }

    static void methodReferenceExample() {
        System.out.println("\nMethod Reference Example:");
        List<String> list = Arrays.asList("One", "Two", "Three");
        list.forEach(System.out::println);
    }

    static void defaultMethodExample() {
        System.out.println("\nDefault Method in Interface Example:");
        GreetingService service = msg -> System.out.println("Hi " + msg);
        service.greet("there");
        service.defaultGreeting();
        GreetingService.staticGreeting();
    }

    static void dateTimeExample() {
        System.out.println("\nDate and Time API Example:");
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tomorrow);
    }

    static String getName() {
        return "Java 8";
    }
}
