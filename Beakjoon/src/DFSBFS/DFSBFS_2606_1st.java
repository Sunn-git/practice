package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFSBFS_2606_1st { // 바이러스
	public static boolean[] visited;
	public static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		visited = new boolean[n+1];
		
		for(int i = 0; i <= n; i++) {
			g.add(new ArrayList<Integer>());
		}
		
		StringTokenizer st;
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			g.get(a).add(b);
			g.get(b).add(a);
		}
		
		dfs(1);
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		br.close();
		bw.close();
	}
	static int cnt = 0;
	
	static void dfs(int x) {
		visited[x] = true;
		if(x != 1) cnt++;
		
		for(int i = 0; i < g.get(x).size(); i++) {
			int y = g.get(x).get(i);
			if(!visited[y]) dfs(y);
		}
	}
}


/*
 


 */
