package Algorithm_Steps;

import java.util.Scanner;

public class A_10991_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String stars;
		
		for(int i = 0; i < n; i++) {			
			stars = "";
			
			for(int j = n-i-1; j > 0; j--) {
				stars += " ";
			}
			
			stars += "*";
			
			for(int j = 0; j < i; j++) {
				stars += " *";
			}
			
			System.out.println(stars);
		}
	}
}
