package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {

		ArrayList<Integer> cars = new ArrayList<Integer>();
		cars.add(20);
		cars.add(10);
		cars.add(40);
		cars.add(60);

		Collections.sort(cars, Collections.reverseOrder());//method for reverse the arraylist
		for (Integer i : cars) {
			System.out.println(i);

		}
	}
}
