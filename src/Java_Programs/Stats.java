package Java_Programs;
//this class stores the results of count,max,min and sum
public class Stats {
	private int count = 0;//count -how many numbers are there in the list etc
	private int sum = 0;//sum of the numbers
	private int min = Integer.MAX_VALUE;//min number in list
	private int max = Integer.MIN_VALUE;//max number in the list

	public void accept(int value) {
		count++;
		sum += value;
		min = Math.min(min, value);
		max = Math.max(max, value);
	}

	public void combine(Stats other) {
		count += other.count;
		sum += other.sum;
		min = Math.min(min, other.min);
		max = Math.max(max, other.max);
	}

	public double getAverage() {
		return count == 0 ? 0 : (double) sum / count;
	}

	@Override
	public String toString() {
		return "Count: " + count + ", Sum: " + sum + ", Min: " + min + ", Max: " + max + ", Avg: " + getAverage();
	}
}
