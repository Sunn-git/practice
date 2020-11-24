package Algorithm_Steps;

import java.util.Scanner;

public class A_2442_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String stars;
		
		for(int i = 0; i < n; i++) {
			stars = "";
			
			for(int j = n-1; j > i; j--) {
				stars += " ";
			}
			
			for(int j = 0; j <= i; j++) {
				stars += (j == 0) ? "*" : "**";
			}
			
			System.out.println(stars);
		}
	}
}
