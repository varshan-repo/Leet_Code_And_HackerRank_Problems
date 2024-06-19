package Hackerrank.week2;

public class FlippingBit {

	public static long flippingBits(int n) {

		int signedComplement = (int) n ^ (0xF);
		return Integer.toUnsignedLong(signedComplement);

	}

	public static void main(String[] args) {

		int n = 9;
		System.out.println(flippingBits(n));
	}
}
