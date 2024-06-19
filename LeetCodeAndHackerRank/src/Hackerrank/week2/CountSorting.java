package Hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountSorting {

	public static List<Integer> countingSort(List<Integer> arr) {
		// Write your code here

		int max = Collections.max(arr);

		int[] frequencyArr = new int[max + 2];

		List<Integer> frequencyList = Arrays.stream(frequencyArr).boxed().collect(Collectors.toList());

		int j = 0;
		for (int i = 0; i < arr.size(); i++) {
			int n = arr.get(i); // n-> number in ith index
			while (j <= frequencyList.size()) {
				frequencyList.set(n, frequencyList.get(n) + 1);
				j++;
				break;
			}

		}

		return frequencyList;

	}
	
	public static List<Integer> countSort(List<Integer> arr){ // HackerRank method
		
		int[] frequency = new int[100];
		
		for(int n:arr) {
			frequency[n]++;
		}
		
		List<Integer> resultIntegers = new ArrayList<>();
		for(int result: frequency) {
			resultIntegers.add(result);
		}
		return resultIntegers;
	}

	public static void main(String[] args) {

		List<Integer> inputIntegers = Arrays.asList(63, 54, 17, 78, 43, 70, 32, 97, 16, 94, 74, 18, 60, 61, 35, 83, 13,
				56, 75, 52, 70, 12, 24, 37, 17, 0, 16, 64, 34, 81, 82, 24, 69, 2, 30, 61, 83, 37, 97, 16, 70, 53, 0, 61,
				12, 17, 97, 67, 33, 30, 49, 70, 11, 40, 67, 94, 84, 60, 35, 58, 19, 81, 16, 14, 68, 46, 42, 81, 75, 87,
				13, 84, 33, 34, 14, 96, 7, 59, 17, 98, 79, 47, 71, 75, 8, 27, 73, 66, 64, 12, 29, 35, 80, 78, 80, 6, 5,
				24, 49, 82);
		//String str = "63 54 17 78 43 70 32 97 16 94 74 18 60 61 35 83 13 56 75 52 70 12 24 37 17 0 16 64 34 81 82 24 69 2 30 61 83 37 97 16 70 53 0 61 12 17 97 67 33 30 49 70 11 40 67 94 84 60 35 58 19 81 16 14 68 46 42 81 75 87 13 84 33 34 14 96 7 59 17 98 79 47 71 75 8 27 73 66 64 12 29 35 80 78 80 6 5 24 49 82";
		//replace(str);
		System.out.println(countingSort(inputIntegers));
		//System.out.println(countSort(inputIntegers));
	}

	public static void replace(String str) {
		str = str.replace(" ", ",");
		System.out.println(str);
	}
}
