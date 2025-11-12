package Abstarct;

public class Yamaha extends Bikes {
	public  void handle() {
		System.out.println("red");
		
	}
	public static void main(String[] args) {
	Bikes y1 = new Yamaha();
	y1.gears();
 
}
}