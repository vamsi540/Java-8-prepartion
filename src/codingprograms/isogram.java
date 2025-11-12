package codingprograms;

import java.util.HashSet;
import java.util.Set;

public class isogram { 

	public static void main(String[] args) {

		System.out.println(isIsogram("Machine")); // true

	}

	public static boolean isIsogram(String input) {
		input = input.toLowerCase().replaceAll("[^a-z]", "");
		Set<Character> s = new HashSet<>();
		for (char c : input.toCharArray()) {
			if (s.contains(c)) {
				return false;
			}
			s.add(c);
		}
		return true;
	}
}
