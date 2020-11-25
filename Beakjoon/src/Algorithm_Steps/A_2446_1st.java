package Algorithm_Steps;

import java.util.Scanner;

public class A_2446_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		String stars;
		
		for(int i = 0; i < 2*n-1; i++) {
			stars = "";
			
			for(int j = 0; j < 2*n-k; j++) { // 출력 형식이 잘못되었습니다 : 공백때문이었음.
				stars += (j >= k && j < 2*n-1 -k) ? "*" : " ";
			}
			
			k += (i < n-1) ? 1 : -1;
			System.out.println(stars);
		}
	}
}
