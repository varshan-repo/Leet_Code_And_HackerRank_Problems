package Hackerrank.week3;

public class DrawingBook {

	public static int pageCount(int n, int p) {

		int totalPages = n;
		int pagesToReach = p;

		// We need to bring to the closest odd integer because:
		// - since we are using ints, the division will always be rounded down
		// - e.g. 6 pages total and we need to reach page 5 => coming from the end, (6 -
		// 5) / 2 = 1 / 2 => rounds down to 0
		//	when we need ((6+1) - 5) / 2 = 2 / 2 = 1
		if (totalPages % 2 == 0)
			++totalPages;

		// Moving from end, we need to only get to the desired number, therefore we exclude the pages from start
		// until desired page.
		// Also each 2 values means 1 page flip just like counting from the start
		int fromBack = (totalPages - pagesToReach) / 2;
		
		// Moving from start, each 2 values means 1 page flip
		// Therefore, number of page flips is (desired page / 2)
		int fromfront = pagesToReach / 2;
		return Math.min(fromBack, fromfront);

	}

	public static void main(String[] args) {

		int n = 4;
		int p = 4;

		System.out.println(pageCount(n, p));

	}
}
