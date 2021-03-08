package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BT_11399_2nd { // ATM
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()), sum = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			queue.offer(Integer.parseInt(st.nextToken()));
		}
		
		while(!queue.isEmpty()) {
			sum += queue.poll()*n--;
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
PriorityQueue가 sort보다 소요시간이 약간 더 길다. (+4ms)
					  자원소모는 약간 덜함. (-60KB)

14800KB / 152ms/ 871B

 */
