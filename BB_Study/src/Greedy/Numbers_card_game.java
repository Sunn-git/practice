package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Numbers_card_game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuffer sb = new StringBuffer();

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력 처리
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//시작시간 
		long startTime = System.currentTimeMillis(); 
		
		int[] min = new int[n];
		int minMax = 0;
//		이중 for문 (소요시간 0ms)
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < m; j++) {
//				if(j == 0) {
//					min[i] = arr[i][j];
//					continue;
//				}
//						
//				min[i] = (arr[i][j] < min[i])? arr[i][j] : min[i];
//			}
//			
//			minMax = (min[i] > minMax)? min[i] : minMax;
//		}
		
//		stream 사용하기 (소요시간 예제1: 39ms, 예제2: 33ms)
		for(int i = 0; i < n; i++) {
			min[i] = Arrays.stream(arr[i]).min().getAsInt();
		}
		
		minMax = Arrays.stream(min).max().getAsInt();
	
		//완료 시간
		long endTime = System.currentTimeMillis();
		long diffTime = endTime - startTime;
		
		System.out.printf("선택한 카드 : %d\n", minMax);
		System.out.printf("소요시간 : %d ms\n", diffTime);
	}
	

}
