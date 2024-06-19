package Hackerrank.week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers {

	public static int pickingNumbers(List<Integer> a) {

		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : a) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		int maxLength = 0;
		for (int num : frequencyMap.keySet()) {
			int lengthIncludingCurrent = frequencyMap.getOrDefault(num, 0) + frequencyMap.getOrDefault(num + 1, 0);
			maxLength = Math.max(maxLength, lengthIncludingCurrent);
		}

		return maxLength;

	}

	public static void main(String[] args) {

		List<Integer> inputIntegers = Arrays.asList(1, 3, 4, 5, 5, 6);

		System.out.println(pickingNumbers(inputIntegers));

	}
}
