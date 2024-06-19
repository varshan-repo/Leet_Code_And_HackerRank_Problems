package Hackerrank.week1;

import java.util.Scanner;

/*The operation will either be S (split) or C (combine)
M indicates method, C indicates class, and V indicates variable

input:                              output:
	S;M;plasticCup()						plastic cup

	C;V;mobile phone						mobilePhone

	C;C;coffee machine						CoffeeMachine

	S;C;LargeSoftwareBook					large software book

	C;M;white sheet of paper				whiteSheetOfPaper()

	S;V;pictureFrame						picture frame

*/

public class CamelCasing {

	public static String camelcase(String input) {

		String targetString = input.substring(4, input.length());

		if (input.charAt(0) == 'S') {
			if (input.charAt(2) == 'M') {
				for (int i = 0; i < targetString.length(); i++) {
					if (Character.isUpperCase(targetString.charAt(i))) {
						int pos = targetString.indexOf(targetString.charAt(i));
						targetString = targetString.substring(0, pos) + " "
								+ Character.toLowerCase(targetString.charAt(i)) + targetString.substring(pos + 1);
					}
				}
				targetString = targetString.substring(0, targetString.length() - 2);

			}

			if (input.charAt(2) == 'V') {
				for (int i = 0; i < targetString.length(); i++) {
					if (Character.isUpperCase(targetString.charAt(i))) {
						int pos = targetString.indexOf(targetString.charAt(i));
						targetString = targetString.substring(0, pos) + " "
								+ Character.toLowerCase(targetString.charAt(i)) + targetString.substring(pos + 1);
					}
				}
			}

			if (input.charAt(2) == 'C') {
				targetString = Character.toLowerCase(targetString.charAt(0)) + targetString.substring(1);
				for (int i = 0; i < targetString.length(); i++) {
					if (Character.isUpperCase(targetString.charAt(i))) {
						int pos = targetString.indexOf(targetString.charAt(i));
						targetString = targetString.substring(0, pos) + " "
								+ Character.toLowerCase(targetString.charAt(i)) + targetString.substring(pos + 1);

					}
				}
			}
		}
		if (input.charAt(0) == 'C') {
			if (input.charAt(2) == 'M') {
				for (int i = 0; i < targetString.length(); i++) {
					if (targetString.charAt(i) == ' ') {
						int pos = targetString.indexOf(targetString.charAt(i));
						targetString = targetString.substring(0, pos)
								+ Character.toUpperCase(targetString.charAt(i + 1)) + targetString.substring(pos + 2);
					}
				}
				targetString = targetString + "()";
			}

			if (input.charAt(2) == 'V') {
				for (int i = 0; i < targetString.length(); i++) {
					if (targetString.charAt(i) == ' ') {
						int pos = targetString.indexOf(targetString.charAt(i));
						targetString = targetString.substring(0, pos)
								+ Character.toUpperCase(targetString.charAt(i + 1)) + targetString.substring(pos + 2);
					}
				}
			}

			if (input.charAt(2) == 'C') {
				targetString = Character.toUpperCase(targetString.charAt(0)) + targetString.substring(1);
				for (int i = 0; i < targetString.length(); i++) {
					if (targetString.charAt(i) == ' ') {
						int pos = targetString.indexOf(targetString.charAt(i));
						targetString = targetString.substring(0, pos)
								+ Character.toUpperCase(targetString.charAt(i + 1)) + targetString.substring(pos + 2);
					}
				}
			}

		}

		return targetString;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter isnput: ");
		while (scanner.hasNext()) {
			String inputString = scanner.nextLine();
			System.out.println(camelcase(inputString));
		}

	}
}
