package Hackerrank.week2;

import java.util.Arrays;
import java.util.List;

// indexOf method gives the first index of the occuring element in the parameter
// LastIndexOf method gives the last index of the occuring element in the parameter
// LOGIC -> checking the first index of the element is the last index also if its unique constraint is true 
public class LonelyInteger {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(0, 0, 1, 5, 1, 2);

		for (int el : a) {
			if (a.indexOf(el) == a.lastIndexOf(el)) {
				System.out.println(el);
			}
		}
	}
}
