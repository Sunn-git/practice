package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_6603_1st { // 로또
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n;
		int[] arr, result;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			if(n == 0) break;
			
			arr = new int[n];
			result = new int[6];
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(arr, result, 0, 0);
			sb.append("\n");
		}

		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void dfs(int[] arr, int[] result, int start, int depth) {
		if(depth == result.length) {
			for(int i : result) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start; i < arr.length; i++) {
			result[depth] = arr[i];
			dfs(arr, result, i+1, depth+1);
		}
	}
}


/*

 조합 : for문 시작점이 있는 dfs

 */
