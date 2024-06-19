package Hackerrank.week3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

	public static int sockMerchant(int n, List<Integer> ar) {

		int count = 0;
		Map<Integer, Integer> pairMap = new HashMap<>();
		for (int num : ar) {
			pairMap.put(num, pairMap.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : pairMap.entrySet()) {
			if (entry.getValue() >=2) {
				int rem = entry.getValue()/2;
				count+=rem;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		//List<Integer> inputIntegers = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		List<Integer> inputIntegers = Arrays.asList(2,1,2,2,2,3,2,3);
		int n = 8;

		System.out.println(sockMerchant(n, inputIntegers));
	}
}
