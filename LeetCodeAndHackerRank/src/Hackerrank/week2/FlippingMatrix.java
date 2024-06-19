package Hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingMatrix {

	public static int FlipMatrix(List<List<Integer>> matrix) {
		int max = 0, u1=0;
		int n = matrix.size()/2;
		for (int r = 0; r < n; r++) { // -> r indicates row
			for (int c = 0; c < n; c++) { // -> c indicates column
				int lo = matrix.get(r).get(c), ro = matrix.get(r).get(2 * n - c - 1);
                int lu = matrix.get(2 * n - r - 1).get(c), ru = matrix.get(2 * n - r - 1).get(2 * n -c - 1);
                max += Math.max(Math.max(lo, lu), Math.max(ro, ru));
				  
			}
		}

		return max;
 
	}

	public static void main(String[] args) {
		List<List<Integer>> outerList = new ArrayList<>();

		List<Integer> innerList1 = Arrays.asList(112, 42, 83, 119);
		List<Integer> innerList2 = Arrays.asList(56, 125, 56, 49);
		List<Integer> innerList3 = Arrays.asList(15, 78, 101, 43);
		List<Integer> innerList4 = Arrays.asList(62, 98, 114, 108);

		outerList.add(innerList1);
		outerList.add(innerList2);
		outerList.add(innerList3);
		outerList.add(innerList4);
		
		System.out.println(FlipMatrix(outerList));
		//System.out.println(outerList);
	}
}
