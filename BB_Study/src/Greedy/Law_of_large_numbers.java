package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Law_of_large_numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuffer sb = new StringBuffer();

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력 처리
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//시작시간 
		long startTime = System.currentTimeMillis(); 
		
		Arrays.sort(arr);
		
		int sum = 0;
		
//		for문을 돌면서 하나하나 더해보는 방법
//		int cnt = 0;
//		for(int i = 0; i < m; i++) {
//			if(cnt == k) {
//				sum += arr[n-2];
//				cnt = 0;
//			}else {
//				sum += arr[n-1];
//				cnt++;				
//			}
//		}
		
//		반복되는 수열을 하나로 묶어서 제일 큰 숫자가 쓰인 개수를 알아내는 방법
//		int cnt = (m/(k+1))*k + (m%(k+1));
//		sum += cnt*arr[n-1];
//		cnt = m - cnt;
//		sum += cnt*arr[n-2];
	
		//완료 시간
		long endTime = System.currentTimeMillis();
		long diffTime = endTime - startTime;
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("소요시간 : %d ms\n", diffTime);
	}

}
