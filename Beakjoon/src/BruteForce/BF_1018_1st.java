package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BF_1018_1st { // 체스판 다시 칠하기 진행중
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int N = n-8;
		int M = m-8;
		
		
		int point = 0;
		char[] chess = {'W', 'B'};
		char[][] arr = new char[n][m];
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
				
				if(i == 0 && j == 0) {
					point = (arr[i][j] == chess[point]) ? 0 : 1;
				}
				
				if(chess[point] != arr[i][j]) {
//					System.out.printf("chess : %s , point : %d\n"
//									+ "arr : %s, i : %d , j : %d\n", chess[point], point, arr[i][j], i, j);
					cnt++;
				}
				
				if(j < m-1) point = (point == 0) ? 1 : 0;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				int temp = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {		
						if(k == 0 && l == 0) { //(0.0)부터 설정하면 뒤쪽부터 자를 경우 안맞을 수 있음
							point = (arr[k][l] == chess[point]) ? 0 : 1;
						}
						
						if(chess[point] != arr[k][l]) temp++;
						
						if(l < 7) point = (point == 0) ? 1 : 0;
					}
				}
				
				if(temp <= cnt) cnt = temp;
				
			}
		}
		
		System.out.println(cnt);
//		System.out.println("==========================");
//		System.out.println();
//		
//		for(char[] c : arr) {
//			System.out.println(c);
//		}

		bw.write("");
		bw.flush();
		br.close();
		bw.close();
	}
}
