package Interface;

public class Users {
	public static void main(String[] args) {
		Baleno b = new Baleno();
		b.seats();

		Audi a = new Audi();
		a.lights();
		
		Cars c = new Audi();
		c.gears();
		
		
	}
}

//we canont create the objects or instances for the interfaces