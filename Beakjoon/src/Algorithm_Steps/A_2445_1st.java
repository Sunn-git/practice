package Algorithm_Steps;

import java.util.Scanner;

public class A_2445_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String stars;
		int k = 0;
		
		for(int i = 0; i < 2*n-1; i++) {
			stars = "";
			
			for(int j = 0; j < 2*n; j++) {
				stars += (j <= k || j >= 2*n-1-k) ? "*" : " ";
			}
			
			k += (i < n-1)? 1 : -1;
			
			
//			별찍기를 꼭 이런식으로 풀지 않아도 되는구나
//			for(int j = 0; j <= i; j++) {
//				stars += "*";
//			}
//			
//			for(int j = i; j < n-1; j++) {
//				stars += "  ";
//			}
//			
//			for(int j = 0; j <= i; j++) {
//				stars += "*";
//			}
			
			System.out.println(stars);
		}
	}
}
