package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_7569_1st { // 토마토 (3차원)
	public static Queue<Integer[]> q = new LinkedList<Integer[]>();
	public static int[][][] arr, periods;
	public static int[] dx = {-1, 1, 0, 0, 0, 0};
	public static int[] dy = {0, 0, -1, 1, 0, 0};
	public static int[] dz = {0, 0, 0, 0, -1, 1};
	public static int n, m, h, max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		arr = new int[m][n][h];
		periods = new int[m][n][h];
		
		for(int i = 0; i < m*h; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i/h][j][i/m] = Integer.parseInt(st.nextToken());
				
				if(arr[i/h][j][i/m] == 1) {
					q.offer(new Integer[]{i/h, j, i/m});
					
				}else if(arr[i/h][j][i/m] == 0) {
					periods[i/h][j][i/m] = -1;
				}
			}
		}
		
//		for(int[][] ar : arr) {
//			for(int[] a : ar) {
//				for(int i : a) {
//					System.out.printf("%d ", i);
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println("==========================");
//		
//		for(int[][] ar : periods) {
//			for(int[] a : ar) {
//				for(int i : a) {
//					System.out.printf("%d ", i);
//				}
//			}
//			System.out.println();
//		}
			
		bfs();
		
		for(int[][] ar : periods) {
			for(int[] a : ar) {
				for(int i : a) {
					System.out.printf("%d ", i);
				}
			}
			System.out.println();
		}

		
		for(int i = 0; i < m*h; i++) {
			for(int j = 0; j < n; j++) {
				if(periods[i/h][j][i/m] < 0) {
					max = -1;
					i = m*h;
					break;
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
		if(nx >= m || ny >= n || nz >= h) return false;
		
		return true;
	}
	

}


/*

틀리는 반례 

3 3 2
1 1 0
1 1 0
0 0 0
0 0 0
0 1 1
0 1 1

담 : 1

 */
