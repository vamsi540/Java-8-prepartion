package Streams50QA;

import java.util.Arrays;

public class Stream1 {
	public static void main(String[] args) {

		
		// find the words with k vowels in a given sentence

		String str = "Hello,good morning ,this is vamsi from machilipatnam near government hosipital road";
		int k = 2;
		Arrays.stream(str.split(" ")).filter(ch -> countVowels(ch) == k).forEach(System.out::println);
	}

	public static long countVowels(String word) {
		return word.chars().mapToObj(ch -> (char) ch).filter(ch -> "aeio0AEIOU".indexOf(ch) != -1).count();
	}
}
