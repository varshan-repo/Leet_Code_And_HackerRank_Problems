package Hackerrank.week2;

public class MarsExploration {

	public static int marsExploration(String s) {

		int count= 0;
		int temp=0;
		for (int i = 0; i < s.length(); i += 3) {
			String subString = s.substring(i, i + 3);
				if (subString.charAt(0) != 'S')
					count++;
				if (subString.charAt(1) != 'O')
					count++;
				if (subString.charAt(2) != 'S')
					count++;
		}

		return count;
	}

	public static void main(String[] args) {

		String inputString = "SUSDOqSOSSOA";
		System.out.println(marsExploration(inputString));

	}
}
