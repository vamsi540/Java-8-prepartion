package markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		student s1 = new student(101, "vamsi");
		if (s1 instanceof markerinterface) {

			System.out.println("Student is marked with MyMarkerInterface.");
		} else {
			System.out.println("Student is NOT marked.");
		}
	}
}