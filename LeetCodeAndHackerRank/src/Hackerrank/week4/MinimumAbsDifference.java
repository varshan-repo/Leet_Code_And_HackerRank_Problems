package Hackerrank.week4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsDifference {
	
	public static int minimumAbsoluteDifference(List<Integer> arr) {
	    // Write your code here

	        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
	        int min = Integer.MAX_VALUE;
	        for(int i=0; i<sortedList.size()-1 ;i++){
	            int minDiff = sortedList.get(i+1) - sortedList.get(i);
	            if(min>Math.abs(minDiff)){
	                min = minDiff;
	            }
	        }
	        return min;
	    }

	public static void main(String[] args) {
		List<Integer> inputIntegers = Arrays.asList(3,-7,0);
		System.out.println(minimumAbsoluteDifference(inputIntegers));
	}
}
