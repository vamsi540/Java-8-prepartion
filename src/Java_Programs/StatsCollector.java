package Java_Programs;

import java.util.stream.Collector;

public class StatsCollector {
	public static Collector<Integer, Stats, Stats> toStats() {
		return Collector.of(Stats::new, // supplier: creates a new Stats object
				Stats::accept, // accumulator: adds a value to Stats
				(s1, s2) -> { // combiner: merges two Stats objects
					s1.combine(s2);
					return s1;
				}, Collector.Characteristics.UNORDERED);
	}
}
