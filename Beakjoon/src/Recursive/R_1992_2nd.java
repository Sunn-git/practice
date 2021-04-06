package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_1992_2nd { // 쿼드트리.
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
		
		recursive(n, 0, 0);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void recursive(int n, int r, int c) {
		if(colorCheck(n, r, c) > -1) {
			sb.append(colorCheck(n, r, c));
			return;
		}
		
		sb.append("(");
		recursive(n/2, r, c);
		recursive(n/2, r, c+n/2);
		recursive(n/2, r+n/2, c);
		recursive(n/2, r+n/2, c+n/2);		
		sb.append(")");
	}
	
	public static int colorCheck(int n, int r, int c) {
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

쿼드트리(Quad Tree, 자식노드를 4개씩 갖는 트리 자료구조)의 탐색은
4개의 영역으로 분할한 후 재귀를 통해 세분화하는 방법을 사용한다.

*/
