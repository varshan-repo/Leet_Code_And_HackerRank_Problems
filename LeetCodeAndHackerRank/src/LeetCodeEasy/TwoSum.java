package LeetCodeEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 *  Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> pairIdx = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (pairIdx.containsKey(target - num)) {
				return new int[] { i, pairIdx.get(target - num) };
			}
			pairIdx.put(num, i);
		}

		return new int[] {};
	}

	public static void main(String[] args) {

		int[] nums = { 2,4,5,1,9 };
		int target = 11;
		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

}
