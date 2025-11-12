package Streams;

public class Fizzbuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");

			} else {
				if (i % 3 == 0) {
					System.out.println("Fizz");
				} else {
					if (i % 5 == 0) {
						System.out.println("bizz");
					} else {
						System.out.println(i);
					}

				}

			}
		}
	}

}
