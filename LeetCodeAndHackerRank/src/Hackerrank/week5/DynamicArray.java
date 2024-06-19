package Hackerrank.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

		List<List<Integer>> arr = new ArrayList<>();

		List<Integer> lastAnswers = new ArrayList<>();

		int lastAnswer = 0;

		for (int i = 0; i < n; i++) {
			arr.add(new ArrayList<>());
		}

		for (List<Integer> query : queries) {
			int queryType = query.get(0);
			int x = query.get(1);
			int y = query.get(2);

			if (queryType == 1) {
				
				int idx = (x ^ lastAnswer) % n;
				arr.get(idx).add(y);
				
			} else if (queryType == 2) {
					
				int idx = (x^lastAnswer)%n;
				int size = arr.get(idx).size();
				lastAnswer = arr.get(idx).get(y%size);
				lastAnswers.add(lastAnswer);
			}
		}
		return lastAnswers;
	}

	public static void main(String[] args) {

		int n = 2;
		List<List<Integer>> inputList = new ArrayList<>();

		List<Integer> rowIntegers1 = Arrays.asList(1, 0, 5);
		List<Integer> rowIntegers2 = Arrays.asList(1, 1, 7);
		List<Integer> rowIntegers3 = Arrays.asList(1, 0, 3);
		List<Integer> rowIntegers4 = Arrays.asList(2, 1, 0);
		List<Integer> rowIntegers5 = Arrays.asList(2, 1, 1);

		inputList.add(rowIntegers1);
		inputList.add(rowIntegers2);
		inputList.add(rowIntegers3);
		inputList.add(rowIntegers4);
		inputList.add(rowIntegers5);

		System.out.println(dynamicArray(n, inputList));
	}
}
