package String;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastandFailSafeExample {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("T");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			list.add("R");

		}

		System.out.println("Final list: " + list);

	}
}
//concurrenthasmap:it allows concurrent read and write operations by dividing the map into segments
//Fail-Fast Iterators(used in arraylist and hashmap): Operate directly on the collection and detect concurrent modifications, throwing exceptions to prevent unpredictable behavior.
//Fail-Safe Iterators(CopyOnWriteArrayList and concurrenthashmap): Operate on a copy of the collection, allowing safe iteration despite modifications.