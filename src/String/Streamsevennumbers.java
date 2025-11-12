package String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsevennumbers { // How do you filter even numbers from a list using streams?
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evennumbers = intList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		evennumbers.forEach(System.out::println);

	}
}
