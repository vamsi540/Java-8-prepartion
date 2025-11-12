package math;

public class Wrapper {
	/*
	 * int a=10; int b=40; public void sum() { System.out.println("Sum is :" +a+b);
	 * 
	 * }
	 */	public static void main(String args[]){  
		int a=10;
		Integer i =Integer.valueOf(a);
		Integer j=a;//autoboxing --- converting primitve into respective wrapper type  
		System.out.println(a+" "+i+" "+j);
		
		
	//unboxing -- converting wrapper type into primitive objects
		Integer b= new Integer(3);
		int h =b.intValue();
		int k=b;
		System.out.println(b+" "+h+" "+k);
		//System.out.println(b.sum(a, b));
	}
	

}
