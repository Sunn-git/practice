package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BT_2580_2nd { // 스도쿠. 내가 해보기.
	static	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static	StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
		
		
//		StringTokenizer st = null; // 이쪽이 속도는 훨씬 빠르고 메모리도 약간 덜 든다.
//		for(int i = 0; i < 9; i++) {
//			st = new StringTokenizer(br.readLine());
//			for(int j = 0; j < 9; j++) {
//				sudoku[i][j] = Integer.parseInt(st.nextToken());
//				if(sudoku[i][j] == 0) blank++;
//			}
//		}
		
		dfs(sudoku, blank);
		
	}
	
	static void dfs(int[][] sudoku, int blank) throws IOException {
		if(blank == 0) {
			for(int[] arr : sudoku) {
				for(int i : arr) {
					sb.append(i).append(" ");
				}
				sb.append("\n");
			}
			
			bw.write(sb.toString());
			bw.flush();
			
			System.exit(0);
		}
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(sudoku[i][j] == 0) {
					for(int k = 1; k <= 9; k++) {
						if(check(sudoku, i, j, k)) {
							sudoku[i][j] = k;
							dfs(sudoku, blank-1);
						}
					}
					
					sudoku[i][j] = 0; // 이부분 위치를 못잡아서 안됐던거야 ㅠㅠㅠㅠㅠㅠㅠ
					return;
				}
			}
		}
		
		return;
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
 
블로그 참고 후 원래 진행하던 풀이의 문제부분 수정
 
 

 */
