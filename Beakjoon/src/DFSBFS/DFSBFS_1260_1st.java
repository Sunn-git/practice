package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_1260_1st { // DFS와 BFS
	public static boolean[] visited;
	public static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
//	public static ArrayList<PriorityQueue<Integer>> g2 = new ArrayList<PriorityQueue<Integer>>();
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
//			g2.add(new PriorityQueue<Integer>());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			g.get(a).add(b);
			g.get(b).add(a);
//			g2.get(a).offer(b);
//			g2.get(b).offer(a);
			
			Collections.sort(g.get(a));
			Collections.sort(g.get(b));
		}
		
		dfs(v);
		visited = new boolean[n+1];
		sb.append("\n");
		bfs(v);
		
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(int x) {
		visited[x] = true;
		sb.append(x).append(" ");
		
		for(int i = 0; i < g.get(x).size(); i++) {
			int y = g.get(x).get(i);
			if(!visited[y]) dfs(y);
		}
	}
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			sb.append(x).append(" ");
//			System.out.print(x + " ");
			
			for(int i = 0; i < g.get(x).size(); i++) {
				int y = g.get(x).get(i);
				if(!visited[y]) {
					queue.offer(y);
					visited[y] = true;
				}
			}
			
//			while(!g2.get(x).isEmpty()) {
//				int y = g2.get(x).poll();
////				System.out.println("\t"+ y + " : y");
//				if(!visited[y]) {
//					queue.offer(y);
//					visited[y] = true;
//				}
//			}
		}
	}

}


/*
 
https://youtu.be/7C9RgOcvkvo 참고


ArrayList를 중첩해서 graph를 만들 수 있다.
문제에서 정점 번호가 작은 것을 먼저 방문하는 조건을 주었기 때문에
바깥쪽을 AL, 안쪽을 PQ를 이용해서 그래프를 구현 
  >>> 이렇게 하면 dfs나 bfs함수를 한번 호출하고 나면 PQ가 다 비어버린다.
		여러번 사용하기 위해서 AL중첩으로 만들되, 안쪽 AL에 값을 담아주고 sort 한다.
		
		
dfs는 재귀로 만든다.

@@ 양방향으로 연결시켜줘야한다 !
g2.get(a).offer(b);
g2.get(b).offer(a);

 */
