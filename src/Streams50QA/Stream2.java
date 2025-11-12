package Streams50QA;

import java.util.Arrays;
import java.util.List;

//given a list of transaction,find the sum of transaction amounts for each day using java streams

class Stream2 {

	private String date;
	private double amount;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Stream2(String date, double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	
	public class TransSum{
		public static void main(String[] args) {
			
			List<Stream2> stream=Arrays.asList(new Stream2("2025-04-20",100),
					new Stream2("2025-07-23",3400),
					new Stream2("2025-08-10",34200),
					new Stream2("2025-04-20",100));		
		}
	} 

}
