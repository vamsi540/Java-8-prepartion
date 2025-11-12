package TypeCastingandWrapperClassandthreads;

public class TCWC {
	public static void main(String[] args) {
		// implicit
		int intVal = 1;
		double doubleVal = intVal;
		System.out.println(doubleVal);

		String str = "12334";
		int parsedChar = Integer.parseInt(str);
		System.out.println("parsedChar:" +parsedChar);

	}
}
