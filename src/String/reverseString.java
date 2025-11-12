package String;

public class reverseString {
	public static void main(String[] args) {
		String str= "Java Springboot micro-services kafka redis";
		String reverse= new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
	}
}
