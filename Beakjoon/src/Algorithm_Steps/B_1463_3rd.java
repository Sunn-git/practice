package Algorithm_Steps;
import java.util.Scanner;

public class B_1463_3rd { // 1로 만들기
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
//		int[] dp = new int[x+1];
		dp = new int[x+1];
		
//		Bottom-Up(반복문)
//		for(int i = 0; i < x+1; i++) { // 1은 0이어야 하므로 2부터 시작해도 된다
//			if(i <= 1) {
//				dp[i] = 0;
//				continue;
//			}
//			
//			dp[i] = dp[i-1]+1; // -1로 계산하는 경우
//			
//			if(i%2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1); // -1로 계산하는 경우와 /2로 계산하는 경우 중 작은 수
//			if(i%3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1); // -1로 계산하는 경우와 /3로 계산하는 경우 중 작은 수
//		}
		
		
		System.out.println(fx(x));
		
//		System.out.println(dp[x]);
	}
	
	static int fx(int x) { // Top-down (재귀)
		if(x == 1) return 0;
		if(dp[x] > 0) return dp[x];
		
		dp[x] = fx(x-1) + 1;
		
		if(x%3 == 0) dp[x] = Math.min(dp[x], fx(x/3)+1);
		if(x%2 == 0) dp[x] = Math.min(dp[x], fx(x/2)+1);
		
		return dp[x];
	}
	
	
}


/*
 * 
 * 
 * 
 * 
 */