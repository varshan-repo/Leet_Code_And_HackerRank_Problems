package Hackerrank.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	input: 10
		3 4 21 36 10 28 35 5 24 42
		output: 4 0*/
public class BreakingTheRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		
		int min=0;
		int max=0;
		
		
		int resultMin=scores.get(0);
		int resultMax=scores.get(0);
		
		for(int n: scores) {
			if(n<resultMin) {
				resultMin=n;
				min++;
			}
		}
		for(int n: scores) {
			if(n>resultMax) {
				resultMax=n;
				max++;
			}
		}
		
		List<Integer> resultIntegers = new ArrayList<>();
		resultIntegers.add(max);
		resultIntegers.add(min);
		return resultIntegers;
	}

	public static void main(String[] args) {
		List<Integer> inputIntegers = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
		System.out.println(breakingRecords(inputIntegers));
	}
}
