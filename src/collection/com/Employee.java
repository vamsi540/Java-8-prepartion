package collection.com;

import java.util.Objects;

public class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee emp = (Employee) o; // Type casts the object to Employee so we can access its fields (id, na
		return id == emp.id && Objects.equals(name, emp.name);

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "'}";
	}

}
