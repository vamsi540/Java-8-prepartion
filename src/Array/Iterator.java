package Array;

import java.util.ArrayList;

public class Iterator {
	public static void main(String[] args) {

		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Get the iterator
		java.util.Iterator<String> it = cars.iterator();//syntax
		while (it.hasNext()) {   //print the first element in the arraylist
			String b = it.next();		//going to next element in the list
			System.out.println("print the value:"  +b);
		}

	}

}
