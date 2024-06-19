package Hackerrank.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotation {

//	 public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//	        int n = arr.size();
//	        List<Integer> rotated = new ArrayList<>(Collections.nCopies(n, 0));
//
//	        for (int i = 0; i < n; i++) {
//	            int newIndex = (i - d + n) % n;
//	            rotated.set(newIndex, arr.get(i));
//	        }
//
//	        return rotated;
//	    }

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		return new ArrayList<Integer>() {
			{
				addAll(arr.subList(d, arr.size()));
				addAll(arr.subList(0, d));
			}
		};
	}
	
	public static List<Integer> rotateRight(int d, List<Integer> arr){
		
		List<Integer> rotatedIntegers = new ArrayList<>();
		
		rotatedIntegers.addAll(arr.subList(arr.size()-d, arr.size()));
		rotatedIntegers.addAll(arr.subList(0, arr.size()-d));
		return rotatedIntegers;
	}

	public static void main(String[] args) {
		List<Integer> inputIntegers = Arrays.asList(1, 2, 3, 4);
		int d = 3;
		System.out.println(rotateLeft(d, inputIntegers));
		System.out.println(rotateRight(d, inputIntegers));
	}
}
