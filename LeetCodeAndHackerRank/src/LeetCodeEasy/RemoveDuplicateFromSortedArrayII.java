package LeetCodeEasy;

public class RemoveDuplicateFromSortedArrayII {

	public static int removeDuplicates(int[] nums) {
		
		 int j = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (j == 1 || nums[i] != nums[j - 2]) {
	                nums[j++] = nums[i];
	            }
	        }
	        return j;
	    }

	public static void main(String[] args) {

		int[] input = { 1, 1, 1, 2, 2, 3 };
		System.out.println(removeDuplicates(input));
	}
}
