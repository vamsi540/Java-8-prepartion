package Java_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class employee {
	private int age;
	private String name;
	private int salary;
	private int id;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "employee [age=" + age + ", name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}

	public employee(int age, String name, int salary, int id) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class Advancedcodeforstreams {
	public static void main(String[] args) {

		List<employee> list = Arrays.asList(new employee(23, "vamsi", 100000, 1), new employee(23, "vamsi", 100000, 1),
				new employee(24, "kiran", 200000, 2), new employee(24, "ganga", 30000, 3));

		// Given a list of employees, filter those with salary > 50,000.

		List<employee> salary = list.stream().filter(e -> e.getSalary() > 7000).collect(Collectors.toList());
		System.out.println(salary);

		// Group a list of people by their age.
		Map<Integer, List<employee>> age = list.stream().collect(Collectors.groupingBy(employee::getAge));
		System.out.println(age);

		// Find duplicate elements in a list using streams.
		/*
		 * Set<employee> seen = new HashSet<>(); List<employee> duplicates =
		 * list.stream().filter(e -> !seen.add(e)).collect(Collectors.toList());
		 * duplicates.forEach(System.out::println);//add it returns false if already
		 * present
		 * 
		 * 
		 * 
		 */
		List<Integer> numbers = Arrays.asList(1, 3, 1, 23, 54, 2, 4, 3, 5, 1, 3, 35, 7, 345);
		List<Integer> duplicates = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicates);

		// Count frequency of each character in a string
		String str = "karumuri vamsi bhargav";
		Map<Character, Long> freq = str.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(freq);
	//	mapToObj(c -> (char) c) converts to characters.
		//groupingBy + counting() counts how many times each character appears
		
//vowels and consonants
		String name="hello this is vamsi and i am from hyderabad";//chars()-it is uesd to convert into stream of charcters
	long vowels=	name.toLowerCase().chars().filter(n->"aeiou".indexOf(n)!=-1).count();    //if  its is vowel then it will return 0 as 1 and 1 as e etc
	
	long conso=name.toLowerCase().chars().filter(Character::isLetter).filter(b->"aeiou".indexOf(b)!=-1).count();
		
	System.out.println(vowels);
	System.out.println(conso);

		//odd or even numbers
	List<Integer> number=Arrays.asList(1,2,5,3,6,4,7,8,9,10);
	number.stream().forEach(n-> {
		if(n%2==0) {
			System.out.println("n is even:" +n);
		}else {
			System.out.println("n is odd:"  +n);
		}
		
	});
		
		
		
	}

}
