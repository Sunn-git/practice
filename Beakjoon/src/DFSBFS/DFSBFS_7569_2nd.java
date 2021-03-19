package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_7569_2nd { // 토마토 (3차원)
	public static Queue<Integer[]> q = new LinkedList<Integer[]>();
	public static int[][][] arr, periods;
	public static int[] dx = {-1, 1, 0, 0, 0, 0}; //h
	public static int[] dy = {0, 0, -1, 1, 0, 0}; //m
	public static int[] dz = {0, 0, 0, 0, -1, 1}; //n
	public static int n, m, h, max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		arr = new int[h][n][m];
		periods = new int[h][n][m];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < m; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					
					if(arr[i][j][k] == 1) {
						q.offer(new Integer[] {i, j, k});
						periods[i][j][k] = 0;
						
					}else if(arr[i][j][k] == 0) {
						periods[i][j][k] = -1;
					}
				}	
			}
		}
		
//		for(int[][] ar : arr) {
//			for(int[] a : ar) {
//				for(int i : a) {
//					System.out.printf("%d ", i);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//		
//		System.out.println("===============");
			
		bfs();
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(periods[i][j][k] < 0) {
						max = -1;
						i = h;
						j = n;
						break;
					}
				}	
			}
		}

		bw.write(Integer.toString(max));
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void bfs() {
		Integer[] a;
		
		while(!q.isEmpty()) {
			a = q.poll();
			
			int nx, ny, nz;
			for(int i = 0; i < 6; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				nz = a[2]+dz[i];
				
				if(!isSafe(nx, ny, nz)) continue;
				if(periods[nx][ny][nz] >= 0) continue;
				
				q.offer(new Integer[]{nx, ny, nz});
				periods[nx][ny][nz] = periods[a[0]][a[1]][a[2]]+1;
				
				max = Math.max(max, periods[nx][ny][nz]);
			}
		}

		
	}
	
	static boolean isSafe(int nx, int ny, int nz) {
		if(nx < 0 || ny < 0 || nz < 0) return false;
		if(nx >= h || ny >= n || nz >= m) return false;
		
		return true;
	}
}


/*

이중 for문으로 할 수 있을 것 같았는데 결국  3중을 써버렸다.
m과 n 순서 때문에 헷갈림.

 */
