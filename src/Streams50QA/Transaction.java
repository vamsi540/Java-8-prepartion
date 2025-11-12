package Streams50QA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {

	private final String date;
	private final double amount;

	public Transaction(String date, double amount) {
		this.date = date;
		this.amount = amount;  
	}

	public String getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public static class TransactionSum {
		public static void main(String[] args) {
			List<Transaction> transactions = Arrays.asList(new Transaction("2025-04-30", 200),
					new Transaction("2025-04-30", 200), new Transaction("2025-04-23", 200),
					new Transaction("2025-05-06", 22), new Transaction("2025-04-23", 200));

			Map<String, Double> dailyBuffer = transactions.stream().collect(Collectors
					.groupingBy(trans -> trans.getDate(), Collectors.summingDouble(trans -> trans.getAmount())));
			dailyBuffer.forEach((date, sum) -> System.out.println("date is :" + date + "amount is" + sum));
		}
	}
}