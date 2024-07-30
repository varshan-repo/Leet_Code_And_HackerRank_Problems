package LeetCodeEasy;

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.*/

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {

		if (target > nums[nums.length - 1]) {
			return nums.length;
		}

		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid;
			}else if(target > nums[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}

		return low;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 5, 6 };
		int target = 7;
		System.out.println(searchInsert(arr, target));
	}

}
