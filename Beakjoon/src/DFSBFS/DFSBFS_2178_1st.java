package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_2178_1st { //미로탐색
	public static int[][] arr, arr2;
	public static boolean[][] visited;
	public static int[] dx = {-1, 1, 0 ,0},
						dy = {0, 0, -1, 1};
	public static int n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());		
		arr = new int[n][m];
		arr2 = new int[n][m];
		visited = new boolean[n][m];
		 
		String[] temp;
		for(int i = 0; i < n; i++) {
			temp = br.readLine().split("");
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);

			 }
		}
		 
//		 for(int[] a : arr) {
//			 for(int i : a) {
//				 System.out.printf("%d ", i);
//			 }
//			 System.out.println();
//		 }
		 
		bfs(0, 0);
		
		bw.write(Integer.toString(arr2[n-1][m-1]));
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void bfs(int x, int y) {
		Queue<Integer[]> q = new LinkedList<Integer[]>();
		Integer[] a = {x, y};
		
		visited[x][y] = true;
		arr2[x][y] = 1;
		q.offer(a);
		
		while(!q.isEmpty()) {
			a = q.poll();
//			System.out.printf("%d, %d / size : %d\n", a[0], a[1], q.size());
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
				if(arr[nx][ny] != 1 || visited[nx][ny]) continue;
				
				Integer[] temp = {nx, ny};
				visited[nx][ny] = true;
				arr2[nx][ny] = arr2[a[0]][a[1]]+1;
				q.offer(temp);
				
			}
		}
		
		
	}

}


/*
 
 https://youtu.be/ftOmGdm95XI
최단거리를 어떻게 측정해야할지 도저히 감이 안왔는데 배열에 값을 넣어주는 방법이 있었구나 !!

 */
