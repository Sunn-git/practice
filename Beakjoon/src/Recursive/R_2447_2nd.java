package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_2447_2nd { // 별 찍기 - 10
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = '*';
			}
		}
		
//		for(char[] ar : arr) {
//			for(char c : ar) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
		
		pattern(n, arr);
		
//		System.out.println("==================");
		
		for(char[] ar : arr) {
			sb.append(ar).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	private static char[][] pattern(int n, char[][] arr) {
		char[][] temp = arr;
		if(n == 1) return arr;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == ' ') continue;
				
				if((i/(n/3) %3) == 1 && (j/(n/3) %3) == 1) { 
					// n을 3으로 나눈 몫으로 i를 나누고(0,1,2,3,4...) 이를 3으로 나눈 나머지
					arr[i][j] = ' ';
				}
			}
		}
		
		return pattern(n/3, temp);
	}
}
