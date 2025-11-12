package Exceptions;

public class Exception {
	public static void main(String[] args) {  
int a=50;
int b=0;
try {
	int data=a/b;
	
}catch(ArithmeticException e){
	System.out.println(e);
	   System.out.println("rest of the code...");    

}
finally {
	System.out.println("the code is excuted");
}
	}

}
