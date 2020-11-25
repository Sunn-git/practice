package Algorithm_Steps;

import java.util.Scanner;

public class A_10992_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n;
		String stars;
		
		for(int i = 0; i < n; i++) {
			stars = "";
			
			for(int j = 0; j < 2*n-k; j++) {
				if(i == n-1) {
					stars += "*";
				}else {
					stars += (j == k-1 || j+1 == 2*n-k) ? "*" : " ";					
				}
			}
			k--;
			
			System.out.println(stars);
		}
		
	}
}
