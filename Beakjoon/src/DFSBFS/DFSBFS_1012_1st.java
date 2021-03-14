package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DFSBFS_1012_1st { // 유기농 배추
	public static int[][] arr;
	public static boolean[][] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(br.readLine()),
			m, n, k, x, y, cnt;
		
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			cnt = 0;
			
			arr = new int[m][n];
			check = new boolean[m][n];
			for(int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				
				arr[x][y] = 1;
			}
			
			for(int j = 0; j < m; j++) {
				for(int l = 0; l < n; l++) {
					if(!check[j][l] && arr[j][l] == 1) {
						cnt++;
						dfs(j, l);
					}
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(int x, int y) {
		if(arr[x][y] == 0) return;
		if(check[x][y] == true) return;
		
		check[x][y] = true;
		
		if(x > 0) dfs(x-1, y);
		if(x < arr.length-1) dfs(x+1, y);
		if(y > 0) dfs(x, y-1);
		if(y < arr[x].length-1) dfs(x, y+1);
	}
}


/*
 


 */
