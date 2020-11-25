package Algorithm_Steps;

import java.util.Scanner;

public class A_10992_2nd_others { // 좌변(j==k) 우변(j==n+i) 밑변(i==n-1) 진짜 깔끔하다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int k = n-i;
			
			for(int j = 1; j <= n+i; j++) {
				System.out.print((j==k || j==n+i || i == n-1) ? "*" : " ");
				
			}
			System.out.println();
		}
		
	}
}
