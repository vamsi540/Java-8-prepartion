package Exceptions;

public class Throw {

	public static void validateAge(int age,String name) {//created method for validateage with two parameters
		try {
		if(age<18){
            throw new IllegalArgumentException("Age must be 18 or above");
		}
		else {
            System.out.println("Access granted");

		}
	}catch(IllegalArgumentException e) {
        System.out.println("Exception caught: " + e.getLocalizedMessage());

	}
}
	
	public static void main(String[] args) {  
		validateAge(12, "Vamsi");
	}
	
}





