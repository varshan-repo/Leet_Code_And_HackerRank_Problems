package LeetCodeEasy;

import java.util.Arrays;
import java.util.EnumSet;

/*Given a non-empty array of integers nums, 
every element appears twice except for one. Find that single one.

Input: nums = [2,2,1]
Output: 1

Done using XOR bit manipulation:
	0^2 -> 2
	2^2 -> 0
	0^1 -> 1 -> output
	
	Input: nums = [4,1,2,1,2]
	Output: 4
	0^4 -> 4
	4^1^2^1^2 -> 4 
	*/
public class SingleNumber {

	public static int singleNumber(int[] nums) {

		int single = 0;
		int i = 0;
		while (i < nums.length) {
			single = single ^ nums[i];
			i++;
		}
		return single;
	}

	public static void main(String[] args) {
		int[] nums = {5};
		System.out.println(singleNumber(nums));

	}
}
