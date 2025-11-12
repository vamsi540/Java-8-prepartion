package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employ {
	String name;
	int salary;
	String department;

	public Employ(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}

public class allinterviewcodindquestions {
	public static void main(String[] args) {
		List<Employ> employees = Arrays.asList(new Employ("vamsi", 23, "HR"), new Employ("kiran", 26, "It"),
				new Employ("manoj", 25, "Finance"), new Employ("gangadhar", 28, "HR"));
		List<Integer> numbers = Arrays.asList(1, 3, 45, 6, 7, 623, 4);
		List<String> names = Arrays.asList("vamsi", "ravi sankar", "sunitha", "deepthi", "vamsi");

		// second highest salary
		Integer secondhigh = employees.stream().map(s -> s.getSalary()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().orElse(0);
		System.out.println("Second higest salary is:" + secondhigh);

		// departm,ent count
		Map<String, Long> depCount = employees.stream()
				.collect(Collectors.groupingBy(Employ::getDepartment, Collectors.counting()));

		System.out.println("Department count :" + depCount);

		// highest paid employee in each department

		Map<String, Optional<Employ>> highestpaid = employees.stream().collect(Collectors
				.groupingBy(Employ::getDepartment, Collectors.maxBy(Comparator.comparing(Employ::getSalary))));
		System.out.println("highestpaid is :" + highestpaid);

		// partioningBy
		Map<Boolean, List<Employ>> partioningby = employees.stream()
				.collect(Collectors.partitioningBy(n -> n.getSalary() > 25));
		System.out.println(partioningby);

		// duplicate names

		Set<String> dupliacates = names.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())) // n>n
																												// group
																												// by
																												// the
																												// name
																												// itself
																												// and
																												// collectors.counting:for
																												// each
																												// grp
																												// how
																												// many
																												// times
																												// it
																												// occurs
				.entrySet().stream() // entry set: convert the map into the set of entreies
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(dupliacates);

		// wordcount

		String text = "java python c java c";
		Map<String, Long> wordcount = Arrays.stream(text.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordcount);

		// first non repeated character

		String input = "aabjhwefjhwfjjhwjvj";
		Character nonRepeat = input.chars().mapToObj(c -> (char) c) //// converts each unicode values back to a
																	//// charcater object
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(nonRepeat);

		// sort by salary
		employees.stream().sorted(Comparator.comparing(Employ::getSalary)).forEach(System.out::println);

		// sort by department
		Map<String, List<Employ>> dyDept = employees.stream().collect(Collectors.groupingBy(Employ::getDepartment));
		System.out.println(dyDept);

		// partition by salary>60000
		Map<Boolean, List<Employ>> dysalary = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() > 6000));
		System.out.println(dysalary);
		// uppercase
		List<String> upperCase = names.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
		System.out.println("upper cases are:" + upperCase);

		// join names
		String joined = names.stream().collect(Collectors.joining(","));
		System.out.println("joined names are:" + joined);

		// remove duplicates
		List<String> name = names.stream().distinct().collect(Collectors.toList());
		System.out.println(name);
		// sum of numbers
		// max min , sum and average
		// find maximum number from a list
		int sum = numbers.stream().mapToInt(i -> i).sum(); // i->i coverts into each integer obj to primitive int
		System.out.println(sum);

		List<Integer> number = Arrays.asList(1, 10, 234, 34522342);
		Integer highest = number.stream().mapToInt(i -> i).max().getAsInt();
		System.out.println(highest);

		int max = employees.stream().mapToInt(i -> i.getSalary()).max().orElse(0);
		int min = employees.stream().mapToInt(i -> i.getSalary()).min().orElse(0);

		System.out.println(max);
		System.out.println(min);

		// employees with higest salary
		List<Employ> highSalary = employees.stream().filter(e -> e.getSalary() == max).collect(Collectors.toList());
		System.out.println(highSalary);

		// any salary>1000000
		boolean anySalary = employees.stream().anyMatch(e -> e.getSalary() > 100000);
		System.out.println(anySalary);

		// list to map
		Map<String, Integer> nametoSalary = employees.stream()
				.collect(Collectors.toMap(Employ::getName, Employ::getSalary, (a, b) -> a));
		System.out.println(nametoSalary);

		// averagingsalary
		Double salary = employees.stream().collect(Collectors.averagingInt(e -> e.getSalary()));
		System.out.println(salary);

		// sort strings ignore case

		List<String> ignoreCase = names.stream().sorted((a, b) -> a.compareToIgnoreCase(b))
				.collect(Collectors.toList());
		System.out.println("Ignore Case:" + ignoreCase);

		// top 3 salaries

		List<Integer> top3 = employees.stream().map(s -> s.getSalary()).distinct().limit(3)
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(top3);

		// reverse a string
		String str1 = "hello";
		String revers1 = new StringBuilder(str1).reverse().toString();
		System.out.println("output of reverse a string is:" + revers1);

		// palindrome check
		String str = "madam";
		String reverse = new StringBuilder(str).reverse().toString();
		if (str.equals(reverse)) {
			System.out.println("it is a pallindrome");
		} else {
			System.out.println("not a pallindrome");
		}

		// remove all vowles from string
		String input1 = "vamsi1eoiajkfu";
		String result = input1.replaceAll("[aeiouAEIOU]", " ");
		System.out.println(result);

		// check if two strings are anagrams
		String a = "silent";
		String b = "listen";
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean anagram = Arrays.equals(arr1, arr2);
		System.out.println(anagram);

		// reverse a string without using inbuilt function
		String s = "Vamsi";
		String reversed = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed = reversed + s.charAt(i);

		}
		System.out.println(reversed);

		// check if number is pallindrome or reversed number
		int num = 121;
		int original = num;
		int revers = 0;
		while (num != 0) {
			revers = revers * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(revers == original);

		// removes null from list
		List<String> list = Arrays.asList("vamsi", null, "A", null);
		List<String> dupicates = list.stream().filter(x -> x != null).collect(Collectors.toList());
		System.out.println(dupicates);

		// Find the Second Largest Element in an Array

		int[] arr = { 10, 20, 4, 45, 99, 99 };
		Optional<Integer> secondLargest = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst();// boxed- convert a primitive stream (like IntStream) into a stream of
		// wrapper objects (like Stream<Integer>).

		System.out.println(secondLargest.orElse(-1));

		// remove duplicates from a list
		List<Integer> num1 = Arrays.asList(1, 3, 6, 7, 9, 134, 67, 82, 6, 8);
		Set<Integer> setnum = new HashSet<>(num1);
		System.out.println(setnum);

		// armstrongnymber
		int num4 = 1234, sum56 = 0, temp = num;
		while (num4 > 0) {
			int digit = num4 % 10;
			sum56 = sum56 + digit * digit * digit;
			num /= 10;

		}
		if (sum56 == temp) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not a armstrong number");
		}

//contains specific element
		List<String> specifi = names.stream().filter(x -> !x.startsWith("v")).collect(Collectors.toList());
		System.out.println(" specific names are" + specifi);

	}

}