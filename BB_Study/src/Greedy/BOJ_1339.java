package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1339 {	// https://www.acmicpc.net/problem/1339
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] count = new int[26];
		char[][] words = new char[n][];
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		int length, sum = 0;
		for(int i = 0; i < n; i++) {
			words[i] = br.readLine().toCharArray();
			
			length = words[i].length;
			for(int j = length-1; j >= 0; j--) {
				count[words[i][j]-'A'] += Math.pow(10, length-j-1);
			}
		}
		
		for(int i : count) {
			if(i > 0) queue.add(i);
		}
		
		int num = 10-queue.size(), result = 0;
		while (!queue.isEmpty()) {
			result += queue.poll()*num++;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		br.close();
		bw.close();	
	}
}


