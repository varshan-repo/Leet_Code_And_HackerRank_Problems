package LeetCodeEasy;

public class PlusOne {

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			} 
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] =1 ;
		return digits;
	}

	public static void main(String[] args) {

		int[] arr = {  9 };
		int [] result = plusOne(arr);
		for(int n: result) {
			System.out.print(n+" ");
		}
	}
}
