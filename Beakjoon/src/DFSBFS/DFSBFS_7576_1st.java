package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_7576_1st { // 토마토
	public static int[][] arr, periods;
	public static boolean[][] visited;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int n, m;
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
			}
		}
		
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] != 1) continue;
				visited = new boolean[m][n];
				bfs(i, j);
			}
		}
		
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
		
//		for(boolean[] a : visited) {
//			for(boolean b : a) {
//				System.out.print(b == true? "T":"F");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		int max = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(periods[i][j] < max) continue;
				max = periods[i][j];
				
				if(visited[i][j]) continue;
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
	
	static void bfs(int x, int y) {
		Queue<Integer[]> q = new LinkedList<Integer[]>();
		Integer[] a = {x, y};
		
		q.offer(a);
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			a = q.poll();
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
				if(visited[nx][ny]) continue;
				if(arr[nx][ny] == -1) {
					periods[nx][ny] = -1;
					visited[nx][ny] = true;
					continue;
				}
				
				if(arr[nx][ny] == 1) {
					periods[nx][ny] = 0;
					visited[nx][ny] = true;
					continue;
				}
				
				Integer[] temp = {nx, ny};
				q.offer(temp);
				visited[nx][ny] = true;
				periods[nx][ny] = (periods[nx][ny] == 0)? 
									periods[a[0]][a[1]]+1 : 
									Math.min(periods[nx][ny], periods[a[0]][a[1]]+1);
				//여기서 최대 소요시간을 설정하면 틀린다.
			}
			
		}
		
		
	}
	

}


/*
 
1퍼에서 시간초과.
분명 더 간단한 방법이 있을 것 같은데..

 */
