package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_1697_2nd { // 숨바꼭질
	public static int[] visited;
	public static int k, cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		int length = Math.max(n, k)*2+1;
		
		visited = new int[length]; // 범위에 대해 고민해보기
		
		for(int i = 0; i < visited.length; i++) {
			visited[i] = -1;
		}
		
		bfs(n);
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(start);
		visited[start] = 0;
		
		int num;
		while(!queue.isEmpty()) {
			num = queue.poll();
			
			for(int i : new int[]{num-1, num+1, num*2}) {
				
				if(i < 0 || i >= visited.length) continue;
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

}


/*
 


 */
