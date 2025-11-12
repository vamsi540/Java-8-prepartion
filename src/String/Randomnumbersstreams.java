package String;

import java.util.Random;
import java.util.stream.IntStream;

public class Randomnumbersstreams {//: Generating a Stream of Random Numbers


	public static void main(String[] args) {
		Random random=new Random();
		IntStream randomNumbers = random.ints(6, 1, 200);//here 6 is a size and 1,200 are limit means 1 to 200
		randomNumbers.forEach(System.out::println);
	}
}
//here we have used random.ints for printing the random numbers