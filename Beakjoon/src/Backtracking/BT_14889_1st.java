package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_14889_1st { // 스타트와 링크
	static int[][] S;
	static int n;
	static boolean[] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
		check = new boolean[n];
		S = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		
		bw.write(Integer.toString(min));
		bw.flush();
		br.close();
		bw.close();
	}
	static int min = Integer.MAX_VALUE;
	
	static void dfs(int depth, int start) {
		if(depth == n/2) {
			int[] team1 = new int[n/2], team2 = new int[n/2];
			int i1 = 0, i2 = 0;
			
			for(int i = 0; i < n; i++) {
				if(check[i]) {
					team1[i1++] = i;
				}else {
					team2[i2++] = i;
				}
			}
			
			min = Math.min(min, Math.abs(getStats(team1) - getStats(team2)));	
			return;
		}
		
		for(int i = start; i < ((depth==0)? 1 : n); i++) {
			check[i] = true;
			dfs(depth+1, i+1);
			check[i] = false;
		}
		return;
	}
	
	static int getStats(int[] team) {
		int total = 0;
		for(int i = 0; i < team.length; i++) {
			for(int j = i+1; j < team.length; j++) {
				total += S[team[i]][team[j]];
				total += S[team[j]][team[i]];
			}
		}
		return total;
	}
	
	
}


/*

확인 출력부 정리안한 코드

 public class BT_14889_1st { // 스타트와 링크
	static int[][] S;
	static int n;
	static boolean[] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
//		int[] num = new int[n/2];
		check = new boolean[n];
		S = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
//		for(int[] arr : S) {
//			for(int i : arr) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
		
//		dfs(num, 0, 0);
		dfs(0, 0);
		
		
		bw.write(Integer.toString(min));
		bw.flush();
		br.close();
		bw.close();
	}
	static int min = Integer.MAX_VALUE;
	
	static void dfs(int depth, int start) {
		if(depth == n/2) {
//			System.out.println("=======[END]=========");
//			for(boolean b : check) {
//				System.out.print((b)? "O" : "X");
//			}
//			System.out.println();
			
			int[] team1 = new int[n/2], team2 = new int[n/2];
			int i1 = 0, i2 = 0;
			
			for(int i = 0; i < n; i++) {
				if(check[i]) {
					team1[i1++] = i;
				}else {
					team2[i2++] = i;
				}
			}
			
//			System.out.print("team1 : ");
//			for(int i : team1) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//			System.out.print("team2 : ");
//			for(int i : team2) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println("*********************");
			
//			System.out.println("team1 : " + getStats(team1));
//			System.out.println("team2 : " + getStats(team2));
			
			min = Math.min(min, Math.abs(getStats(team1) - getStats(team2)));
			
//			for(int i : num) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//			System.out.println("=====================");
			
			return;
		}
		
		for(int i = start; i < ((depth==0)? 1 : n); i++) {
//			num[depth] = i;
			check[i] = true;
			dfs(depth+1, i+1);
			check[i] = false;
		}
		return;
		
	}
	
	static int getStats(int[] team) {
		int total = 0;
		
		for(int i = 0; i < team.length; i++) {
			for(int j = i+1; j < team.length; j++) {
//				System.out.println("i : "+i+" / j : "+j);
				total += S[team[i]][team[j]];
				total += S[team[j]][team[i]];
//				System.out.println("total : "+total);
			}
		}
		
		return total;
	}
	
	
}

 */
