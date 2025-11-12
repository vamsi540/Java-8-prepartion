package Exceptions;

public class Arrayoutofindexexception {
	public static void main(String[] args) {  

	int[] arr = {1,2,4,5,6};
			try {
		            for (int i = 0; i <= arr.length; i++) { 
		            	System.out.println(arr[i]);

				}
				
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Exception is :" +e.getMessage());
			}
	}

}
