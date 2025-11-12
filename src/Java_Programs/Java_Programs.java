package Java_Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employe {
	String name;
	int age;
	double salary;

	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public Employe(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Java_Programs {

	// Finding Averge And Sum with Employee Class
	public static void main(String[] args) {

		List<Employe> list = new ArrayList<>();
		list.add(new Employe("vamsi", 25, 10000));
		list.add(new Employe("sunitha", 56, 34000));
		list.add(new Employe("ravi sankar", 58, 32000));
		list.add(new Employe("deepthi", 27, 560000));
		list.add(new Employe("amrutha", 23, 187000));
		list.add(new Employe("amrutha", 26, 183000));

//maptodouble -Converts the stream of Double objects into a primitive double stream (DoubleStream).
//getasdouble -Extracts the actual double value from the OptionalDouble.
		Double doubleList = list.stream().map(e -> e.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		System.out.println(doubleList);

		// 2nd way to write the code for average salary and double
		double dlist = list.stream().map(Employe::getSalary).mapToDouble(i -> i).average().getAsDouble();
		System.out.println(dlist);

		// averagingDouble
		// This collector is used to calculate the average of a double-valued function
		// applied to the elements of a stream.
		double averagingDouble = list.stream().collect(Collectors.averagingDouble(Employe::getSalary));
		System.out.println("AveragingDouble of salary for the employee is:" + averagingDouble);

		// summarizing double
		// This collector provides summary statistics (count, sum, min, average, max)
		// for a double-valued function.
		// doublesummarystatistics:it consists of sum,min,avearage and max
		DoubleSummaryStatistics summarizingDouble = list.stream()
				.collect(Collectors.summarizingDouble(Employe::getSalary));
		System.out.println("summarizingDouble having sum,min,max,average :" + summarizingDouble);

		// This code calculates the average salary for each grade of employees in the
		// list, and stores the result in a
		// Map<String, Double> where:
		Map<Integer, Double> gropuingageandsalary = list.stream()
				.collect(Collectors.groupingBy(Employe::getAge, Collectors.averagingDouble(Employe::getSalary)));
		System.out.println(gropuingageandsalary);

		// equalsignorecase
		Double equalsignorecase = list.stream().filter(e -> e.getName().equalsIgnoreCase("amrutha"))
				.mapToDouble(Employe::getSalary).average().getAsDouble();
		System.out.println(equalsignorecase);

		// total sum

		Double sum = list.stream().map(e -> e.getSalary()).mapToDouble(i -> i).sum();
		System.out.println(sum);

		Map<String, Double> nameandsalary = list.stream().filter(e -> e.getName().equalsIgnoreCase("vamsi"))
				.collect(Collectors.groupingBy(Employe::getName, Collectors.averagingDouble(Employe::getSalary)));
		System.out.println(nameandsalary);

		// natural order and reverse order
		List<Integer> add = new ArrayList<>();
		add.add(1);
		add.add(45);
		add.add(3);
		add.add(76);
		List<Integer> naturalorder = add.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(naturalorder);
		List<Integer> reverseorder = add.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseorder);
		List<Integer> ro2 = add.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		System.out.println(ro2);

		List<Integer> even = add.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		
		
		
		
		
		
	}
}