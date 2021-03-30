package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class DFSBFS_7562_1st { // 나이트의 이동
	public static int[][] visited;
	public static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	public static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
	public static String[][] xy = new String[2][2];
	public static StringBuffer sb = new StringBuffer();
	public static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			visited = new int[n][n];
			
			xy[0] = br.readLine().split(" ");
			xy[1] = br.readLine().split(" ");
			
			bfs();
			
		}
		
//		for(String[] ar : xy) {
//			for(String s : ar) {
//				System.out.printf("%s ", s);
//			}
//			System.out.println();
//		}

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void bfs() {
		int x = Integer.parseInt(xy[0][0]),
			y = Integer.parseInt(xy[0][1]),
			tx = Integer.parseInt(xy[1][0]),
			ty = Integer.parseInt(xy[1][1]), 
			result = 0;
		
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {x, y});
		visited[x][y] = 1; // 시작점을 이동가능한 칸(0)과 구분하기 위한 설정
		
		int[] origin;
		while(!queue.isEmpty()) {
			origin = queue.poll();
//			System.out.printf("%d %d\n", origin[0], origin[1]);
			
			if(origin[0] == tx && origin[1] == ty) {
				// 1부터 시작했으므로 끝날때 1 빼줘야한다.
				result = visited[tx][ty]-1;
				
				sb.append(result).append("\n");
				return;
			}
			
			int nx, ny;
			for(int i = 0; i < dx.length; i++) {
				nx = origin[0]+dx[i];
				ny = origin[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
				if(visited[nx][ny] > 0) continue;
				
				queue.offer(new int[] {nx, ny});
				visited[nx][ny] = visited[origin[0]][origin[1]]+1;
				
			}
		}
	}
	

}


/*
 




 */
