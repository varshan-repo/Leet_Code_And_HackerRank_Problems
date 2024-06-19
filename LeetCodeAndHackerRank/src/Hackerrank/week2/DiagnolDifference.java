package Hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// to find secondary diagnol we use (n-i-1) method 
// where n->len off the arr || i-> is the pointer

public class DiagnolDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here

		int primaryDiagnol = 0;
		int secondaryDiagnol=0;
		int len = arr.size();

		for (int i = 0; i < len; i++) {
			 primaryDiagnol+=arr.get(i).get(i);
			 secondaryDiagnol+= arr.get(i).get(len-i-1);
		}
		
		return primaryDiagnol>secondaryDiagnol?primaryDiagnol-secondaryDiagnol:secondaryDiagnol-primaryDiagnol;
	}

	public static void main(String[] args) {

		List<Integer> row1 = Arrays.asList(11, 2, 4);
		List<Integer> row2 = Arrays.asList(4, 5, 6);
		List<Integer> row3 = Arrays.asList(10, 8, -12);

		List<List<Integer>> inputList = new ArrayList<>();
		inputList.add(row1);
		inputList.add(row2);
		inputList.add(row3);
		
		System.out.println(diagonalDifference(inputList));

	}
}
