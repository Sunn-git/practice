package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Plus_or_multiply {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuffer sb = new StringBuffer();

//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력 처리	
		char[] arr = br.readLine().toCharArray();
		
		//시작시간 
		long startTime = System.currentTimeMillis(); 
		
		int length = arr.length;
		int result = arr[0]-'0';
		
		for(int i = 1; i < length; i++) {
			if(arr[i-1]-'0' <= 1) 
				result += (arr[i]-'0');
			else
				result *= (arr[i]-'0');
		}
	
		//완료 시간
		long endTime = System.currentTimeMillis();
		long diffTime = endTime - startTime;
		
		System.out.printf("결과값 : %d\n", result);
		System.out.printf("소요시간 : %d ms\n", diffTime);
	}
}
