package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_9663_2nd { // N-Queen 블로그 참조.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		dfs(n, arr, 0);
		System.out.println(cnt);
		
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}	
	
	static int cnt = 0;
	
	static void dfs(int n, int[] arr, int depth) {
		if(depth == n) {
			cnt++;
			return;
		}
		
		// depth = x, arr[i] = y
		
		for(int i = 0; i < n; i++) {
			arr[depth] = i;
			
			if(posible(depth, arr)) {
				dfs(n, arr, depth+1);
			}
			
			
		}
		
		return;
	}
	
	static boolean posible(int x, int[] arr) {
		for(int i = 0; i < x; i++) {
			if(arr[x] == arr[i] || Math.abs(x-i) == Math.abs(arr[x] - arr[i])) return false;
		}
		
		return true;
	}
	
	
}


/*
 

 https://st-lab.tistory.com/118
 

 */
