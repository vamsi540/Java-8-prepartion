package Array;

import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Benz");
		cars.add("Tata");
		cars.add("Baleno");
		cars.add(3, "Jaguar");
		cars.get(3);
		cars.set(2, "Bal");
		cars.size();
		for(int i=0;i<cars.size();i++) {
		System.out.println(cars.get(i));

	}

}
}
