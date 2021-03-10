package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class DFSBFS_1260_2nd { // DFS와 BFS
	public static boolean[] visited;
	public static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
	public static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		
		for(int i = 0; i <= n; i++) {
			g.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			g.get(a).add(b);
			g.get(b).add(a);
			
			Collections.sort(g.get(a));
			Collections.sort(g.get(b));
		}
		
		dfs(v);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(int start) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(start);
		
		while(!stack.isEmpty()) {
			int x = stack.pop();
			
//			같은 값이 여러번 stack에 들어가기 때문에 한번만 출력해주기 위한 조건
			if(!visited[x]) {
				System.out.print(x + " ");
				visited[x] = true;
				
				for(int i = 0; i < g.get(x).size(); i++) {
					int y = g.get(x).get(g.get(x).size()-1-i);
					if(!visited[y]) {
//						동일한 값이 연속으로 들어가는 것을 막기 위한 조건
						if(!stack.isEmpty() && stack.peek() == y) continue;
//						System.out.println("\ty: "+y);
						stack.push(y);
					}
				}

			}

		}

	}
}


/*
 
dfs를 stack으로 만들어보기

 */
