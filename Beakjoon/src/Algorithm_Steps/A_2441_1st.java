package Algorithm_Steps;

import java.util.Scanner;

public class A_2441_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String stars;
		
		for(int i = n; i > 0; i--) {
			stars = "";
			for(int j = 0; j < n-i; j++) {
				stars += " ";
			}
			
			for(int j = i; j > 0; j--) {
				stars += "*";
			}
			System.out.println(stars);
		}
	}
}
