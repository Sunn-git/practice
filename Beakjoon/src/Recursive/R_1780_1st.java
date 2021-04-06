package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class R_1780_1st { // 종이의 개수.
	public static StringBuffer sb = new StringBuffer();
	public static int[][] arr;
	public static int[] cnt = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
//		for(int[] ar : arr) {
//			for(int i : ar) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
		
		recursive(n, 0, 0);
		
		for(int i : cnt) {
			sb.append(i).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void recursive(int n, int r, int c) {
		if(checkValue(n, r, c)) {
			cnt[arr[r][c]+1]++;
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				recursive(n/3, r+(n/3*i), c+(n/3*j));
			}
		}
		
//		recursive(n/3, r, c);
//		recursive(n/3, r, c+n/3);
//		recursive(n/3, r, c+(n/3*2));
//		
//		recursive(n/3, r+n/3, c);
//		recursive(n/3, r+n/3, c+n/3);
//		recursive(n/3, r+n/3, c+(n/3*2));
//		
//		recursive(n/3, r+(n/3*2), c);
//		recursive(n/3, r+(n/3*2), c+n/3);
//		recursive(n/3, r+(n/3*2), c+(n/3*2));
	}
	
	public static boolean checkValue(int n ,int r, int c) {
		int val = arr[r][c];
		
		for(int i = r; i < r+n; i++) {
			for(int j = c; j < c+n; j++) {
				if(val != arr[i][j]) return false;
			}
		}
		
		return true;
	}

}

/*





*/
