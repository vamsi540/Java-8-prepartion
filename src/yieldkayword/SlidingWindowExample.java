package yieldkayword;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SlidingWindowExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int k = 3;

		List<Integer> windowSums = IntStream.range(0, list.size() - k + 1).mapToObj(i -> list.subList(i, i + k))
				.map(sub -> sub.stream().mapToInt(Integer::intValue).sum()).collect(Collectors.toList());

		System.out.println(windowSums); // Output: [6, 9, 12]
	}
}

/*
 * IntStream.range(0, list.size() - k + 1)
 * 
 * IntStream.range(start, end) generates a stream of integers from start
 * (inclusive) to end (exclusive). Here:
 * 
 * start = 0 end = list.size() - k + 1 → 5 - 3 + 1 = 3
 * 
 * 
 * So it generates 0, 1, 2 → these are starting indices of each window.
 * 
 * 
 * .mapToObj(i -> list.subList(i, i + k))
 * 
 * For each index i, take a sublist from i to i + k (exclusive). Example:
 * 
 * i = 0 → subList(0, 3) → [1, 2, 3] i = 1 → [2, 3, 4] i = 2 → [3, 4, 5]
 * 
 * 
 * Now the stream contains windows as lists.
 * 
 * 
 * .map(sub -> sub.stream().mapToInt(Integer::intValue).sum())
 * 
 * For each window (sublist):
 * 
 * Convert it to a stream: sub.stream() Convert each Integer to int:
 * .mapToInt(Integer::intValue) Sum all elements: .sum()
 */
