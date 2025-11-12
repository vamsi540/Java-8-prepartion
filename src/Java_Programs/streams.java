package Java_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streams {

	public static void main(String[] args) {

		// Filter even numbers from a list of integers.
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 3, 5, 234, 2, 32, 8);
		List<Integer> even = numbers.stream().distinct().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		// Convert a list of strings to uppercase.
		List<String> names = Arrays.asList("vamsi", "Ravi", "sunitha", "deepthi");
		List<String> uppercase = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);

		// Count the number of strings that start with a specific letter.

		List<String> count = Arrays.asList("vamsi", "ravi", "sunitha", "deepthi");
		long letter = count.stream().filter(s -> s.startsWith("v")).count();
		System.out.println(letter);

		// Sort a list of strings alphabetically using streams.
		List<String> sort = Arrays.asList("vamsi", "ravi", "sunitha", "deepthi");
		List<String> alpha = sort.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(alpha);

		// Find the maximum number in a list using streams.
		List<Integer> max = Arrays.asList(1, 2, 4, 5, 7, 3, 5, 234, 2, 32, 8);
		Integer maximum = max.stream().mapToInt(i -> i).max().getAsInt();
		System.out.println(maximum);
		// Count Elements Greater Than a Value
		List<Integer> greater = Arrays.asList(1, 2, 4, 5, 7, 3, 5, 234, 2, 32, 8);
		int threshold = 10;
		long countNumbers = greater.stream().filter(n -> n > threshold).count();
		System.out.println(countNumbers);
//Sort a List of Strings

		List<String> sortofstrings = Arrays.asList("vamsi", "bhargav", "karumuri");
		List<String> sortedStrings = sortofstrings.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedStrings);

		// Group Strings by Length

		List<String> Group = Arrays.asList("vamsi", "bhargav", "karumuri");
		Map<Integer, List<String>> groupStrings = Group.stream().collect(Collectors.groupingBy(String::length));
		groupStrings.forEach((length, group) -> System.out.println("Length " + length + ": " + group));

		// Find the Maximum Value in a List

		List<Integer> maximu = Arrays.asList(1, 2, 4, 5, 7, 3, 5, 234, 2, 32, 8);
		int maxvalues = maximu.stream().mapToInt(i -> i).max().getAsInt();
		System.out.println(maxvalues);

		// duplicate numbers
		List<Integer> duplicate = Arrays.asList(1, 2, 4, 5, 7, 3, 5, 234, 2, 32, 8);
		List<Integer> d = duplicate.stream().distinct().collect(Collectors.toList());
		System.out.println(d);

		// Flatten a List of Lists

		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9));
		List<Integer> Flat=nestedList.stream().flatMap(m->m.stream()).collect(Collectors.toList());
		System.out.println(Flat);

		
		//sum of sqaures
		List<Integer> square = Arrays.asList(1, 2, 4, 5, 7, 3, 5, 234, 2, 32, 8);
		List<Integer> sqnumbers=square.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(sqnumbers);

	}
}