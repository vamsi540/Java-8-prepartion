package Java_Programs11082025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java_programs {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 7, 10, 45, 12, 78, 234);
		Set<Integer> set = new HashSet<>();
		for (int d : numbers) {
			if (set.add(d)) {
				System.out.println(d);

			}
		}

		Set<Integer> secondApproach = numbers.stream().collect(Collectors.toSet());
		System.out.println("Duplicate numbers:" + secondApproach);

		// area of traingle
		Double height, base, area;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter height of the triangle:: ");
		height = scan.nextDouble();
		System.out.print("Enter base of the triangle:: ");
		base = scan.nextDouble();
		area = (base * height) / 2;
		System.out.println("Area = " + area);

		// Java Program to Find ASCII Value of a character?
		int c = 'v';
		int ascii = c;
		System.out.println("ascii of the letter:" + ascii);

		// Program to convert Celsius into Fahrenheit?
		float celsius, fahrenheit;
		celsius = 34;
		fahrenheit = ((celsius * 9 / 5)) + 32;
		System.out.println(celsius);
//swap two numbers
		int x = 9, y = 2, temp;

		temp = x;
		x = y;
		y = temp;
		System.out.println(x + "  " + y);

		// Java Program to Check Whether a Number is Even or Odd?

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		IntStream.of(num).forEach(n -> {
			if (n < 0) {
				System.out.println(n + " is neither even nor odd");
			} else if (n % 2 == 0) {
				System.out.println(n + " is even");
			} else {
				System.out.println(n + " is odd");
			}
		});

		// Java Program to Check Whether an Alphabet is Vowel or Consonant?

		Scanner vowel = new Scanner(System.in);
		char ch = vowel.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
		} else {
			System.out.println("Given character is a consonant");
		}
		// Java Program to Find Largest of Three Numbers?

		int v, a, z;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		v = s.nextInt();
		System.out.print("Enter the second number:");
		a = s.nextInt();
		System.out.print("Enter the third number:");
		z = s.nextInt();
		if (v > a && v > z) {
			System.out.println("Largest number is:" + x);
		} else if (a > z) {
			System.out.println("Largest number is:" + y);
		} else {
			System.out.println("Largest number is:" + z);
		}

		// Java Program to Check Leap Year?

		int year;
		System.out.println("Enter an Year :: ");
		Scanner yearsc = new Scanner(System.in);
		year = yearsc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified year is not a leap year");
	
		
		//random numbers
		Random rand=new Random();
		rand.ints(1,100).limit(10).sorted().forEach(System.out::println);		
		
		
		
		
		

	}
	

}
