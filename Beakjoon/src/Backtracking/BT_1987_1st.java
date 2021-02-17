package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_1987_1st { // 알파벳
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		String[][] arr = new String[R][C];
		
		for(int i = 0; i < R; i++) {
			arr[i] = br.readLine().split("");
		}
		
		for(String[] a : arr) {
			for(String s : a) {
				System.out.printf("%s ", s);
			}
			System.out.println();
		}
		
		dfs(arr, "", 0, 0);
		
		bw.write(Integer.toString(length));
		bw.flush();
		br.close();
		bw.close();
	}
	static int length = 0;
	
	static void dfs(String[][] arr, String history, int x, int y) {
		String s = arr[x][y];
		if(history.contains(s)) return;
		
		history = history.concat(s);
		if(history.length() > length) length = history.length();
		
		//상
		if(x > 0) dfs(arr, history, x-1, y);
		//하
		if(x < arr.length-1) dfs(arr, history, x+1, y);
		//좌
		if(y > 0) dfs(arr, history, x, y-1);
		//우
		if(y < arr[0].length-1) dfs(arr, history, x, y+1);
		
		return;
	}
	
	

}


/*
 
 통과는 됐지만 너무 오래걸린다. (304672KB	3096ms)
 완전탐색이 되는건가?

 */
