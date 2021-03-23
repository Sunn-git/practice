package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_4179_2nd { // 불! 완료.
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
		
		r = Integer.parseInt(st.nextToken()); // 세로길이 주의
		c = Integer.parseInt(st.nextToken()); // 가로길이 주의
		arr = new char[r][c];
		visitedF = new int[r][c];
		visitedJ = new int[r][c];
		
		int[] J = new int[2];
		
		q = new LinkedList<int[]>();
		
		for(int i = 0; i < r; i++) {
			arr[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < c; j++) {
				if(arr[i][j] == 'J' ) {
					J[0] = i;
					J[1] = j;
				}
				if(arr[i][j] == 'F') {
					q.offer(new int[] {i, j}); // 불은 처음부터 넣어줘야한다 (여러개 일 수 있다)
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
		int[] F;
		while(!q.isEmpty()) {
			F = q.poll();
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = F[0]+dx[i];
				ny = F[1]+dy[i];
//				System.out.printf("nx:%d / ny:%d\n", nx, ny);
				
				if(nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
				if(visitedF[nx][ny] >= 0) continue;
				
				q.offer(new int[] {nx, ny});
				visitedF[nx][ny] = visitedF[F[0]][F[1]]+1;
			}
		}
		
//		for(int[] ar : visitedF) {
//			for(int i : ar) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
		
		
		bfs(J);
		
		String result = (length != -1)? Integer.toString(length) : "IMPOSSIBLE";
		
		bw.write(result);
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
			//length 위치설정 중요
			length = visitedJ[a[0]][a[1]];
			
			int nx, ny;
			for(int i = 0; i < 4; i++) {
				nx = a[0]+dx[i];
				ny = a[1]+dy[i];
				
				if(nx < 0 || ny < 0 || nx >= r || ny >= c) {
					length++;
					return;
				}
				
				if(visitedJ[nx][ny] >= 0) continue;
				if(visitedF[nx][ny] >= 0 && visitedF[nx][ny] <= visitedJ[a[0]][a[1]]+1) continue;
				
				q.offer(new int[] {nx, ny});
				visitedJ[nx][ny] = visitedJ[a[0]][a[1]]+1;
				
				//length 위치를 잘못잡음
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

그동안 IMPOSSIBLE 대신에 -1을 출력해서 계속 틀리던 거였다.............
정말 이렇게 허무할 수가 없다.

 */
