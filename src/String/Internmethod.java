package String;

public class Internmethod {
	public static void main(String[] args) {
		String s1=new String ("hello");
		String s2="hello";
		System.out.println(s1==s2);
		
		
		//using intern method
		String s3=s1.intern();
		System.out.println(s2==s3);
	}
}
