package String;

import java.util.List;

public class StreamsSum {// How do you sum all numbers in a list using streams?

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int al = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of the numbers are:" + al);
	}

}
