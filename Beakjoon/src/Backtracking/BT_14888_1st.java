package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_14888_1st { // 연산자 끼워넣기 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sign = new int[4];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			sign[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(arr, sign, 0, arr[0]);
		sb.append(max).append("\n").append(min);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}	
	
	static void dfs(int[] arr, int[] sign, int depth, int result) {
		if(depth == arr.length-1) {
			if(result > max) max = result;
			if(result < min) min = result;
			return;
		}
		
		int temp = result;

//			for(int num : sign) {
//				System.out.printf("%d ", num);
//			}
//			System.out.println();
		
		for(int i = 0; i < sign.length; i++) {
			if(sign[i] != 0) {
				sign[i]--;
				result = cal(i, arr[depth+1], result);
				dfs(arr, sign, depth+1, result);
				
				sign[i]++;
				result = temp;
			}
		}
		return;
			
		
	}
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	
	static int cal(int i, int temp, int result) {
		if(i == 0) {
			result += temp;
		}else if(i == 1) {
			result -= temp;
		}else if(i == 2) {
			result *= temp;
		}else {
			result /= temp;
		}
		
		return result;
	}
	
}


/*
 

 
 

 */
