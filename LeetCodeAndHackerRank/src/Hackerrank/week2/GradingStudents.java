package Hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {

		int len = grades.size();
		for (int i = 0; i < len; i++) {
			int grade = grades.get(i);
			int temp = 5 - (grade % 5);
			if (temp < 3 && grade >= 38) {
				grade = grade + temp;
				grades.set(i, grade);
			}

		}
		return grades;
	}

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(23, 80, 96, 18, 73, 78, 60, 60, 15, 45, 15, 10, 5, 46, 87, 33, 60, 14, 71,
				65, 2, 5, 97, 0);
		System.out.println(gradingStudents(grades));
		/*
		 * 80 96 18 75 80 60 60 15 45 15 10 5 46 87 33 60 14 71 65 2 5 97 0
		 */
	}
}
