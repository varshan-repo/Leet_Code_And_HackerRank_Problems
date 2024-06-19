package Hackerrank.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClosestNumber {

	public static List<Integer> closestNumbers(List<Integer> arr) {
		// Write your code here

		List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList()); // 2,3,4,5

		long minDiff = Integer.MAX_VALUE;

		for (int i = 1; i < sortedList.size(); i++) {
			if (minDiff > (sortedList.get(i) - sortedList.get(i - 1))) {
				minDiff = sortedList.get(i) - sortedList.get(i - 1); // got the minimum difference
			}
		}

		List<Integer> pairsIntegers = new ArrayList<>();

		for (int i = 0; i < sortedList.size() - 1; i++) {
			int diff = sortedList.get(i + 1) - sortedList.get(i);
			if(diff == minDiff) {
				pairsIntegers.add(sortedList.get(i));
				pairsIntegers.add(sortedList.get(i+1));
			}
		}
		return pairsIntegers;
	}

	public static void main(String[] args) {

		List<Integer> inputIntegers = Arrays.asList(5,4,3,2);
		System.out.println(closestNumbers(inputIntegers));
	}
}
