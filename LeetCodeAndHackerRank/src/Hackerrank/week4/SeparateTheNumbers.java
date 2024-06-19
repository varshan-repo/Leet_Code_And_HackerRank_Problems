package Hackerrank.week4;

public class SeparateTheNumbers {

	public static void separateNumbers(String s) {
		for (int i = 1; i <= s.length() / 2; i++) {
			long num = Long.parseLong(s.substring(0, i));
			long expected = num;
			int idx = i;
			boolean beautiful = true;
			while (idx < s.length()) {
				expected++;
				int len = String.valueOf(expected).length();
				if (idx + len > s.length() || Long.parseLong(s.substring(idx, idx + len)) != expected) {
					beautiful = false;
					break;
				}
				idx += len;
			}
			if (beautiful) {
				System.out.println("YES " + num);
				return;
			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {

		String numberString = "99100101";
		separateNumbers(numberString);
	}
}
