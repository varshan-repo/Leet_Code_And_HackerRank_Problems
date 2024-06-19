package Hackerrank.week4;

public class CeasorCypher {

	// if alphanumeric add the same
	// if uppercase convert to lowercase shift and convert to uppercase and add
	// if lowercase shift and add

	public static String caesarCipher(String s, int k) {
		String result = "";
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLowerCase(s.charAt(i))) {
				int pos = alphabets.indexOf(s.charAt(i));
				int posAfterShift = (pos + k) % 26;
				result += alphabets.charAt(posAfterShift);
			} else if (Character.isUpperCase(s.charAt(i))) {
				int pos = ALPHABETS.indexOf(s.charAt(i));
				int posAfterShift = (pos + k) % 26;
				result += ALPHABETS.charAt(posAfterShift);
			} else {
				result += s.charAt(i);
			}
		}
		return result;

	}

	public static void main(String[] args) {

		String inputString = "middle-Outz"; // okffng-Qwvb
		int shiftKey = 2;
		System.out.println(caesarCipher(inputString, shiftKey));

	}
}
