package oopsconcept;

public class StaticBlock {
	public static void dell() {
		System.out.println("Dell laptop");
	}

	static {
		System.out.println("static block");
		StaticBlock.main(null);
	}

	public static void main(String[] args) {
		StaticBlock.dell();
		System.out.println("main Method");
//		System.out.println(args.length);
		StaticBlock sta = new StaticBlock();
	}

	
	//static block will be print first bcz if u are having static methods then also static block will be print first and after that 
	//based on the calling the main method will call .
}