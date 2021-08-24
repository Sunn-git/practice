package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_1744 {	// https://www.acmicpc.net/problem/1744  4퍼에서 계속 틀리는 중
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i = 0; i < n; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
//		int before = 0, current, result = 0;
//		for(int i = 0; i < n; i++) {
//			current = queue.poll();
//			
//			if(current <= 0) {
//				result += current;
//				continue;
//			}
//			
//			if((n-i) % 2 == 0) {
//				
//			}
//		}
		
		int num, cnt = 0, result = 0; 
		while(!queue.isEmpty()) {
			num = queue.poll();
			cnt++;
			
			if(num <= 1) {
				result += num;
				continue;
			}
			
			if((n-cnt-1) % 2 == 0 && cnt != n) {
				num *= queue.poll();
				cnt++;
				
			}
			
			result += num;
		}
		
		
		bw.write(Integer.toString(result));
		bw.flush();
		br.close();
		bw.close();
		
	}
}


/*
 * 걸린 반례 : 1도 곱보다는 합이다. 음수끼리 곱하면 양수가 된다. 두번째 반례 해결하기.
 * 
 * 
 */