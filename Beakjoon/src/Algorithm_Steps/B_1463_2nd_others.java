package Algorithm_Steps;

import java.util.Scanner;

public class B_1463_2nd_others { // DP 첫번째 문제  https://odysseyj.tistory.com/19
	public static void main(String[] args) { // Top-Down
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int[] d = new int[x+1];

		for(int i = 0; i < x+1; i++) {
			if(i <= 1) {
				d[i] = 0;
				continue;
			}
			
			d[i] = d[i-1] +1;
			
			if(i % 2 == 0) d[i] = Math.min(d[i], makeOne(x/2, d)+1);
			if(i % 3 == 0) d[i] = Math.min(d[i], makeOne(x/3, d)+1);
		}
		
		System.out.println(d[x]);
	}
	
	private static int makeOne(int x, int[] d) {
		if(x == 1) return 0;
		
		if(d[x] > 0) return d[x];
		
		d[x] = makeOne(x-1, d) + 1;
		
		if(x % 3 == 0) {
			d[x] = Math.min(d[x], makeOne(x/3, d)+1);
		}
		if(x % 2 == 0) {
			d[x] = Math.min(d[x], makeOne(x/2, d)+1);
		}
		
		return d[x];
	}
	
	
//	public static void main(String[] args) { // Bottom-UP
//		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		int[] d = new int[x+1];
//
//		for(int i = 0; i < x+1; i++) {
//			if(i <= 1) {
//				d[i] = 0;
//				continue;
//			}
//			
//			d[i] = d[i-1] +1;
//			
//			if(i % 2 == 0) d[i] = (d[i/2]+1 < d[i]) ? d[i/2]+1 : d[i];
//			if(i % 3 == 0) d[i] = (d[i/3]+1 < d[i]) ? d[i/3]+1 : d[i];
//		}
//		
//		System.out.println(d[x]);
//	}
	
}

/*
 * 
 * 
 * 
 * 
 */