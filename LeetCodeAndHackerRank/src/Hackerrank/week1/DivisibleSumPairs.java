package Hackerrank.week1;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

	public static int divisibleSumPairs(int k, List<Integer> arr) {
		int count = 0;

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if ((arr.get(i) + arr.get(j)) % k == 0) {
					count++;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 3, 2, 6, 1, 2);

		int k = 3;

		System.out.println(divisibleSumPairs(k, arr));

	}
}
