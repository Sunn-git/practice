package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_7576_2nd { // 토마토
	public static Queue<Integer[]> q = new LinkedList<Integer[]>();
	public static int[][] arr, periods;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int n, m, max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m][n];
		periods = new int[m][n];
		
		
		for(int i = 0; i < m; i++) {
			st =new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] != 1) continue;
				Integer[] temp = {i, j};
				q.offer(temp);	
				
			}
		}
		
		
		bfs();
		
		
//		for(int[] a : arr) {
//			for(int i : a) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
//
//		System.out.println("==========================");
//		
//		for(int[] a : periods) {
//			for(int i : a) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(periods[i][j] != 0) continue;
				if(arr[i][j] == 0) {
					max = -1;
					i = m;
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
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				
				// 범위에 안맞는 경우
				if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
				
				// 익은 토마토인 경우
				if(arr[nx][ny] == 1) continue;
				
				// 토마토가 없는 경우
				if(arr[nx][ny] == -1) {
					periods[nx][ny] = -1;
					continue;
				}
				
				// 이미 방문한 덜익은 토마토인 경우
				if(arr[nx][ny] == 0 && periods[nx][ny] != 0) continue;
				
				Integer[] temp = {nx, ny};
				q.offer(temp);
				periods[nx][ny] = periods[a[0]][a[1]]+1;
				
				max = Math.max(periods[nx][ny], max);
	
			}
			
		}
		
		
	}
	

}


/*
 
 시작점이 여러개인 bfs문제
 나는 시작점이 여러개면 반복문을 돌면서 시작점마다 bfs를 실행하고 더 작은 값을 취하면 될 줄 알았는데
 시간초과가 발생한다.
 
 시작점이 여러개인 bfs문제는 
 모든 시작점을 한번에 queue에 넣고 시작해야한다.
 https://youtu.be/ftOmGdm95XI
 


 */
