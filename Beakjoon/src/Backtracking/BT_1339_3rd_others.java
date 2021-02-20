package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BT_1339_3rd_others { // 다른사람의 풀이 https://www.acmicpc.net/source/24039765
	public static void main(String[] args) throws IOException {
		int[] coeff = new int[26]; 	// 알파벳의 계수 저장 
		int sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			int len = input.length();
			for(int j = 0; j < len; j++) {
				int alphabet = (int)(input.charAt(j)-65);			 
				coeff[alphabet] += (int) Math.pow(10, len-1-j);
			}
			
		}
		
		Arrays.sort(coeff);
		
		int i = 25, num = 9;
		while(coeff[i]!=0) {
			sum += coeff[i] * num;
			i--;
			num--;	
		}
		System.out.print(sum);
	}
}


/*

맞지맞지.. 굳이 queue를 사용하지 않더라도
Arrays.sort 해서 뒤에서부터 곱해줘도 되는건데

 */
