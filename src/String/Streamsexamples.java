package String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsexamples {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "ankle");
		// Stream<Integer> stream = al.stream(); Creating a Stream from a list
		List<String> FS = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());// filtering 
		List<String> UC = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());//mapping
		FS.forEach(System.out::println);
		UC.forEach(System.out::println);

	}
}
