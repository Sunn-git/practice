package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_2206_1st { // 벽 부수고 이동하기
//	public static boolean[][] arr;
	public static int[][] arr;
	public static int[][][] visited;
	public static int[] dx = {1, 0, -1, 0};
	public static int[] dy = {0, 1, 0, -1};
	public static int n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new int[2][n][m];
		
		String temp;
		for(int i = 0; i < n; i++) {
			temp = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = temp.charAt(j)-'0';
				
				if(arr[i][j] != 1) {
					visited[0][i][j] = -1;
					visited[1][i][j] = -1;
				}
			}
		}
		
		bfs();
		
//		for(int[] ar : arr) {
//			for(int i : ar) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("================");
//		
		for(int[][] ar : visited) {
			for(int[]a : ar) {
				for(int i : a) {
					System.out.printf("%d ", i);					
				}
				System.out.println();				
			}
			System.out.println("================");
		}
		
		bw.write("");
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void bfs() {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {0,0,0});
		visited[0][0][0] = 1;
		
		int[] a;
		while(!queue.isEmpty()) {
			a = queue.poll();
//			System.out.printf("0: %d, 1:%d, 2:%d \n", a[0], a[1], a[2]);
			
			int nx,ny;
			for(int i = 0; i < 4; i++) {
				nx = a[1]+dx[i];
				ny = a[2]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
				if(a[0] == 1 && arr[nx][ny] == 1) continue;
				if(a[0] == 0 && arr[nx][ny] == 1) {
					if(!canIBreakIt(nx, ny)) continue;
					a[0] = 1;
					visited[a[0]][a[1]][a[2]] = visited[0][a[1]][a[2]];
				}				
				if(visited[a[0]][nx][ny] > 0) continue;
				
//				System.out.printf("nx : %d, ny : %d\n", nx, ny);
				
				queue.offer(new int[] {a[0], nx, ny});
				visited[a[0]][nx][ny] = visited[a[0]][a[1]][a[2]]+1;
				
				if(nx == n-1 && ny == m-1) return;
				
			}
		}
	}
	
	static boolean canIBreakIt(int x, int y) {
//		System.out.printf("x : %d , y : %d, ", x, y);
		int cnt = 0;
		
		int nx, ny;
		for(int i = 0; i < 4; i++) {
			nx = x+dx[i];
			ny = y+dy[i];
			
			if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
			if(arr[nx][ny] == 1) continue;
			cnt++;	
		}
//		System.out.println("cnt : "+cnt);
		
		return cnt >= 2;
	}
}


/*
 
6 4
0000
1110
1000
0000
0111
0000

6 4
0000
1110
1000
0000
0111
0000



 */
