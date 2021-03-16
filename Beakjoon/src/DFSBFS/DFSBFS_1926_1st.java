package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_1926_1st { //그림
	public static int[][] arr;
	public static boolean[][] visited;
	public static int[] dx = {-1, 1, 0 ,0},
						dy = {0, 0, -1, 1};
	public static int n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());		
		arr = new int[n][m];
		visited = new boolean[n][m];
		 
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			 }
		}

		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] != 1 || visited[i][j]) continue;
				cnt++;
				bfs(i, j);
			}
		}
		
		sb.append(cnt).append("\n").append(max);
		 
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	static int max = 0;
	
	static void bfs(int x, int y) {
		int size = 0;
		Queue<Integer[]> q = new LinkedList<Integer[]>();
		Integer[] a = {x, y};
		
		visited[x][y] = true;
		q.offer(a);
		
		while(!q.isEmpty()) {
			a = q.poll();
			size++;
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
				if(arr[nx][ny] != 1 || visited[nx][ny]) continue;
				
				Integer[] temp = {nx, ny};
				visited[nx][ny] = true;
				q.offer(temp);
			}
		}
		
		if(size > max) max = size;
	}

}


/*
 
넓이는 q에서 poll하는 횟수와 동일하다

 */
