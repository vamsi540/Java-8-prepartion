package Streams;

import java.util.Arrays;
import java.util.List;

public class newcoding08102025 {

	public static void main(String[] args) {

		// countgreaterthan
		List<Integer> num = Arrays.asList(2, 4, 6, 8, 10, 12);
		// num.set(2, 32);
		// num.add(999);// unsupported operational exception -- means that you're trying
		// to add an
		// element to a list that doesn't support adding.
		// how to fix it
		// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
		// list.add("D"); // ✅ Works fine

		long count = num.stream().filter(n -> n > 3).count();
		System.out.println(count);

		// removeemptystrings

		String[] input = { "java", "", null, "Streams", " " };
		String[] array = Arrays.stream(input).filter(b -> b != null).filter(s -> !s.isBlank()).toArray(String[]::new);
		//second way to write  filter function .filter(Objects::nonNull)
		System.out.println(Arrays.toString(array));

		
		//streams logic
		int result = num.stream().filter(n -> n % 4 == 0).map(n -> n / 2).reduce(1, (a, b) -> a * b);
		System.out.println(result);

		// First, it filters the numbers that are divisible by 4.
		// Then, it maps each filtered number by dividing it by 2.
		// Finally, it reduces the mapped values by multiplying them together, starting
		// with 1.
		// 4/2=2 ,1*2=2
		// 8/2=4,1*2*4=8 
		// 12/2=6,8*6=48
	}  

}
