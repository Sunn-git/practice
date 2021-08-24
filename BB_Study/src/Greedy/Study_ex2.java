package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Study_ex2 {	// https://www.acmicpc.net/problem/1931
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int n = Integer.parseInt(br.readLine());
		Integer[][] meetings = new Integer[n][2];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			meetings[i][0] = Integer.parseInt(st.nextToken());
			meetings[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(meetings, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				int result = o1[1].compareTo(o2[1]);
				if(result == 0) result = o1[0].compareTo(o2[0]);
				 
				return result;
			}
		});
		
//		for(Integer[] ar : meetings) {
//			System.out.printf("%d %d\n", ar[0], ar[1]);
//		}
		
		Integer[] cMeeting = {meetings[0][0], meetings[0][1]};
		
		int result = 1;
		
		for(int i = 1; i < n; i++) {
			if(meetings[i][0] >= cMeeting[1]) {
				cMeeting[0] = meetings[i][0];
				cMeeting[1] = meetings[i][1];
				result++;
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		br.close();
		bw.close();
		
	}
}


