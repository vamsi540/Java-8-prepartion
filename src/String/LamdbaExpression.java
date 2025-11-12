package String;

import java.util.Arrays;
import java.util.List;

public class LamdbaExpression {
	public static void main(String[] args) {
		/*
		 * ArrayList<String> a= new ArrayList<>(); a.add("Vamsi"); a.add("ganesh");
		 * a.add("Siva"); a.add("Vijay");
		 */
		//instead of add the names one by one we can use arrays.aslist
		List<String> a = Arrays.asList("Vamsi","Siva","Ganesh","Vijay");
		//a.forEach(name -> System.out.println(name));   instead of 14 lines we can write 15 lines for the output
		a.forEach(System.out::println);

		
		}

}
