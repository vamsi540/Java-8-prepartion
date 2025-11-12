package Streams_04092025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams04092025 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 32, 12, 1, 4, 1, 45, 214, 45);
		List<Integer> even = numbers.stream().distinct().filter(s -> s % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		List<String> names = Arrays.asList("vamsi", "sunitha", "ravi", "deepu");
		List<String> uppercase = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);

		Integer sumofsquares = numbers.stream().map(s -> s * s).reduce(0, Integer::sum);
		System.out.println(sumofsquares);

		Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(grouped);

		List<String> startswith = names.stream().filter(s -> s.startsWith("b")).collect(Collectors.toList());
		System.out.println(startswith);

		// Sort Strings by Length
		List<String> lenght = names.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println(lenght);

		// Count Frequency of Each Word
		Map<String, Long> count = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);

		// flatmap
		List<List<String>> nested = Arrays.asList(Arrays.asList("e", "b"), Arrays.asList("c", "v"), Arrays.asList("e"));
		List<String> flat = nested.stream().flatMap(List::stream).sorted().collect(Collectors.toList());
		System.out.println(flat);

		Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		IntSummaryStatistics sumarize = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(sumarize);
		System.out.println(partitioned);

		// Convert List of Strings to a Comma-Separated String
		String comma = names.stream().collect(Collectors.joining(","));
		System.out.println(comma);

		// max,min,sum
		OptionalInt max = numbers.stream().mapToInt(i -> i).max();
		OptionalInt min = numbers.stream().mapToInt(b -> b).min();
		int sum = numbers.stream().mapToInt(b -> b).sum();
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);

		Long len = names.stream().filter(s -> s.length() > 3).count();
		System.out.println(len);

		String n = "vamsi bhargav";
		long uniquecount = n.chars().distinct().count();
		System.out.println(uniquecount);

		// uniuqe numbers
		Map<String, List<Integer>> uniquenumbers = numbers.stream()
				.collect(Collectors.groupingBy(v -> v % 2 == 0 ? "even" : "odd"));
		System.out.println(uniquenumbers);

		// Sort a List of Strings in Reverse Alphabetical Order
		List<String> sortednames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortednames);

		List<String> repeat = Arrays.asList("vamsi", "vamsi", "kiran", "ganga", "manoj", "ganesh");
		Map<String, Long> output = repeat.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		Map<String, Long> output2 = repeat.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		output.forEach((key, value) -> System.out.println(key + " having " + value + " times"));
		System.out.println("Second Approach to write the frequency of words in a array:" + output2);

		// 15-09-2025 words starts with same letter and ends with same letter
		String Str = "apple anna cicic banana level";
		List<String> outpu = Arrays.stream(Str.split("\\s+"))
				.filter(next -> next.charAt(0) == next.charAt(next.length() - 1)).collect(Collectors.toList());
		System.out.println(outpu);

		// 15-09-2025
		Map<Boolean, List<String>> boolean1 = repeat.stream().collect(Collectors.partitioningBy(l -> l.length() > 5));
		System.out.println(boolean1);

		String input = "vamsiiv";

		Character result = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);

		System.out.println(result);

		// unique characters
		String Str43 = "Vamsi";
		boolean non = Str43.chars().mapToObj(s -> (char) s).collect(Collectors.toSet()).size() == Str43.length();
		System.out.println(non);

		// frequency of letter in a string
		String name = "apple";
		Map<Character, Long> charqw = name.chars().mapToObj(b -> (char) b)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charqw);

		// Convert list of strings to lengths
		List<Integer> lengh = Arrays.asList("a", "abc", "wsd").stream().map(String::length).toList();
		System.out.println(lengh);

		// Check if any element is negative
		boolean negative = Arrays.asList(1, -2, 3, -5, -6, 9).stream().anyMatch(b -> b < 0);
		System.out.println(negative); // --- anyMatch() checks if any element matches the condition.

		// Group strings by length
		List<String> group = Arrays.asList("vamsi", "bhargav", "karumuri", "sunitha", "ravi sankar", "deepthi");
		Map<Integer, List<String>> output3 = group.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(output3);

		// Partition numbers into even and odd
		List<Integer> num = Arrays.asList(1, 2, 3, 5, 4, 6, 4, 7, 89, 74, 5);
		Map<Boolean, List<Integer>> partitionnumbers = num.stream().distinct()
				.collect(Collectors.partitioningBy(h -> h % 2 == 0)); // --- collectors.partitioningby returns a
																		// ---- map<boolean,list<t>>
		System.out.println(partitionnumbers);

		// Find first element greater than 10
		Optional<Integer> greater = num.stream().filter(g -> g > 10).findFirst();
		System.out.println(greater);
		// FlatMap a list of lists

		List<List<String>> nested1 = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
		List<String> flatmap = nested1.stream().flatMap(List::stream).toList();
		System.out.println(flatmap);

		// Count frequency of characters
		String strname = "vamsi";
		Map<Object, Long> countfreq = strname.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(y -> y, Collectors.counting()));
		System.out.println(countfreq);
		// --chars() gives an IntStream of character codes.
		// ---mapToObj() converts them to Character.

		// Find Duplicate Elements in a List

		List<Integer> duplicate = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 21, 43, 12, 143, 135, 123324);
		Map<Integer, Long> dn = duplicate.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		List<Integer> duplicatedn = dn.entrySet().stream().filter(t -> t.getValue() > 1).map(Map.Entry::getKey)
				.toList();
		System.out.println(duplicatedn);

		Integer square = duplicate.stream().map(p -> p * p).reduce(0,(a,b) -> a+b);
		System.out.println("squares of above list are :"  +square); // --- reduce() combines all elements into a single result.
		// Filter out null values from a list

		List<String> items = Arrays.asList("a", null, "b");

		List<String> filtered = items.stream().filter(Objects::nonNull).toList();

		System.out.println(filtered); // Output: [a, b]

		String input2 = "stream";

		long count2 = input2.chars() // Step 1: Convert string to character codes
				.mapToObj(c -> (char) c) // Step 2: Convert each code to a character
				.filter(ch -> "aeiou".indexOf(ch) != -1) // Step 3: Keep only vowels
				.count(); // Step 4: Count how many vowels

		System.out.println(count2);
		
		
		//mutiplication of numbers
		List<Integer> multiply = Arrays.asList(2, 3, 44,23,2,4,36);

		int product = multiply.stream()
		    .reduce(1, (a, b) -> a * b);

		System.out.println(product);


	}
}
