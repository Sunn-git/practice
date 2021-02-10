package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_1182_1st { // 부분수열의 합
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		if(s == 0) cnt--; // 합이 0 일 경우 아무것도 포함하지 않는 공집합 제외
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(arr, s, 0, 0);
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		br.close();
		bw.close();
	}
	
	static int cnt = 0;
	
	static void dfs(int[] arr, int s, int sum, int depth) {
		//조건문이 밖에 있으면  중간에만 s를 만족하고 뒤에 숫자가 추가됐을 때 만족하지 않는 경우도 세진다.
		if(depth == arr.length) {
			if(sum == s) cnt++; // 어차피 마지막 깊이까지 다 돌아야 하기 때문에 조건문을 여기에 넣어줘야 한다.
			return;
		}
		
		dfs(arr, s, sum, depth+1);
		dfs(arr, s, sum + arr[depth], depth+1);	
		//부분수열의 경우들을 이렇게 만들어야 한다는걸 생각 못했음.
	}
}


/*
 
https://geehye.github.io/baekjoon-1182/# 참고
 
 

 */
