package LeetCodeEasy;

/*
 * The idea is that we go through the array and gather all zeros on our road.
 * We use snowball method if we encounter 0 in arr then snowball++
*/

public class MovingZeros {

	public static void moveZeros(int[] nums) {

		int snowballSize = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {
				snowballSize++;
			} else {
				int temp = nums[i];
				nums[i] = 0;
				nums[i-snowballSize] = temp;	
			}
		}
		for(int e: nums) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 0,1,3,0,14 };
		moveZeros(arr);
	}
}
