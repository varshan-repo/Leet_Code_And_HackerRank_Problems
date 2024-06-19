
package Hackerrank.week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermuteTwoArrays {

	public static String PermuteArrays(List<Integer> A, List<Integer> B, int k) {

		int flag=0;
		
		if (A.size() != B.size()) {
			return "NO";
		}

		//A.stream().sorted().collect(Collectors.toList());
		Collections.sort(A);// asc sort A
		Collections.sort(B, Collections.reverseOrder()); // desc sort B

		for (int i = 0; i < A.size(); i++) {
			if(A.get(i) + B.get(i) >= k) {
				continue;
			}else 
				flag=1;
		}

		return flag==0 ? "Yes": "no";
	}

	public static void main(String[] args) {

		List<Integer> A = Arrays.asList(2, 1, 3);
		List<Integer> B = Arrays.asList(8, 7, 9);
		int k = 10;
		
		System.out.println(PermuteArrays(A, B, k));
	}
}
