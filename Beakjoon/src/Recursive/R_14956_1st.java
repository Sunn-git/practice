package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class R_14956_1st { // Philosopher’s Walk
	public static StringBuffer sb = new StringBuffer();
	public static int[] rotation = new int[2];
	public static int[][] move = {{0,0}, {0,1}, {1,1}, {1,0}};
	public static int square;
//	public static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // size
		int m = Integer.parseInt(st.nextToken()); // meter
		
//		arr = new int[n][n];
		recursive(n, m, 1, 1);

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void recursive(int n, int m, int r, int c) {
		if(n == 2) {
			System.out.printf("%d %d : %d\n", c, r, m);
			System.out.println(square);
			
			if(square == 0) {
				System.out.printf("%d %d\n", c+move[m-1][1], r+move[m-1][0]);
			}else if(square == 1) {
				System.out.printf("%d %d\n", c-move[m-1][1], r-move[m-1][0]);
			}else {
				System.out.printf("%d %d\n", c+move[m-1][0], r+move[m-1][1]);
			}
			
//			int addX = move[m-1][0], addY = move[m-1][1], temp;
//			if(rotation[1]%2 != 0) { // 역순
////				System.out.printf("%d %d\n", c-move[4-m][0], r-move[4-m][1]);
//				addX = -move[m-1][1];
//				addY = -move[m-1][0];
//			}
//			
//			if(rotation[0]%2 != 0) { // xy반전8 
//				temp = addX;
//				addX = addY;
//				addY = temp;
//			} 
//			
//			System.out.printf("%d %d\n", c+addX, r+addY);
			
			return;
		}
		
		
		int halfPow = n*n/4;
		
		if((m-1)/halfPow == 0) {
			rotation[0]++;
			square = 0;
			recursive(n/2, m, r, c);
		}else if((m-1)/halfPow == 1) {
			square = -1;
			recursive(n/2, m-halfPow, r+n/2, c);
			
		}else if((m-1)/halfPow == 2) {
			square = -1;
			recursive(n/2, m-halfPow*2, r+n/2, c+n/2);
			
		}else {
			rotation[1]++;
			square = 1;
			recursive(n/2, m-halfPow*3, r-1+n/2, n+1-c);
		}

	}
}

/*





*/
