package Hackerrank.week4;

public class Anagram {

	public static int anagram(String s) {

		if (s.length() % 2 != 0)
			return -1;
		String s1 = s.substring(0, s.length() / 2);
		String s2 = s.substring((s.length() / 2), s.length());

		for(int i=0; i<s1.length(); i++) {
			String c = s1.substring(i, i+1);
			if(s2.contains(c)) {
				s2 = s2.replaceFirst(c, "");
			}
		}
		return s2.length();
	}

	public static void main(String[] args) {
		String inputString = "xyyz";
		System.out.println(anagram(inputString));
	}
}
