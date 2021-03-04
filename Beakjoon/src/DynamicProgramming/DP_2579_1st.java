package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_2579_1st { // 계단 오르기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] D = new int[n+2][3];
		int[] S = new int[n+1];
		for(int i = 1; i <= n; i++) { // i 최댓값 설정 주의
			S[i] = Integer.parseInt(br.readLine());
		}
		
		D[1][1] = S[1];
		D[1][2] = 0;
	
		for(int i = 2; i <= n; i++) {
			D[i][1] = Math.max(D[i-2][1], D[i-2][2]) + S[i];
			D[i][2] = D[i-1][1] + S[i];
		}
		
		bw.write(Integer.toString(Math.max(D[n][1], D[n][2])));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
 https://www.youtube.com/watch?v=5leTtB3PQu0
 
 입력값이 1, 2 인 경우  초기값 설정 부분에서 indexOutOfBounder 에러가 발생할 수 있다.
 따라서 for문 범위 설정, D배열 크기 조절 필요
 
 이중배열의 크기가 2인게 시간이 더 오래걸렸다 왜지??
 String.valueOf 보다 Integer.parseInt가 더 빠름
 

 */
