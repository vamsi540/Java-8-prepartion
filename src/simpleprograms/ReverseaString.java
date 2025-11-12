package simpleprograms;

public class ReverseaString {
	public static void main(String[] args) {
		String var = "vamsi";
		String reversed = new StringBuilder(var).reverse().toString();
		System.out.println(reversed);
	}
}
