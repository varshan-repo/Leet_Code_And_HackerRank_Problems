package Hackerrank.week5;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 8, 2, 8 };

		int n = arr.length;
		int[] output = new int[n];

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] countArr = new int[max + 1];

		for (int i = 0; i < n; i++) {
			countArr[arr[i]]++; // [0, 1, 1, 1, 0, 1, 0, 0, 2]
		}

		for (int i = 0; i < countArr.length - 1; i++) {
			int sum = countArr[i] + countArr[i + 1]; // [0, 1, 2, 3, 3, 4, 4, 4, 6]
			countArr[i + 1] = sum;
		}

		for (int i = 0; i < n; i++) {
			int originalElement = arr[i];
			output[countArr[originalElement] - 1] = originalElement;
			countArr[arr[i]]--;
		}
		for (int num : output) {
			System.out.print(num + " ");
		}
		int debug = 0; // op [1,2,3,5,8,8]
	}

}
