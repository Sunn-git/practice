package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_1697_1st { // 숨바꼭질
	public static int[] visited;
	public static int k;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		visited = new int[200002]; // 범위에 대해 고민해보기
		
		for(int i = 0; i < visited.length; i++) {
			visited[i] = -1;
		}
		
		bfs(n);
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		br.close();
		bw.close();
	}
	static int cnt = 0;
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(start);
		visited[start] = 0;
		
		int num;
		while(!queue.isEmpty()) {
			num = queue.poll();
			
			for(int i : next(num)) {
				
				if(i < 0 || i > 100000) continue;
				if(visited[i] != -1) continue;
				queue.offer(i);
				visited[i] = visited[num]+1;

				if(i == k) {
					cnt = visited[i];
					return;
				}
			}
		}
		
	}
	
	static int[] next(int x) {
		return new int[] {x-1, x+1, 2*x};
	}

}


/*
 
시간, 메모리 모두 더 사용함.


 */
