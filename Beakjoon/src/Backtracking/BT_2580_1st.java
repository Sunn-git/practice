package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BT_2580_1st { // 스도쿠 블로그 참고.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int[][] sudoku = new int[9][9];
		int blank = 0;
		
		for(int i = 0; i < 9; i++) {
			sudoku[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int j = 0; j < 9; j++) {
				if(sudoku[i][j] == 0) {
					blank++;
				}
			}
		}
		
		System.out.println(blank);
		
//		System.out.println();
//		for(int[] a : sudoku) {
//			for(int i : a) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("================================");
		
		dfs(sudoku, 0, 0);
		
//		System.out.println();
//		for(int[] a : sudoku) {
//			for(int i : a) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
		
		
//		for(int[] arr : sudoku) {
//			for(int i : arr) {
//				sb.append(i).append(" ");
//			}
//			sb.append("\n");
//		}
//		
//		bw.write(sb.toString());
//		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(int[][] sudoku, int x, int y) {
		if(y == 9) {
			dfs(sudoku, x+1, 0);
			return;
		}
		
		if(x == 9) {
			for(int[] arr : sudoku) {
				for(int i : arr) {
					System.out.printf("%d ", i);
				}
				System.out.println();
			}
			
			System.exit(0);
		}
		
		
		if(sudoku[x][y] == 0) {
			for(int k = 1; k <= 9; k++) {
				if(check(sudoku, x, y, k)) {
					sudoku[x][y] = k;
					dfs(sudoku, x, +1);
				}
			}
			
			sudoku[x][y] = 0;
			return;
		}
		
		dfs(sudoku, x, y+1); // 0이 아닌 경우 다음 y로 넘어가기 위한 코드
	}
	
	static boolean check(int[][] sudoku, int i, int j, int k) {
		for(int I = 0; I < 9; I++) {
			if(sudoku[I][j] == k) return false;
			if(sudoku[i][I] == k) return false;
		}
		
		int Istart = (i/3)*3;
		int Jstart = (j/3)*3;
		
		for(int x = Istart; x < Istart+3; x++) {
			for(int y = Jstart; y < Jstart+3; y++) {
				if(sudoku[x][y] == k) return false;
			}
		}
		
		return true;
	}
}


/*
 
https://st-lab.tistory.com/119
 
 

 */
