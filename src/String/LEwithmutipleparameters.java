package String;

@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);
}

public class LEwithmutipleparameters {
	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
         
		MathOperation multi = (a, b) -> a * b; 
		System.out.println("Addition: " + addition.operate(5, 3));
		System.out.println("multi: " + multi.operate(5, 3));

	}  

}
