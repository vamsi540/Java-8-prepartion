package Streams;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class student {
	private String name;
	private int age;
	private String email;
	private double phonenumber;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", email=" + email + ", phonenumber=" + phonenumber + ", id="
				+ id + "]";
	}

	public student(String name, int age, String email, double phonenumber, int id) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phonenumber = phonenumber;
		this.id = id;
	}

}

public class Flatmap {

	public static void main(String[] args) {
		List<student> list = new ArrayList<>();

		list.add(new student("vishnu", 23, "bairi@gmail.com", 90594, 1));
		list.add(new student("vamsi", 25, "vamsi@gmail.com", 90532494, 2));
		list.add(new student("kiran", 23, "kiran@gmail.com", 934594, 3));
		list.add(new student("bhargav", 28, "bhargav@gmail.com", 902334594, 4));
		List<String> list1 = list.stream().map(e -> e.getEmail()).collect(Collectors.toList());
		System.out.println(list1);

		List<String> name = list.stream().map(student::getName).collect(Collectors.toList());
		System.out.println(name);

		// functional interfaces and its types called as consumer,predicate,function and
		// suppiler
		String str = "vamsi bhargav";
		Predicate<String> word = t -> t.length() > 10; // it will take one argument and gives the result in boolean
														// format
		Boolean str1 = word.test(str);
		System.out.println(str1);

		Function<String, Integer> f = s -> s.length(); // it will take the argument and gives the result after the
														// request processing
		Integer apply = f.apply(str);
		System.out.println(apply);

		Consumer<String> c = s -> System.out.println(s);// forEach

		c.accept("ramesh");

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();

		System.out.println(s.get());

		// Find the age List whose salary Greater than 18 with student Class.
		List<student> age = list.stream().filter(e -> e.getAge() > 15).collect(Collectors.toList());
		System.out.println(age);

		List<student> names = list.stream().sorted(Comparator.comparing(student::getName).reversed())
				.collect(Collectors.toList());
		System.out.println("names are:" + names);

		List<student> age1 = list.stream().filter(n -> n.getAge() > 10).collect(Collectors.toList());
		System.out.println("Students age are :" + age1);

		// dupliacate names
		List<Integer> d = Arrays.asList(1, 2, 56, 32, 1, 35, 5723, 2345, 1, 2);
		List<Integer> duplicates = d.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicates);

		// foreach
		List<String> names1 = Arrays.asList("vamsi", "kiran", "mpa", "manoj", "shoban", "ganga");
		names1.stream().forEach(System.out::println); // first way

		for (String s1 : names1) {
			System.out.println("names are:" + s1); // second way

		}

		Map<String, Integer> hm = new HashMap<>();
		hm.put("Banana", 2);
		hm.put("Apple", 5);
		hm.put("Orange", 3);
		Set<Map.Entry<String, Integer>> entryset = hm.entrySet(); // get the entry set from the map
		Stream<Map.Entry<String, Integer>> streamentryset = entryset.stream();// convert the entire set to stream
		Stream<Map.Entry<String, Integer>> sortedStream = streamentryset.sorted(Map.Entry.comparingByKey());// sort the
		// stream by// keys

		List<Map.Entry<String, Integer>> sortedList = sortedStream.collect(Collectors.toList());
		// Collect the sorted entries into a list

		sortedList.forEach(System.out::println);

		// instead of writing the code in above format we can wirte the code in below
		// format too.
		List<Entry<String, Integer>> comparingbykey = hm.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toList());

		System.out.println("Comparing key:"   +comparingbykey);

		List<Entry<String, Integer>> list34 = hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());

		System.out.println(list34);

		List<Entry<String, Integer>> result = hm.entrySet().stream().filter(a -> a.getKey().startsWith("B"))
				.filter(b -> b.getValue() < 6).collect(Collectors.toList());
		System.out.println(result);

		// Write a code for Increment the salaries Based on the Condition
		List<student> list12 = new ArrayList<>();

		list12.add(new student("vishnu", 23, "bairi@gmail.com", 90594, 1));
		list12.add(new student("vamsi", 25, "vamsi@gmail.com", 90532494, 2));
		list12.add(new student("kiran", 23, "kiran@gmail.com", 934594, 3));
		list12.add(new student("bhargav", 28, "bhargav@gmail.com", 902334594, 4));
		List<Double> increament = list12.stream().filter(g -> g.getAge() > 25).map(y -> y.getPhonenumber() * 12)
				.collect(Collectors.toList());

		System.out.println(increament);

		// 0123456 stringbuilder
		String str1s = "a124b2c3";
		StringBuilder sb = new StringBuilder(str1s);
		sb.delete(2, 5);
		System.out.println(sb);

		// stringbuffer
		String stringbuffer = "vamsi bhargav";
		StringBuffer sbf = new StringBuffer(stringbuffer);
		sbf.reverse();
		sbf.delete(3, 6);
		System.out.println(sbf);

		// Square Values of List of Elements

		List<Integer> square = Arrays.asList(1, 2, 56, 32, 1, 35, 5723, 2345, 1, 2);
		List<Integer> numbers = square.stream().map(x -> x * 2).filter(value -> value > 20)
				.collect(Collectors.toList());
		List<Integer> evennumbers = square.stream().filter(q -> q % 2 == 0).collect(Collectors.toList());
		List<Integer> oddnubers = square.stream().filter(v -> v % 2 != 0).collect(Collectors.toList());

		System.out.println(numbers);
		System.out.println(oddnubers);
		System.out.println(evennumbers);

		// Find Any and Find First Example

		List<Integer> find = Arrays.asList(8, 3, 4, 5, 6, 7);
		Optional<student> element = list.stream().findFirst();
		if (element.isPresent()) {
			System.out.println(element.get());
		} else {
			System.out.println("empty");
		}
		Optional<student> element1 = list.stream().findAny();
		if (element1.isPresent()) {
			System.out.println(element1.get());
		} else {
			System.out.println("empty");
		}
		Integer firsst = find.stream().findFirst().get();
		System.out.println(firsst);

		Integer any = find.stream().findAny().get();
		System.out.println(any);

		List<student> age2 = list.stream().map(e -> {
			if (e.getAge() > 22) {
				e.setId(e.getId() * 10);
			}
			return e;

		}).collect(Collectors.toList());
		System.out.println(age2);
		
		
		
		
		// average age number
		
	double stream=	list.stream().map(o->o.getId()).mapToDouble(n->n).average().getAsDouble();
	System.out.println(stream);
	}
}
