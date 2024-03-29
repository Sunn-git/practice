package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_4179_1st { // 불! 진행중 28퍼에서 틀림
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

지금까지처럼 목적지가 정해져있거나, 더이상 갈 곳이 없을 때까지 반복하는 경우와 달라 문제를 어떻게 풀어야 할지 막막했다.
이 경우에는 경계를 벗어나면 탈출이기 때문에 경계를 벗어나는 조건을 종료조건으로 주면 됐다.

https://www.youtube.com/watch?v=ftOmGdm95XI
방문처리를 두개의 배열에서 따로 해줘야하고
while문 내용도 달라진다.

5 5
....F
...J#
....#
....#
...#.

답 4

5 5
#####
#...#
#.J.#
#...#
#####
답 -1


7 6
######
#.J..#
#.##.#
#....#
..####
#.#...
#...#F
답 6


=============

21퍼에서 통과 못한 테케

4 4
###F
#J.#
#..#
#..#
답 : 3  오답 -1 >> 불이 움직이지 못하는 경우를 고려안함
고쳤지만 여전히 21퍼에서 틀림

==========================
10 10
#........#
#........#
#........#
#........#
#...J....#
#........#
#........#
#........#
#........#
FFFFFFFFFF

테케를 돌려보니 불이 전혀 번지지 않고있었다..
고쳤지만 25퍼에 틀림 ^^

================================

visitedF[nx][ny] >= 0 에 등호 추가해주니 28퍼에서 틀림

 */
