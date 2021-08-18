package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Study_ex1 {	//https://www.acmicpc.net/problem/15903
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력 처리
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Queue<Long> cards = new PriorityQueue<Long>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			cards.add(Long.parseLong(st.nextToken()));
		}

		long sum;
		for(int i = 0; i < m; i++) {
			sum = cards.poll() + cards.poll();
			cards.add(sum);
			cards.add(sum);
		}
		
		long result = 0;
		for(long num : cards) {
			result += num;
		}
		
		bw.write(Long.toString(result));
		bw.flush();
		br.close();
		bw.close();
		
	}
}


