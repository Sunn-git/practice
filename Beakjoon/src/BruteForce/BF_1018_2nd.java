package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BF_1018_2nd { // 체스판 다시 칠하기.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[] chess = {'W', 'B'};
		char[][] arr = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		bw.write(
			Integer.toString(
					Math.min(bf(n-7, m-7, arr, chess, 0), // W부터 시작하는 경우 
							 bf(n-7, m-7, arr, chess, 1)))); // B부터 시작하는 경우
		bw.flush();
		br.close();
		bw.close();
	}
	
	private static int bf(int N, int M, char[][] arr, char[] chess, int point) {
		int result = 0;
		
		for(int i = 0; i < N; i++) { // 가로로 8개씩 자르기
			for(int j = 0; j < M; j++) { // 세로로 8개씩 자르기
				int temp = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						if(chess[point] == arr[k+i][l+j]) temp++; // 체스판과 일치하면 증가
						if(l < 7) point = (point == 0) ? 1 : 0; // 포인터 바꿔주기
					}
				}
				if(temp >= result) result = temp; // 체스판과 더 많이 일치하는 경우 최대값 바꿔주기
			}
		}
		
		return 64-result; // 바꿔야하는 개수로 반환
	}
}
