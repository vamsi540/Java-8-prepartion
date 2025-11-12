package String;

import java.util.Arrays;
import java.util.List;

public class Streamsmaximumnumber { // How do you find the maximum number in a list using streams?
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);

		int maxNumber = intList.stream().max(Integer::compare).orElseThrow();
		System.out.println("Max number is:" + maxNumber);
	}
}
//here we are using integer::compare bcz it will compare the indexies of the list as we mentioned.