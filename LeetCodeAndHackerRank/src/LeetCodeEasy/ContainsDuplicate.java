package LeetCodeEasy;

import java.util.HashSet;

/*
 * Input: nums = [1,2,3,1]
Output: true
	using hash set
*/
public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 1, 3, 4 };
		System.out.println(containsDuplicate(nums));
	}
}
