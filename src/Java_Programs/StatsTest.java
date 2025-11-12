package Java_Programs;

import java.util.Arrays;
import java.util.List;

public class StatsTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

		Stats stats = numbers.stream().collect(StatsCollector.toStats());

		System.out.println(stats);
	}
}
