package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_2206_2nd { // 벽 부수고 이동하기 메모리초과
	public static int[][] arr;
	public static int[][][] visited;
	public static int[] dx = {1, 0, -1, 0};
	public static int[] dy = {0, 1, 0, -1};
	public static int n, m, result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
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
		
		for(int[][] ar : visited) {
			for(int[]a : ar) {
				for(int i : a) {
					System.out.printf("%d ", i);					
				}
				System.out.println();				
			}
			System.out.println("================");
		}
		
		bw.write(Integer.toString(result));
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
			if(a[1] == n-1 && a[2] == m-1) {
				result = visited[a[0]][a[1]][a[2]];
				return;
			}

			int nx,ny;
			for(int i = 0; i < 4; i++) {
				nx = a[1]+dx[i];
				ny = a[2]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
				if(visited[a[0]][nx][ny] > 0 && 
						visited[a[0]][nx][ny] < visited[a[0]][a[1]][a[2]]+1)
					continue;
				if(arr[nx][ny] == 0) {
					queue.offer(new int[] {a[0], nx, ny});
					visited[a[0]][nx][ny] = visited[a[0]][a[1]][a[2]]+1;
					
				}else if(arr[nx][ny] == 1) {
					if(a[0] == 1) continue;
					if(!canIBreakIt(nx, ny)) continue;
					
					queue.offer(new int[] {a[0]+1, nx, ny});
					visited[a[0]+1][nx][ny] = visited[a[0]][a[1]][a[2]]+1;
				}
			}
		}
		
		result = -1;
		
	}
	
	static boolean canIBreakIt(int x, int y) {
		int cnt = 0;
		
		int nx, ny;
		for(int i = 0; i < 4; i++) {
			nx = x+dx[i];
			ny = y+dy[i];
			
			if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
			if(arr[nx][ny] == 1) continue;
			cnt++;	
		}
		
		return cnt >= 2;
	}
}


/*
 
 nx, ny가 벽인경우와 아닌 경우를 모두  queue에 담아줘야 한다.
 
 
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
