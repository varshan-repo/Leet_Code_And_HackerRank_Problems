package Hackerrank.week5;

public class StrongPassword {

	public static int minimumNumber(int n, String password) {

//		final String numberString = "0123456789";
//		final String lowerCaseString = "abcdefghijklmnopqrstuvwxyz";
//		final String upperCaseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		final String specialCharString = "!@#$%^&*()-+";
//
//		int requiredChar = 0;
//		boolean noNumber = false;
//		boolean noLower = false;
//		boolean noUpper = false;
//		boolean noSpecial = false;
//
//		for (int i = 0; i < password.length(); i++) {	
//			char c = password.charAt(i);
//			if(numberString.indexOf(c)!= -1) {
//				noNumber = true;
//			}
//			if(lowerCaseString.indexOf(c)!= -1) {
//				noLower = true;
//			}
//			if(upperCaseString.indexOf(c)!= -1) {
//				noUpper = true;
//			}
//			if(specialCharString.indexOf(c)!= -1) {
//				noSpecial = true;
//			}
//		}
//		if(!noNumber) requiredChar++;
//		if(!noLower) requiredChar++;
//		if(!noUpper) requiredChar++;
//		if(!noSpecial) requiredChar++;
//		
//		return Math.max(requiredChar, n - password.length());
		int requiredChar = 0;
		final String numbers = "0123456789";
		final String lowercase = "abcdefghijklmnopqrstuvwxyz";
		final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String specialChar = "!@#$%^&*()-+";

		boolean noNumber = true;
		boolean noLower = true;
		boolean noUpper = true;
		boolean noSpecial = true;

		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (numbers.indexOf(c) != -1) {
				noNumber = false;
			}
			if (lowercase.indexOf(c) != -1) {
				noLower = false;
			}
			if (upperCase.indexOf(c) != -1) {
				noUpper = false;
			}
			if (specialChar.indexOf(c) != -1) {
				noSpecial = false;
			}
		}

		if (noNumber)
			requiredChar++;
		if (noUpper)
			requiredChar++;
		if (noLower)
			requiredChar++;
		if (noSpecial)
			requiredChar++;

		return Math.max(requiredChar, n - password.length());
	}

	public static void main(String[] args) {

		String passwordString = "Ab1";
		int n = 6;
		System.out.println(minimumNumber(n, passwordString));
	}
}
