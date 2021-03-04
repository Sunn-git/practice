package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_2579_2nd { // 계단 오르기 (일차원 배열로 풀어보기)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// i번째 계단까지 올라섰을 때, 밟지 않을 계단의 합의 최솟값
		// i번째 계단은 무조건 밟지 않아야 한다.
		int n = Integer.parseInt(br.readLine());
		int[] S = new int[n+1];
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			S[i] = Integer.parseInt(br.readLine());
			sum += S[i];
		}
		
		bw.write(Integer.toString(dp(n, sum, S)));
		bw.flush();
		br.close();
		bw.close();
	}	
	
	static int dp(int n, int sum, int[] S) {
		if(n <= 2) return sum;
		
		int[] D = new int[n+1]; 
		
		D[1] = S[1];
		D[2] = S[2];
		D[3] = S[3];
		
		for(int i = 4; i < n; i++) {
			D[i] = Math.min(D[i-2], D[i-3]) + S[i];
		}
		
		return sum - Math.min(D[n-1], D[n-2]);
	}
}


/*
 
 https://www.youtube.com/watch?v=5leTtB3PQu0
 
 
 */
