package Abstarct;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 22, 93, 239);
		numbers.forEach(i -> System.out.println(i));
	}

}
