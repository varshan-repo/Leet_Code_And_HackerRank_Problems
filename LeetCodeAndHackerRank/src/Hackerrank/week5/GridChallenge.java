package Hackerrank.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

	public static String gridChallenge(List<String> grid) {

		List<String> sortedRows = new ArrayList<>();
		for (int i=0 ; i<grid.size(); i++) {
            char[] ch = grid.get(i).toCharArray();
            Arrays.sort(ch);
            grid.set(i, new String(ch));
        }
		
		for(String s: sortedRows) {
			System.out.print(s+" ");
		}

		for (int i = 0; i < grid.get(0).length(); i++) {
			for (int j = 1; j < grid.size(); j++) {
				if(grid.get(j).charAt(i) < grid.get(j-1).charAt(i)) {
					return "NO";
				}
			}
		}
		return "YES";
	}

	public static void main(String[] args) {

		List<String> inputList = new ArrayList<>(List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv"));
		System.out.println(gridChallenge(inputList));

	}
}
