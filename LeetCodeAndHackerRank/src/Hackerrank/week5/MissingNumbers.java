package Hackerrank.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MissingNumbers {

	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

		Map<Integer, Integer> hashMap1 = new TreeMap<>();
		Map<Integer, Integer> hashMap2 = new TreeMap<>();
		List<Integer> result = new ArrayList<>();

		for (int n : arr) {
			hashMap1.put(n, hashMap1.getOrDefault(n, 0) + 1);
		}
		for (int n : brr) {
			hashMap2.put(n, hashMap2.getOrDefault(n, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : hashMap2.entrySet()) {
            int num = entry.getKey();
            int freqInBrr = entry.getValue();
            int freqInArr = hashMap1.getOrDefault(num, 0);

            if (freqInBrr > freqInArr) {
                result.add(num);
            }
        }
		Collections.sort(result);
		return result;
	}

	public static void main(String[] args) {

		List<Integer> input1 = Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
		List<Integer> input2 = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);

		System.out.println(missingNumbers(input1, input2));
	}
}
