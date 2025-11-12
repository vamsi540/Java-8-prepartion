package Singleton;

public class singleton {
	private static singleton instance;

	private singleton() {
		System.out.println("Singleton instance created");

	}

	public static singleton getInstance() {
		if (instance == null) {
			instance = new singleton();
		}
		return instance;

	}

	public void show() {
		System.out.println("hello this is vamsi");
	}

	public static void main(String[] args) {
		singleton s1 = singleton.getInstance();
		singleton s2 = singleton.getInstance();
		System.out.println(s1 == s2);

	}
}
