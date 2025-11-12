package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
   public static void main(String[] args) {
       List<Fruit> fruits = Arrays.asList(
           new Fruit("Apple", 95, 50, "Red"),
           new Fruit("Banana", 110, 20, "Yellow"),
           new Fruit("Orange", 80, 30, "Orange"),
           new Fruit("Cherry", 70, 60, "Red")
       );
       System.out.println("Low Calorie Fruits:");
       fruits.stream()
             .filter(f -> f.calories < 100)
             .sorted((f1, f2) -> f2.calories - f1.calories)
             .forEach(System.out::println);
       System.out.println("\nColor Wise Fruit Names:");
       fruits.stream()
             .collect(Collectors.groupingBy(f -> f.color,
                     Collectors.mapping(f -> f.name, Collectors.toList())))
             .forEach((color, names) -> System.out.println(color + " -> " + names));
       System.out.println("\nRed Fruits Sorted by Price:");
       fruits.stream()
             .filter(f -> f.color.equalsIgnoreCase("Red"))
             .sorted(Comparator.comparingInt(f -> f.price))
             .forEach(System.out::println);
   }
}