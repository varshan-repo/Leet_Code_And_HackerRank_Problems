package Hackerrank.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MigratoryBird {

	public static int migratoryBirds(List<Integer> arr) {

		Map<Integer, Integer> birdMap = new HashMap<>();
		List<Integer> countList = new ArrayList<>();

		for (int n : arr) {
			birdMap.put(n, birdMap.getOrDefault(n, 0) + 1);
		}

		// sorting birdMap in desc with values
		birdMap = birdMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e2, LinkedHashMap::new));

		for (Entry<Integer, Integer> num : birdMap.entrySet()) {
			countList.add(num.getKey());
		}

		return countList.get(0);
	}

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
		System.out.println(migratoryBirds(input));

	}
}
