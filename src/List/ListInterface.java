package List;

import java.util.ArrayList;

public class ListInterface {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("Good! Morning");
		al.add("thrusday");
		al.set(2, " it is a weekend");
		al.lastIndexOf(1);
		// al.remove(0);
		al.contains("Hello");
		al.get(1);
		/*
		 * Iterator<String> s = al.iterator(); while (s.hasNext()) {
		 * System.out.println(s.next()); }
		 */
		System.out.println(al);

	}
	
}