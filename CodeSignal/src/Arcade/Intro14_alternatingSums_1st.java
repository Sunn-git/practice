package Arcade;

public class Intro14_alternatingSums_1st { 
	public static void main(String[] args) {
		int[] a = {50, 60, 60, 45, 70}; //180, 105
		
		int[] result = new int[2];
		result[0] += a[0];
		for(int i = 1; i < a.length; i++) {
			result[(i % 2 == 0)? 0 : 1] += a[i];
		}
		
		for(int i : result) {
			System.out.printf("%d, ", i);
		}
	}
}
