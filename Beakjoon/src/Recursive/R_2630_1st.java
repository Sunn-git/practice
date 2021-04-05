package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_2630_1st { // 색종이 만들기.
	public static StringBuffer sb = new StringBuffer();
	public static char[][] arr;
	public static int[] cnt = new int[2]; // white:0, blue:1
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine().replace(" ", "") .toCharArray();
		}
		
//		for(char[] c : arr) {
//			System.out.println(c);
//		}
		
		recursive(n, 0, 0);
		
		sb.append(cnt[0]).append("\n").append(cnt[1]);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void recursive(int n, int r, int c) {
		if(checkColor(n, r, c) > -1) {
			cnt[checkColor(n, r, c)]++;
			return;
		}
		
		recursive(n/2, r, c);
		recursive(n/2, r, c+n/2);
		recursive(n/2, r+n/2, c);
		recursive(n/2, r+n/2, c+n/2);
	}
	
	public static int checkColor(int n, int r, int c) {
		char val = arr[r][c];
		for(int i = r; i < r+n; i++) {
			for(int j = c; j < c+n; j++) {
				if(val != arr[i][j]) return -1;
			}
		}
		
		return val-'0';
	}
}

/*

https://st-lab.tistory.com/227

*/
