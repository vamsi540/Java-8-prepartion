package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		// filter
		/*
		 * List<String> l = Arrays.asList("Ravi sankar", "Sunitha", "Deepthi", "Vamsi",
		 * "vam", "v"); // filter the names with lenngh greater than 3 List<String>
		 * names = l.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
		 * System.out.println(names);
		 */

		/*
		 * //map //mutliply each number by using 2
		 * 
		 * List<Integer> num=Arrays.asList(1,3,5,6,8,9); List<Integer>
		 * output=num.stream().map(n->n*2).collect(Collectors.toList());
		 * System.out.println(output);
		 */

		// flatmap //flatten the list of fruits
		List<List<String>> fruits = Arrays.asList(Arrays.asList("Apple", "banana", "Cherry"),
				Arrays.asList("Mango", "pineapple"));
		List<String> allfruits = fruits.stream().flatMap(List::stream).collect(Collectors.toList());
		// flatten the list and filter fruits starting with A
//		List<String> allfruits = fruits.stream().flatMap(List::stream).filter(n -> n.startsWith("A"))
//				.collect(Collectors.toList());
		System.out.println(allfruits);

		// sorted
		// sort number in natural order

		/*
		 * List<Integer> num=Arrays.asList(6,3,7,1,9,0); List<Integer>
		 * l=num.stream().sorted().collect(Collectors.toList()); System.out.println(l);
		 */

		/*
		 * //give the reverse order List<String> names=Arrays.asList("Ravi sankar",
		 * "Sunitha", "Deepthi", "Vamsi", "vam", "v"); List<String>
		 * sortedList=names.stream().sorted((a,b) ->
		 * b.compareTo(a)).collect(Collectors.toList()); System.out.println(sortedList);
		 */

		// limit //get the first 3 elements in the list
		List<Integer> num = Arrays.asList(6, 3, 7, 1, 9, 0);
		List<Integer> limitofthreenumbers = num.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitofthreenumbers);

		 //skip the first three elements
		List<Integer> skip = Arrays.asList(6, 3, 7, 1, 9, 0);
		List<Integer> skipthethreeelemets = skip.stream().skip(3).collect(Collectors.toList());
		System.out.println(skipthethreeelemets);

		// filter even numbers and skip the first 2

		List<Integer> skipnumbers = Arrays.asList(5, 6, 73, 5, 2);
		List<Integer> output = skipnumbers.stream().filter(n -> n % 2 == 0).skip(2).collect(Collectors.toList());
		System.out.println(output);

		List<Integer> distinct = Arrays.asList(1, 2, 4, 1, 2, 5, 7, 8);
		List<Integer> elemets = distinct.stream().distinct().collect(Collectors.toList());
		System.out.println(elemets);

		// peek by using foreach
		List<String> peek = Arrays.asList("Vamsi", "ganga", "ganesh", "siva", "kiran");
		peek.stream().peek(s -> System.out.println("before map:" + s)).map(s -> s.toLowerCase())
				.peek(s -> System.out.println("after map:" + s)).forEach(System.out::println);

		// sorted using comparator
		List<String> list = Arrays.asList("Vamsi", "ganesh", "bhargav", "mouse");
		List<String> numbers = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		// list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		System.out.println(numbers);

	}
}