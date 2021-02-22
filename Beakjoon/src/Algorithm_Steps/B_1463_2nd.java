package Algorithm_Steps;

import java.util.Scanner;

public class B_1463_2nd { // 1로 만들기
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		dfs(x, 0);
//		recursive(x, 0, 0, 0);
		
		System.out.println(min);
	}
	static int min = Integer.MAX_VALUE;
	
	static void dfs(int x, int cnt) { // 틀림
		if(x == 1) {
			if(cnt < min) min = cnt;
			return;
		}
		
		if(x % 6 == 0) dfs(x/6, cnt+2);
		if(x % 3 == 0) dfs(x/3, cnt+1);
		if(x % 2 == 0) dfs(x/2, cnt+1);
		if((x-1) % 3 == 0 || (x-1) % 2 == 0) dfs(x-1, cnt+1);
	}
	
//	static void recursive(int x, int num, int i, int j) {
//		if(num > x) return;
//		
//		if(num == x) {
//			if(i+j < min) min = i+j;
//			return;
//		}
//		
//		if(num+1 == x) {
//			if(i+j+1 < min) min = i+j+1;
//			return;
//		}
//		
//
//		recursive(x, (int)Math.pow(6, i+1), i+1, j+1);
//		recursive(x, (int)Math.pow(3, i+1), i+1, j);
//		recursive(x, (int)Math.pow(2, j+1), i, j+1);
//		
//	}
	
	
}


/*
 * 
 * input : 572 / answer : 10   >> 11 나온다
 * input : 842 / answer : 11   >> 12 나온다
 * 
 * 
 */