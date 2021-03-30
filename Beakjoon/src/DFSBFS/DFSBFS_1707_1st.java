package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFSBFS_1707_1st { // 이분 그래프
	public static int[] visited;
	public static ArrayList<ArrayList<Integer>> g;
	public static StringBuffer sb = new StringBuffer();
	public static String result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int k = Integer.parseInt(br.readLine()),
			v, e, a, b;
		
		for(int i = 0; i < k; i++) {
			g = new ArrayList<ArrayList<Integer>>();
			st = new StringTokenizer(br.readLine());
			v = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			
			visited = new int[v+1];
			
			for(int j = 0; j <= v; j++) {
				g.add(new ArrayList<Integer>());
			}
			
			for(int j = 0; j < e; j++) {
				st = new StringTokenizer(br.readLine());	
				
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
//				System.out.printf("%d %d\n", a, b);
				g.get(a).add(b);
				g.get(b).add(a);
			}
			
			result = "YES";
			for(int j = 1; j <= v; j++) { // 연결그래프가 아닌 경우
				if(visited[j] != 0) continue;
				dfs(j, -1);
			}
			
//			for(ArrayList al : g) {
//				System.out.println(al);
//			}
			
			sb.append(result).append("\n");
			
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(int start, int flag) {
		if(start == 1) visited[start] = flag;
		
		for(int i = 0; i <g.get(start).size(); i++) {
			int y = g.get(start).get(i);
			
			if(visited[y] != 0 && flag == visited[y]) {
//				System.out.printf("%d : %d\n", y, visited[y]);
//				System.out.println(flag);
				result = "NO";
				return;
			}
			
			if(visited[y] == 0) {
				visited[y] = -flag;
				dfs(y, -flag);
			}
			
		}
	}


}


/*
 
그래프가 여러덩어리인 경우
1
5 4
1 2
3 4
3 5
4 5
NO


1
3 2
3 1
3 2
YES

1
3 2
1 3
2 3
YES

1
5 2
1 2
2 3
YES


*/
