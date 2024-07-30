package LeetCodeEasy;

public class IndexOfFirstOccurance {

	public static int strStr(String haystack, String needle) {

		if (haystack.length() < needle.length()) {
            return -1;
        }
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        
        return -1;        
	}

	public static void main(String[] args) {

		String haystackString = "aadbutsad";
		String needleString = "sad";
		System.out.println(strStr(haystackString, needleString));
	}
}
