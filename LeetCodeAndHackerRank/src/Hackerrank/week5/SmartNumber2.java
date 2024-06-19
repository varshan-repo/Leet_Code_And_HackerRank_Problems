package Hackerrank.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class SmartNumber2 {
	
		public static void main(String[] args) {
	
			List<Integer> result = new ArrayList<>();
	
			Scanner scanner = new Scanner(System.in);
			List<Integer> input = new ArrayList<>();
			int noOfQueries = scanner.nextInt();
	
			for (int i = 0; i < noOfQueries; i++) {
				input.add(scanner.nextInt());
			}
	
			for (int n : input) {
				int count = 0;
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						count++;
					}
				}
				result.add(count);
			}
			for (int n : result) {
				if(n%2==0) System.out.println("NO");
				else System.out.println("YES");
			}
			scanner.close();
		}
	
	}
