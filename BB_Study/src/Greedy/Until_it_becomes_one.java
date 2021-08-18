package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Until_it_becomes_one {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuffer sb = new StringBuffer();

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력 처리
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		//시작시간 
		long startTime = System.currentTimeMillis();
		
		int cnt = 0;
		
//		반복문 돌면서 하나씩 수행하는 방법
//		while(n != 1) {
//			cnt++;
//			if(n%k == 0) {
//				n /= k;
//				continue;
//			}
//			
//			n--;
//		}
		
//		k의 배수중 n보다 작으면서 가장 큰 수를 구해서 차이값을 한번에 빼는 방법
		int target;
		while(true) { //25 3
			target = (n/k)*k;
			cnt += (n - target);
			n = target;
			
			if(n < k) break;
			
			cnt++;
			n /= k;
		}
		
		cnt += (n-1);
	
		//완료 시간
		long endTime = System.currentTimeMillis();
		long diffTime = endTime - startTime;
		
		System.out.printf("최소 수행 횟수 : %d\n", cnt);
		System.out.printf("소요시간 : %d ms\n", diffTime);
	}

}
