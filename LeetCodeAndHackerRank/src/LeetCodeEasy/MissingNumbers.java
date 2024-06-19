package LeetCodeEasy;

import java.util.Arrays;

/*
 * Input: nums = [3,0,1]
	Output: 2
	Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
				2 is the missing number in the range since it does not appear in nums.
*/

public class MissingNumbers {

//	public static int missingNumber(int[] nums) { -->  8ms solution
//
//		int max = nums.length;
//		Arrays.sort(nums);
//		int i;
//
//		for (i = 0; i < max; i++) {
//			if (i != nums[i]) {
//				break;
//			}
//		}
//		return i;
//
//	}
	
	public static int missingNumber(int[] nums) { // --> 0ms solution
        int n = nums.length;
        int sum = n*(n+1)/2;
        int arraySum = 0;
        for(int num : nums){
           arraySum = arraySum + num;
        }
        int missingNumber = sum - arraySum;
        return missingNumber;        
    }

	public static void main(String[] args) {
		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(nums));

	}
}
