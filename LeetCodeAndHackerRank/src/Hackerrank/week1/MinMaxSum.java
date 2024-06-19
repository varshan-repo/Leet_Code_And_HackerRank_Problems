package Hackerrank.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

	public static void main(String[] args) {

		long minResut =0;
		long maxResut =0;
		
		List<Long> numIntegers = new ArrayList<>();
		numIntegers.add((long)256741038);
		numIntegers.add((long)623958417);
		numIntegers.add((long)467905213);
		numIntegers.add((long)714532089);
		numIntegers.add((long)938071625);
		Long min = numIntegers.stream().sorted().findFirst().get();
		Collections.sort(numIntegers, Collections.reverseOrder());
		Long max = numIntegers.stream().findFirst().get();

		for(int i=1; i< numIntegers.size(); i++) {
			maxResut+=numIntegers.get(i);
		}
		for(int i=0; i< numIntegers.size()-1; i++) {
			minResut+=numIntegers.get(i);
		}

		System.out.println("min: "+minResut);
		System.out.println("max: "+maxResut);
	}
}
