package Streams;

class Fruit {
	String name;
	int calories;
	int price;
	String color;

	Fruit(String name, int calories, int price, String color) {
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return name + " (" + color + ", " + calories + " cal, $" + price + ")";
	}
}