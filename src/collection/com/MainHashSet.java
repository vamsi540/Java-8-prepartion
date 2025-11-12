package collection.com;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Kiran");
		Employee e2 = new Employee(102, "Rahul");
		Employee e3 = new Employee(101, "Kiran");

		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);

		for (Employee emp : employeeSet) {
			System.out.println(emp);
		}

	}

}
