package Hackerrank.week2;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Panagram {

	//a->97 z->122
	
	public static String pangrams(String s) {

		Set<Character> hashSet = new TreeSet<>();
		
		for(char ch : s.toLowerCase().toCharArray()) {
			if(Character.isLetter(ch)) {
				hashSet.add(ch);
			}
		}
		return hashSet.size()==26?"Pangram":"Not a Pangram";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence: ");
		String inputString = scanner.nextLine();
		
		System.out.println(pangrams(inputString));

	}
}
