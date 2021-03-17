package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_11659_1st { // 구간 합 구하기 4
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken()),
			m = Integer.parseInt(st.nextToken()), 
			start, end, sum = 0;
		int[] arr = new int[n+1], d = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			d[i] = sum;
		}
		
//		for(int i : arr) {
//			System.out.printf("%d ", i);
//		}
//		System.out.println();
//		
//		for(int i : d) {
//			System.out.printf("%d ", i);
//		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			
			sb.append(d[end]-d[start-1]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}


/*

테이블 정의 : d[i] 는 i번째 수 까지의 합

지금까지중에 제일 간단한 DP문제였다.

 */
