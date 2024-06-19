package Hackerrank.week3;

import java.util.Arrays;
import java.util.List;

// Done using Sliding Window Algorithm

public class SubArrayDivision {

	public static int subArray(List<Integer> list, int d, int m) {

		int chunkSize = m; // -> defining the window
		int currentSum = 0; // to find the sum matching the constraint
		int neededSum = d;
		int ways = 0;

		for (int i = 0; i < chunkSize; i++) {
			currentSum += list.get(i);
		}
		if (currentSum == neededSum) {
			ways++;
		}
		for (int i = chunkSize; i < list.size(); i++) {
			int leftMost = list.get(i - chunkSize);
			int newElementOnRight = list.get(i);
			currentSum -= leftMost;
			currentSum += newElementOnRight;
			if (currentSum == neededSum) {
				ways++;
			}
		}
		return ways;
	}

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(1, 2, 1, 3, 2);
		int d = 3; // -> sum of the elements
		int m = 2; // -> no of the elements should be in a sub-array
		
		System.out.println(subArray(input, d, m));
	}
}
