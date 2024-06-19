package Hackerrank.week4;

public class NumberLineJump {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if ((x1 > x2 && v1 >= v2) || (x2 > x1 && v2 >= v1)) {
            return "NO";
        }

        int jumps = Math.abs(x1 - x2) / Math.abs(v1 - v2); // done using speed formula speed = distance/time

        if (x1 + jumps * v1 == x2 + jumps * v2) { // distance is jumps*v1 and total distance is x1+jumps*v1
            return "YES";
        } else {
            return "NO";
        }
	}

	public static void main(String[] args) {
		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 3;

		System.out.println(kangaroo(x1, v1, x2, v2));

	}
}
