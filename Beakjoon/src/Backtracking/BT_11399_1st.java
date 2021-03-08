package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BT_11399_1st { // ATM
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()), sum = 0;
		int[] times = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times);
		
		for(int i = 0; i < n; i++) {
			sum += times[i]*(n-i);
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
소요시간이 적은 순서대로 인출하면 총 소요시간이 최소가 된다.

14860KB / 148ms/ 853B

 */
