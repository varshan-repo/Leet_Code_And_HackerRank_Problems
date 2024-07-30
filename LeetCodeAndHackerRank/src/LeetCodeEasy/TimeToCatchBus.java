package LeetCodeEasy;

import java.util.Arrays;
import java.util.HashSet;

public class TimeToCatchBus {

	static int bus(int[] bt, int[] pt, int c) {

		Arrays.sort(bt);
		Arrays.sort(pt);

		int last = 0;
		int j = 0;
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < bt.length; i++) {
			int count = 0;

			while (j < pt.length && count < c && pt[j] <= bt[i]) {
				last = pt[j];
				set.add(pt[j++]);
				count++;
			}
			
			if(i == bt.length - 1 && count < c && last < bt[i]){
                return bt[bt.length - 1];
            }
			
			if(set.size() == 0) return bt[bt.length-1];
			
			while(set.contains(last)) last--;
		}
		return last;

	}

	public static void main(String[] args) {

		int[] busTime = { 10, 20 };
		int[] passengertime = { 2, 18, 17, 19 };
		int capacity = 2;
		System.out.println(bus(busTime, passengertime, capacity));
	}
}
