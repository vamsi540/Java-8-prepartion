package Optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streams {	public static void main(String[] args) {

	List<String> names = Arrays.asList("vamsi", "v", "bhargav", "b", "v","null");
	String na=names.stream().collect(Collectors.joining(" ,"));
	System.out.println(na);
	
	
	//reverse a string for each and each element in a string
	names.stream().map(s-> new StringBuilder(s).reverse()).forEach(System.out::println);
	
	//removes null elemnets from a string
	names.stream().filter(s->s!=null).forEach(System.out::println); 
}
}