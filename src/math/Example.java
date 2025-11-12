package math;

public class Example {
	
	int bus(int a,int b) {
		if (a> b) {
			System.out.println("Increament the value:"   +a+b  );
		}else {
			System.out.println("decrement the value :" +a*b);
		}
		return a+b;
	}
	
	 public static void main(String args[]){  
		Example e=new Example();
		System.out.println(e.bus(10,10));
		}
	 
	 }
	 



