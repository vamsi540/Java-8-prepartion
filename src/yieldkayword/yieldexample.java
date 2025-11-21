package yieldkayword;

public class yieldexample {

	public static void main(String[] args) {
		int number = 2;
		String result = switch (number) {
		case 1 -> {
			System.out.println("Matched 1");
			yield "one";
		}
		case 2 -> {
			System.out.println("Matched 2");
			yield "two";
		}

		default -> {
			System.out.println("nothing matched");
			yield "unknown";
		}
		};
		System.out.println("Result : " + number);
	}

}
