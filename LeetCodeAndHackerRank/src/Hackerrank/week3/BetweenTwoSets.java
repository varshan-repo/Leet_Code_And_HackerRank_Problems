package Hackerrank.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class BetweenTwoSets {

	public static int getTotalX(List<Integer> list1, List<Integer> list2) {

		Object[] a = list1.toArray();
		Object[] b = list2.toArray();
		int n = list1.size();
		int m = list2.size();

		Arrays.sort(a);
		Arrays.sort(b);

		int lower_bound = (int) a[n - 1];
		int upper_bound = (int) b[0];

		int count_x = 0;
		for (int i = lower_bound; i <= upper_bound; i++) {
			int sum_mod = 0;
			for (int j = 0; j < n; j++) {
				sum_mod += i % (int) a[j]; // adding the remainder 
			}
			for (int k = 0; k < m; k++) {
				sum_mod += (int) b[k] % i; //adding the remainder
			}

			if (sum_mod == 0) // if the remainder is zero i,e the answer
				++count_x;
		}
		return count_x;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(2, 4);
		List<Integer> b = Arrays.asList(16, 32, 96);
		System.out.println(getTotalX(a, b));
	}
}
