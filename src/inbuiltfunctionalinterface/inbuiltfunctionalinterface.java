package inbuiltfunctionalinterface;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class inbuiltfunctionalinterface {

	public static void main(String[] args) {

		String str = "vamsi bhargav";
		Consumer<String> c = s -> System.out.println(s);
		c.accept("karumuri");

		Predicate<String> word = t -> t.length() > 10;
		Boolean output = word.test(str);
		System.out.println(output);

		Function<String, Integer> f = b -> b.length();
		
		Integer apply = f.apply(str);
		System.out.println(apply);

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		System.out.println(s.get());

	}

}
