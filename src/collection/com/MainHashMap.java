package collection.com;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "kiran");
		Employee e2 = new Employee(102, "Rahul");
		Employee e3 = new Employee(103, "Rahul");

		Map<Employee, String> employeeMap = new HashMap<>();
		employeeMap.put(e1, "Develop");
		employeeMap.put(e2, "Test");
		employeeMap.put(e3, "Test");

		for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey() + " =>" + entry.getValue());
		}
	}

}
