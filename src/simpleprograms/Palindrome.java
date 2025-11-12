package simpleprograms;

public class Palindrome {
	public static void main(String[] args) {
		int num=121;
		int original=num;
		int reversed=0;
		while(num>0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num=num/10;
			if(original==reversed) {
				System.out.println("pallindrome");
			}else {
				System.out.println("not a pallindrome");
			}
		}
	}
}
