package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_2178_2nd { //미로탐색
	public static String[][] arr;
	public static int[][] distance;
	public static int[] dx = {-1, 1, 0 ,0},
						dy = {0, 0, -1, 1};
	public static int n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());	
		arr = new String[n][];
		distance = new int[n][m];
		 
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine().split("");
		}
		 
//		 for(String[] a : arr) {
//			 for(String s : a) {
//				 System.out.printf("%s ", s);
//			 }
//			 System.out.println();
//		 }
		 
		bfs(0, 0);
		
		bw.write(Integer.toString(distance[n-1][m-1]));
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void bfs(int x, int y) {
		Queue<Integer[]> q = new LinkedList<Integer[]>();
		Integer[] a = {x, y};
		distance[x][y] = 1;
		q.offer(a);
		
		while(!q.isEmpty()) {
			a = q.poll();
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
				if(!arr[nx][ny].equals("1") || distance[nx][ny] != 0) continue;
				
				Integer[] temp = {nx, ny};
				distance[nx][ny] = distance[a[0]][a[1]]+1;
				q.offer(temp);
			}
		}
	}

}


/*
 
distance 배열 만으로 방문 여부를 확인할 수 있다.

 */
