package String;

public class ToString {
	int age;
	String name;

	public ToString(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String ToString() {
		return age + " " + name;
	}

	public static void main(String[] args) {
		ToString s1 = new ToString(23, "vamsi");
		ToString s2 = new ToString(25, "bhargav");
		System.out.println(s1);

		System.out.println(s2);
	}

}
