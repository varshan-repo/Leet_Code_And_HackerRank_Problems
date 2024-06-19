package LeetCodeEasy;

public class LengthOfTheLastWord {

	public static int lengthOfLastWord(String s) {
			
		String[] arr =  s.split(" ");
		return arr[arr.length-1].length();
	}

	public static void main(String[] args) {
		String inputString = "Hello World";
		System.out.println(lengthOfLastWord(inputString));
	}
}
