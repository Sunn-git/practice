package CodeChallenges;

import java.util.Scanner;

public class programing2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		
		int length = 0;
		for(int i = 1; i <= n; i++) {
			length += i;
		}
		
		int[] answer = new int[length];
		int[][] triangle = new int[n][];
		
		
		
		
		
		
		for(int i = 0; i < n; i++) {
			triangle[i] = new int[i+1];
		}
		
		//좌변 숫자 채우기
		for(int i = 0; i < triangle.length; i++) {
			triangle[i][0] = i+1;
		}
		
		//밑변 숫자 채우기
		for(int i = 0; i < n; i++) {
			triangle[n-1][i] = n+i;
		}
		
		System.out.println(triangle[n-1][n-1]);
		
		//우변 숫자 채우기
		for(int i = n-1; i > 0; i--) {
			triangle[i][i] = triangle[n-1][n-1] + (-i)+n-1;
		}

		for(int[] i : triangle) {
			for(int j : i) {
				System.out.printf("%d,",j);
			}
			System.out.println();
		}
		
		
//		System.out.println(answer.toString());
	}
}
