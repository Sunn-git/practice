package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class DFSBFS_2667_1st { // 단지번호붙이기
	public static boolean[][] visited;
	public static int n, size, cnt = 0;
	public static int[][] input;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		n = Integer.parseInt(br.readLine());
		input = new int[n][n];
		visited = new boolean[n][n];
		
		String[] temp; // 입력값으로 배열 만들기
		for(int i = 0; i < n; i++) {
			temp = br.readLine().split("");
			for(int j = 0; j < n; j++) {
				input[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
//		ArrayList<Integer> list = new ArrayList<Integer>(); 
//		단지 크기를 넣어주기 위한 AL or PQ 하나만 사용하면 된다. AL을 사용하면 Collections.sort를 해줘야함
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(input[i][j] == 0 || visited[i][j]) continue;
				
				cnt++;
				size = 0;
				dfs(i, j);
//				list.add(size);
				q.offer(size);
			}
		}
		
//		Collections.sort(list);
		
		sb.append(cnt).append("\n");
//		for(int i: list) {
//			sb.append(i).append("\n");
//		}
		
		
		while(!q.isEmpty()) {
			sb.append(q.poll()).append("\n");
		}
	
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void dfs(int x, int y) {
		if(input[x][y] == 0 || visited[x][y]) return;
		
		size++;
		visited[x][y] = true;
		
		//상
		if(x > 0) dfs(x-1, y);
		//하
		if(x < n-1) dfs(x+1, y);
		//좌
		if(y > 0) dfs(x, y-1);
		//우
		if(y < n-1) dfs(x, y+1);
	}
}


/*
 
naver preTest에서 봤던 문제
그래프가 아니라 dfs를 사용해서 상하좌우를 확인해서 푸는 풀이법을 봤었다.
흐름을 기억하고 있어서 수월하게 혼자 코드를 짤 수 있었다. >> 6퍼에서 틀림 ㅠ

틀린부분 
set에는 중복값이 들어가지 못한다...  >> ArrayList로 바꿔서 해결 
반례         답 : 4 1 2 2 7 인데  4 1 2 7로 출력됨 ㅠ
5
01101
01101
11100
00011
00100


PQ가 빠를까 AL이 빠를까? 
	>> PQ로 바꾸니까 틀림  
		>> 출력문제였다 !! forEach로 출력해서 틀린거였음 while문으로 출력하면 통과
			>> 시간은 PQ가 더 오래걸리고 (+8ms) 메모리는 AL가 더 많이 사용한다(+100KB)

 */
