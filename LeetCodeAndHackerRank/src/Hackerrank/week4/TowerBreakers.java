package Hackerrank.week4;

public class TowerBreakers {

	public static int towerBreakers(int n, int m) {

		 return (n%2==0 || m==1) ? 2:1; 
	}

	public static void main(String[] args) {

		int noOfTower = 2;
		int height = 6;

		System.out.println(towerBreakers(noOfTower, height));
	}
}
