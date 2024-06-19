package LeetCodeEasy;

public class IndexOfFirstOccurance {

	public static int strStr(String haystack, String needle) {

		return haystack.indexOf(needle);

	}

	public static void main(String[] args) {

		String haystackString = "badbutsad";
		String needleString = "sad";
		System.out.println(strStr(haystackString, needleString));
	}
}
