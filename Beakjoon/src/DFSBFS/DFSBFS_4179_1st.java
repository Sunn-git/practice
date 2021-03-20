package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_4179_1st { // 불! 진행중
	public static Queue<int[]> q;
	public static char[][] arr;
	public static int[][] visitedF, visitedJ;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int r, c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new char[c][r];
		visitedF = new int[c][r];
		visitedJ = new int[c][r];
		
		int[] J = new int[2];
		int[] F = new int[2];
		
		for(int i = 0; i < c; i++) {
			arr[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < r; j++) {
				if(arr[i][j] == 'J' ) {
					J[0] = i;
					J[1] = j;
				}
				if(arr[i][j] == 'F') {
					F[0] = i;
					F[1] = j;
				}
				
				if(arr[i][j] == '.') {
					visitedF[i][j] = -1;
					visitedJ[i][j] = -1;
				}
			}
		}
		
//		for(char[] ar : arr) {
//			for(char c : ar) {
//				System.out.printf("%s ", c);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("========================");
//		
//		for(int[] ar : visited) {
//			for(int i : ar) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
		q = new LinkedList<int[]>();
		q.offer(F);
		while(!q.isEmpty()) {
			F = q.poll();
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = F[0]+dx[i];
				ny = F[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= c || ny >= r) continue;
				if(visitedF[nx][ny] >= 0) continue;
				
				q.offer(new int[] {nx, ny});
				visitedF[nx][ny] = visitedF[F[0]][F[1]]+1;
			}
		}
		
		bfs(J);
		
		
		for(int[] ar : visitedJ) {
			for(int i : ar) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
		
		bw.write(Integer.toString(length));
		bw.flush();
		br.close();
		bw.close();
	}
	static int length = 0;
	
	static void bfs(int[] J) {
		int[] a = J;
		q.offer(a);
		
		while(!q.isEmpty()) {
			a = q.poll();
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= c || ny >= r) {
					return;
				}
				
				if(visitedJ[nx][ny] >= 0) continue;
				if(visitedF[nx][ny] <= visitedJ[a[0]][a[1]]+1) continue;
				
				q.offer(new int[] {nx, ny});
				visitedJ[nx][ny] = visitedJ[a[0]][a[1]]+1;
				length = visitedJ[nx][ny];
				
			}
		}
		
		length = -1;
		
//		System.out.println();
//		for(int[] ar : visitedJ) {
//			for(int i : ar) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
		
		
	}
	
}


/*

지금까지처럼 목적지가 정해져있거나, 더이상 갈 곳이 없을 때까지 반복하는 경우와 달라 문제를 어떻게 풀어야 할지 막막했다.
이 경우에는 경계를 벗어나면 탈출이기 때문에 경계를 벗어나는 조건을 종료조건으로 주면 됐다.

https://www.youtube.com/watch?v=ftOmGdm95XI
방문처리를 두개의 배열에서 따로 해줘야하고
while문 내용도 달라진다.

 */
