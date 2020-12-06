package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BF_1018_1st { // 체스판 다시 칠하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
//		char[][] chess = new char[8][8];
		char[][] arr = new char[n][m];
		
//		for(int i = 0; i < 8; i++) {
//			for(int j = 0; j < 8; j++) {
//				chess[i][j] = 
//			}
//		}
		
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		System.out.println();
		System.out.println("==========================");
		System.out.println();
		
		for(char[] c : arr) {
			System.out.println(c);
		}

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}
