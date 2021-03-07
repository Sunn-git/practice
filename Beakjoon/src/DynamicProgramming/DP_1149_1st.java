package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_1149_1st { // RGB거리 시간초과
	static int n;
	static int[][] cost;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
		cost = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 4, 0);

		bw.write(Integer.toString(min));
		bw.flush();
		br.close();
		bw.close();
	}
	static int min = Integer.MAX_VALUE;
	
	static void dfs(int depth, int idx, int sum) {
		if(depth == n) {
			if(sum < min) min = sum;
			return;
		}
		
		if(idx != 0) dfs(depth+1, 0, sum+cost[depth][0]);
		if(idx != 1) dfs(depth+1, 1, sum+cost[depth][1]);
		if(idx != 2) dfs(depth+1, 2, sum+cost[depth][2]);	
	}
}


/*

dfs로 풀면 시간초과가 나겠지? << YES ........


 */
