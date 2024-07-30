package LeetCodeEasy;

public class BinarySearch {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, high);
		return i + 1;

	}

	public static void quickSortArr(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			quickSortArr(arr, low, pi - 1);
			quickSortArr(arr, pi + 1, high);
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arrToSearch = { 3, 1, 6, 2, 5 };
		int toSearch = 3;

		quickSortArr(arrToSearch, 0, arrToSearch.length - 1);
		System.out.println(binarySearch(arrToSearch, toSearch));

	}
}
