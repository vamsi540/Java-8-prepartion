package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

public class HighestSalary {
	public static void main(String[] args) {
		List<Employe> salary = Arrays.asList(new Employe("vamsi", 23, 4000), new Employe("kiran", 26, 456457));//aslist -array to list
		// Employe highest = salary.stream().max(Comparator.comparing(s ->
		// s.salary)).get();//highest salary
		Double highest = salary.stream().map(s -> s.getSalary()).skip(1).sorted(Comparator.reverseOrder()).findFirst()
				.get();//second highest salary
		//salary.stream().filter(s->s.getSalary()).skip(1).findFirst().orElseThrow();
		System.out.println(highest);
	}

}
