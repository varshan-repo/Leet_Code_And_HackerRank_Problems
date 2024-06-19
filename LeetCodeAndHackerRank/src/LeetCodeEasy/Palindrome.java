package LeetCodeEasy;

public class Palindrome {

	public static boolean isPalindrome(int x) {
		String s  = String.valueOf(x);
		int len = s.length();
		StringBuilder builder = new StringBuilder();
		if(x<0) {
			return false;
		}
		for(int i =len-1; i>=0; i-- ) {
			builder.append(s.charAt(i));
		}
		  String temp = builder.toString();
		 if(temp.hashCode()==s.hashCode()) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
	public static void main(String[] args) {
		int input = 121;
		System.out.println(isPalindrome(input));
	}
}
