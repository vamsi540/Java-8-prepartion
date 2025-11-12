package SuperandFinalKeywords;

public class Dog extends Animal {
	final String name = "buddy";

	Dog() {
		super();
	}

	void display() {
		System.out.println("type from super:" + super.type);
	}


}
