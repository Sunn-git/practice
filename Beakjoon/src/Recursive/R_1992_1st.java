package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_1992_1st { // 쿼드트리
	public static StringBuffer sb = new StringBuffer();
	public static char[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		
//		for(char[] c : arr) {
//			System.out.println(c);
//		}
		
		recursive(n, 0, 0);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void recursive(int n, int r, int c) {
		System.out.printf("%d %d %d\n", n, r, c);
		
		sb.append("(");
		int num[] = {arr[r][c], arr[r][c+n/2], arr[r+n/2][c], arr[r+n/2][c+n/2]};
//		System.out.println("========= num =======");
//		
//		for(int i : num) {
//			System.out.println(i);
//		}
//		
//		System.out.println("=====================");
		
		boolean[] check = new boolean[4];
		int idx = 0, nr, nc;
		
		for(int i = r; i < n+r; i++) {
			for(int j = c; j < n+c; j++) {
				//첫번째 사각형
				if(i < r + n/2 && j < c + n/2) {
					idx = 0;
					nr = r;
					nc = c;
				}
				//두번째
				else if(i < r + n/2 && j >= c + n/2) {
					idx = 1;
					nr = r;
					nc = c+ n/2;
				}
				//세번째
				else if(i >= r + n/2 && j < c + n/2) {
					idx = 2;
					nr = r + n/2;
					nc = c;
				}
				//네번째
				else {
					idx = 3;
					nr = r + n/2;
					nc = c + n/2;
				}
				
				if(num[idx] != arr[i][j]) {
					check[idx] = true;
					recursive(n/2, nr, nc);
				}
			} // j for
		} // i for
		
		for(int i = 0; i < 4; i++) {
			if(!check[i]) {
				sb.append(num[i]-'0');
				
//				sb.append(num[i]-'0');
				System.out.println((num[i]-'0')+" sys");
			}
		}
		
		sb.append(")");
	}
}

/*





*/
