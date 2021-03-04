package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_1463_1st { // 1로 만들기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+1;
			
			if(i % 2 == 0) arr[i] = Math.min(arr[i/2]+1, arr[i]);
			if(i % 3 == 0) arr[i] = Math.min(arr[i/3]+1, arr[i]);
		}
		
		bw.write(Integer.toString(arr[n]));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
 DP 처음 시작할 때 안풀려서 고생했던 문제.
 그때 봤던 풀이가 어느정도 기억나서 이번엔 80% 정도 혼자 할 수 있었다.
 최소값 비교하는 부분에서 arr[i/n]+1 이 아니라 i/n으로 잘못 접근해서 조금 헤맴.

 */
