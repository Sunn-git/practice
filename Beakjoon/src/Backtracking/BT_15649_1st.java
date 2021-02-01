package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_15649_1st { // N과 M (1)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[n+1];
		int[] num = new int[m];
		
		dfs(n, m, 0, check, num, sb);


		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	static void dfs(int n, int m, int depth, boolean[] check, int[] num, StringBuffer sb) {
		if(depth == m) {
			for(int i : num) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				check[i] = true;
				num[depth] = i;
				dfs(n, m, depth+1, check, num, sb);
				check[i] = false;
			}
		}
		return;
	}
}


/*
 
https://st-lab.tistory.com/114
백트래킹 개념, dfs 풀이


 */
