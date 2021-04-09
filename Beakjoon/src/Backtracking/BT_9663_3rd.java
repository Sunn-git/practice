package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_9663_3rd { // N-Queen 아직 혼자 해결 못함.
	static int n;
	static int[] check;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		n = Integer.parseInt(st.nextToken());
		check = new int[n];
		
		dfs(0);
		sb.append(cnt);
			
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}	
	
	
	static void dfs(int depth) {
		if(depth == n) {
			cnt++;
			return;
		}
		
		for(int i = 0; i < n; i++) {
			check[depth] = i;
			
			if(checkQueen(depth)) {
				dfs(depth+1);
			}
		}
		
		return;
	}
	
	static boolean checkQueen(int depth) {
		for(int i = 0; i < depth; i++) {
			if(check[depth] == check[i] || 
				Math.abs(depth - i) == Math.abs(check[depth] - check[i])) 
				return false;
		}
		
		return true;
	}
}


/*
 

 
 

 */
