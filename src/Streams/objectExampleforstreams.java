package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}
}

public class objectExampleforstreams {
	public static void main(String[] args) {
		List<Employee> e = Arrays.asList(new Employee("Vamsi", 23), new Employee("bhargav", 23), new Employee("c", 23));
		// extract the names of employees

		List<String> emplolyeesnames = e.stream().map(n -> n.name).collect(Collectors.toList());
		System.out.println(emplolyeesnames);
	}
}
