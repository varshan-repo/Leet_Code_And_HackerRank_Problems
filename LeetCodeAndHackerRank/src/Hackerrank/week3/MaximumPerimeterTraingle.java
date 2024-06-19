package Hackerrank.week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MaximumPerimeterTraingle {

	public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

		Collections.sort(sticks);// sorting in asc

		for (int i = sticks.size() - 1; i >= 2; i--) {
			int a = sticks.get(i - 2);
			int b = sticks.get(i - 1);
			int c = sticks.get(i);
			if (a + b > c) {
				return Arrays.asList(a, b, c);
			}
		}
		return Arrays.asList(-1);
	}

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(1, 1, 1, 3,3);
		System.out.println(maximumPerimeterTriangle(input));

	}
}
