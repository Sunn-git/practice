package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_15651_1st { // N과 M (3)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken());
		int[] nums = new int[Integer.parseInt(st.nextToken())];

		dfs(n, nums, 0, sb);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(int n, int[] nums, int depth, StringBuffer sb) {
		if(depth == nums.length) {
			for(int i : nums) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;				
		}
		
		for(int i = 1; i <= n; i++) {
			nums[depth] = i;
			dfs(n, nums, depth+1, sb);
		}
	}
	
		
}


/*
 

 
 

 */
