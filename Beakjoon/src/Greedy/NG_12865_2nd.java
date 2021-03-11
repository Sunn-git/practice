package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NG_12865_2nd { // 평범한 배낭
	public static int[][] things;
	public static int k, n, max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		things = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			things[i][0] = Integer.parseInt(st.nextToken());
			things[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0, 0, 0);
		
		
		bw.write(Integer.toString(max));
		bw.flush();
		br.close();
		bw.close();
	}	
	
	static void dfs(int depth, int at, int w, int v) {
		if(w > k) return;
		if(w <= k) {
//			System.out.println(w + " / " + v);
			max = Math.max(v, max);
		}
		if(depth == n) {
			return;
		}
		
		for(int i = at; i < n; i++) {
			dfs(depth+1, i+1, w+things[i][0], v+things[i][1]);
		}
		
	}
}


/*

여전히 9%에서 시간초과


 */
