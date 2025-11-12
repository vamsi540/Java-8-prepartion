package math;

public class Enum {
	public enum Season { WINTER, SPRING, SUMMER, FALL }     //syntax 
	public static void main(String[] args) {  
for(Season s:Season.values()) {
	System.out.println(s);
}
	System.out.println("Index of Winter is:"  +Season.valueOf("WINTER").ordinal());



	}}
