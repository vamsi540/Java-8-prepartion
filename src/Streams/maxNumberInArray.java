package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class maxNumberInArray {
	public static void main(String[] args) {

		//max in arrays
		int[] numbers = { 5, 9, 123, 54 };
		int max = Arrays.stream(numbers).max().getAsInt();
		System.out.println(max);

		
		//print duplicates 
		List<Integer> num = Arrays.asList(1, 2, 3, 2, 5, 4, 4, 54, 23, 25, 23, 27, 354);

		Map<Integer, Long> duplicates = num.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting())) // Count
																													// occurrences
				.entrySet().stream().filter(entry -> entry.getValue() > 1) // Keep only duplicates
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Duplicates with counts: " + duplicates);

		 
		//condition >10 and  <30
		List<Integer> sum = num.stream().filter(i -> i > 10 & i < 30).collect(Collectors.toList());
		int sumofnumnbers = sum.stream().mapToInt(o -> o).sum();
		System.out.println(sumofnumnbers);

		
		//max
		int maximum = num.stream().mapToInt(e -> e).max().getAsInt();
		System.out.println(maximum);

		// flatmap
		List<Integer> a = Arrays.asList(1, 5, 3, 76, 23);
		List<Integer> b = Arrays.asList(6, 7, 4, 2, 10, 7, 4, 9);
		List<List<Integer>> c = Arrays.asList(a, b);

		List<Integer> flatList = c.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatList);
	}

}
