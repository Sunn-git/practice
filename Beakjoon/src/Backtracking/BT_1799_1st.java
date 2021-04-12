package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BT_1799_1st { // 비숍 진행중
	public static StringBuffer sb = new StringBuffer();
	public static int[][] board,
						  move = {{1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
	public static boolean[][] check;
	public static int size;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		size = Integer.parseInt(br.readLine());
		board = new int[size][size];
		check = new boolean[size][size];
		
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < size; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int[] ar : board) {
			for(int i : ar) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}

		dfs(0, 0);


		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void dfs(int c, int r) {		
		for(int i = c; i < size; i++) {
			for(int j = r; j < size; j++) {
				if(board[i][j] == 0) continue;
				if(!check[i][j] && isItOk(i, j)) {
					check[i][j] = true;
					dfs(i, j);
					
					check[i][j] = false;
				}
			}
		}
		
		
		
		
	}
	
	public static boolean isItOk(int c, int r) {
		int nc, nr;
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j < size; j++) {
				nc = c + move[i][0]*j;
				nr = r + move[i][1]*j;
				
				if(nc < 0 || nr < 0 || nc >= size || nr >= size) continue;
				if(board[nc][nr] == 0) continue;
				if(check[nc][nr] == true) return false;
			}			
		}
		return true;
	}
	
//	public static void checkBoard(int c, int r) {
//		int nc, nr;
//		for(int i = 0; i < 4; i++) {
//			for(int j = 1; j < size; j++) {
//				nc = c + move[i][0]*j;
//				nr = r + move[i][1]*j;
//				
//				if(nc < 0 || nr < 0 || nc >= size || nr >= size) continue;
//				if(board[nc][nr] == 0) continue;
//				if(check[nc][nr] == true) continue;
//				
//				check[nc][nr] = true;
//				cnt++;
//			}			
//		}
//	}


}


/*
 
 

 */
