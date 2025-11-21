package immutableclassforastring;

public class AppStart {

	public static void main(String[] args) {
		Address addr = new Address("AP");
		Bank b1 = new Bank("sbi", addr);
		System.out.println(b1); 
		addr.setState("goa");
		System.out.println(b1);

	}

}
 