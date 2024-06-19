package Hackerrank.week1;

import java.util.ArrayList;
import java.util.List;

/*What I learned? -> float division and integer division are 2 diffrent things 
 * if u need float value ad output typecast one variable to float datatype/double datatype.*/
public class Ratio {

	public static void main(String[] args) {
		List<Integer> inputIntegers = new ArrayList<>();
		inputIntegers.add(1);
		inputIntegers.add(1);
		inputIntegers.add(0);
		inputIntegers.add(-1);
		inputIntegers.add(-1);

		plusMinus(inputIntegers);

	}

	public static void plusMinus(List<Integer> arr) {
		// Write your code here

		int positive = 0;
		int negative = 0;
		int zero = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				positive++;
			} else if (arr.get(i) < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		double plus = (float)positive/arr.size();
		double minus = (float)negative / arr.size();
		double neutral = (float)zero / arr.size();

		System.out.println(String.format("%.5f", plus));
		System.out.println(String.format("%.5f", minus));
		System.out.println(String.format("%.5f", neutral));

	}

}
