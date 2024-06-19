package Hackerrank.week2;

public class CountingValleys {

//	public static int countingValleys(int steps, String path) {
		// Write your code here

//		int count = 0;
//
//		if (path.startsWith("D")) {
//			count = -1;
//		}
//		for (int i = 1; i < steps; i++) {
//			if(path.charAt(i)=='U'&& path.charAt(i-1)=='D') {
//				for(int j=i+1; j<steps;j++) {
//					if(path.charAt(j)=='D'&& path.charAt(j-1)=='D'&&path.charAt(j+1)=='U') {
//						count++;
//						break;
//					}
//				}
//			}
//		}
//	}
		
	public static int CountingValleys(int steps, String path) { // Hackerrank Aprroach
		
		int level =0; //-> to represent the sealevel of the hiker
		int count=0; //-> going to be the count of valleys
		
		for(int i=0; i<steps;i++) {
			if(path.charAt(i)=='D') {
				level--;
			}else {
				level++;
				if(level==0)
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int steps = 11;
		String pathString = "UDDUUUDUDDD";

		//System.out.println(countingValleys(steps, pathString));
		System.out.println(CountingValleys(steps, pathString));
	}
}
