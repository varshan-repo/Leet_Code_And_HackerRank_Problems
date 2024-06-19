package Hackerrank.week5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {

	public static int maxMin(int k, List<Integer> arr) {

		/*
		 * Collections.sort(arr); 
		 * int max = Collections.max(arr.subList(0, k)); 
		 * int min = Collections.min(arr.subList(0, k));
		 * return max - min;
		 */
		
		Collections.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.size() - k; i++) {
            int unfairness = arr.get(i + k - 1) - arr.get(i);
            if (unfairness < minUnfairness) {
                minUnfairness = unfairness;
            }
        }
        return minUnfairness;
	}

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(4504, 1520, 5857, 4094, 4157, 3902, 822, 6643, 2422, 7288, 8245, 9948, 2822,
				1784, 7802, 3142, 9739, 5629, 5413, 7232);
		int k = 5;
		System.out.println(maxMin(k, input));
		/*
		 * 4504 1520 5857 4094 4157 3902 822 6643 2422 7288 8245 9948 2822 1784 7802
		 * 3142 9739 5629 5413 7232
		 */
		String string = "4504 1520 5857 4094 4157 3902 822 6643 2422 7288 8245 9948 2822 1784 7802 3142 9739 5629 5413 7232";
		string = string.replaceAll(" ", ",");
		//System.out.println(string);

	}
}
