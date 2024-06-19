package Hackerrank.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//	4 ->  n no Of products         output:
//	aba								2
//	baba							1
//	aba								0
//	xzxb
//	3 -> n no Of queries
//	aba
//	xzxb
//	ab

// find how many times the string in queries appears in products

public class SparseArrays {

	public static List<Integer> matchingStrings(List<String> products, List<String> queries) {

		Map<String, Integer> frequencyMap = new HashMap<>();
		
		for(String str: products) {
			frequencyMap.put(str, frequencyMap.getOrDefault(str, 0)+1);
		}
		
		List<Integer> resutIntegers = new ArrayList<>();
		
		for(String query: queries) {
			int frequency = frequencyMap.getOrDefault(query, 0);
			resutIntegers.add(frequency);
		}
		return resutIntegers;
	}

	public static void main(String[] args) {
		List<String> product = Arrays.asList("aba", "baba", "aba", "xzxb");
		List<String> querie = Arrays.asList("aba", "xzxb", "ab");

		System.out.println(matchingStrings(product, querie));
	}
}
