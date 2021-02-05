package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_9663_1st { // N-Queen 실패
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken());
		boolean[][] check = new boolean[n][n];
		boolean[][] check2 = new boolean[n][n];
		
		dfs(n, check, 0);
		System.out.println(cnt);
		
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}	
	
	static int cnt = 0;
	
	static void dfs(int n, boolean[][] check, int qCnt) {
		if(qCnt == n) {
//			for(boolean[] b : check) {
//				for(boolean bo : b) {
//					System.out.printf("%s ", (bo == true)? "T" : "F");
//				}
//				System.out.println();
//			}
//			
//			System.out.println("===========================");
			
			cnt++;
			
			return;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!check[i][j]) {
					
					boolean[][] temp = new boolean[n][n];
					for(int k = 0; k < n; k++) {
						for(int l = 0; l < n; l++) {
							temp[k][l] = check[k][l];
						}
					}
					
					if(qCnt == 3) {
						System.out.println(qCnt);
						for(boolean[] b : check) {
							for(boolean bo : b) {
								System.out.printf("%s ", (bo == true)? "O" : "X");
							}
							System.out.println();
						}
						System.out.println("===========================");
						
					}
					
					check[i][j] = true;
//					check2[i][j] = true;
					
					for(int k = 0; k < n; k++) {
						for(int l = 0; l < n; l++) {
							if(k == i || j == l || Math.abs(i-k) == Math.abs(j-l)) check[k][l] = true;
						}
					}
					
					
					
					dfs(n, check, qCnt+1);
					
					check = temp;
					
//					for(boolean[] b : check) {
//						for(boolean bo : b) {
//							System.out.printf("%s ", (bo == true)? "O" : "X");
//						}
//						System.out.println();
//					}
//					
//					System.out.println("********************");
					
				}// if end
					
			}
		}
		
		return;
	}
}


/*
 

 
 

 */
