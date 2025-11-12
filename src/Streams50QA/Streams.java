package Streams50QA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("guppy", "gold fish", "shark", "turtle", "Star Tortoise", "Flower Horn",
				"fish", "gold fish", "turtle");

		// remove duplicates
		List<String> duplicates = names.stream().distinct().toList();
		System.out.println("first approach is :" + duplicates);
		Set<String> set = names.stream().collect(Collectors.toSet());
		System.out.println("Second Approach is : " + set);

		// find all the numbers starting with 1
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 23, 45, 76, 23, 1564);
		List<Integer> one = numbers.stream().filter(s -> String.valueOf(s).startsWith("1")) // starting with 1
				// .filter(s -> !String.valueOf(s).startsWith("1")) // not starting with 1

				.toList();
		one.forEach(System.out::println);

		// how to join two streams

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);

		Stream<Integer> combinedStreams = Stream.concat(list1.stream(), list2.stream());
		combinedStreams.forEach(System.out::println);

		// merge two sortedLists into a single sorted list

		List<Integer> list3 = Arrays.asList(1, 2, 3, 7, 8);
		List<Integer> list4 = Arrays.asList(4, 5, 6, 9, 10);
		List<Integer> combinedSortedLists = Stream.concat(list3.stream(), list4.stream())
				.sorted(Comparator.naturalOrder()).toList();
		combinedSortedLists.forEach(System.out::println);

		// how to debug streams using peek()
		List<String> upperCase = names.stream().peek(word -> System.out.println("Original " + word))
				.filter(b -> b.startsWith("t")).peek(word -> System.out.println("After Filter " + word))
				.map(String::toUpperCase).peek(word -> System.out.println("After UpperCase " + word)).toList();

		System.out.println(upperCase);

		// given a list of strings ,find out those strings which start with a number

		List<String> listandnumber = Arrays.asList("1vamsi", "bhargav", "3kiran", "ganga", "manoj", "7ganesh");
		listandnumber.stream().filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0)))
				.forEach(System.out::println);

		// check given string is pallindrome or not
		String input = "madam";
		boolean isPallindrome = IntStream.range(0, input.length() / 2)
				.allMatch(n -> input.charAt(n) == input.charAt(input.length() - 1 - n));
		System.out.println(isPallindrome);

		// find the nth smallest element in an array
		int[] arr = { 1, 2, 56, 23, 645, 765, 21432, 5674, 24652, 4353, 56, 45, 543 };
		Arrays.stream(arr).skip(2).findFirst().ifPresent(System.out::println);
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);

		// how do you get last element of an array
		int[] arr1 = { 10, 20, 30, 40, 50 };
		Arrays.stream(arr1).skip(arr1.length - 1).findFirst().ifPresent(System.out::println);

		// given a list of strings join the strings with '[' as prefix ,']' as suffix
		// and ',' as delimiter
		String result = names.stream().map(word -> "[" + word + "]").collect(Collectors.joining(","));
		// or
		String result2 = names.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
		System.out.println(result2);

		// find the sum of the first two numbers in a given list --use limit
		int sum = numbers.stream().mapToInt(a -> a).limit(2).sum();
		System.out.println(sum);

		// find the multiply of the first two numbers in a given list --use reduce
		List<Integer> mul = Arrays.asList(10, 20, 30, 40, 50, 10, 20);
		Optional<Integer> multiply = mul.stream().limit(2).reduce((a, b) -> a * b);
		multiply.ifPresent(System.out::println);

		// find the sum of the unique numbers in a given list
		int sumofuniuenumbers = mul.stream().distinct().mapToInt(i -> i).sum();
		// here after distinct we cannot use sum bcz distinct returns integer but we
		// want int thats why we are converting into maptoint after that
		// we can use sum directly
		System.out.println(sumofuniuenumbers);

		// given a string find the first non-repeated character in it

		String str = "vamsivmi";
		str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);

		// given a string find the first repeated character in it
		String str1 = "vamsivmi";
		str1.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);

		
		//summary statictics
		IntSummaryStatistics stats = mul.stream().mapToInt(n -> n).summaryStatistics();
		System.out.println("minimum  :" + stats.getMin());
		System.out.println("max  :" + stats.getMax());
		System.out.println("count  :" + stats.getCount());
		System.out.println("avg  :" + stats.getAverage());
		System.out.println("sum  :" + stats.getSum());

		
		//find the word with third highest length
		names.stream().sorted(Comparator.comparingInt(String::length).reversed()).skip(2).findFirst().ifPresent(System.out::println);
	
		
		
	}
}
