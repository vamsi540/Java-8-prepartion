package Streams;

class Transaction {
	Trader trader;
	int year;
	int value;

	Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
}
