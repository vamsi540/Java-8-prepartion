package Interface;

 public interface  Cars {
	 public void lights();
	 
	 public void seats();
	 
	 public void gears();
	 
	 
	 
	 
	 
	
	 
	 //we can use both laptop and dell in default methld whereas we cannot use default method keyboard in public and private methods
	 public default void keyboard() {
		 System.out.println("sh");
		 laptop();
		 dell();
		 
		 
	 }
	 
	 private static void laptop() {
	 }
	 
	 public static void dell() {
	 }
	 
	

}
