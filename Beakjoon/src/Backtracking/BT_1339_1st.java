package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BT_1339_1st { // 단어 수학 실패(런타임에러)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		int mIdx = -1;
		
		for(int i = 0; i < n; i++) {
			arr[i] = new StringBuilder(br.readLine()).reverse().toString();
			if(arr[i].length()-1 > mIdx) mIdx = arr[i].length()-1;
		}
		
		boolean[] check = new boolean[26];
		char[] value = new char[26];
		char num = '9';
		
		for(int i = mIdx; i >= 0; i--) {
			for(int j = 0; j < n; j++) {
				if(arr[j].matches("\\d*")) break;
				
				if(arr[j].length()-1 >= i) {
					int idx = arr[j].charAt(i)-'A';
					if(!check[idx]) {
						check[idx] = true;
						value[idx] = num;
						arr[j] = arr[j].replace(arr[j].charAt(i), num--);						
					}else {
						arr[j] = arr[j].replace(arr[j].charAt(i), value[idx]);						
					}
				}
			}
		}
		
		int sum = 0;

		for(String s : arr) {
			sum += Integer.parseInt(
							new StringBuilder(s).reverse().toString());
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}
}


/*
 
 처음에 문제를 잘못 생각해서 엉뚱한 풀이법을 생각했다.
 가장 길이가 긴 단어의 알파벳들에 숫자를 먼저 할당해주면 다고 생각했는데 아니었음.
 
 자리수가 큰 순서로 먼저 할당해야했다.
 
 이것도 아님. 이렇게 하면 가장 많이 나타난 수가 제일 커야하는 반례를 통과 못한다.
 
 10
ABB
BB
BB
BB
BB
BB
BB
BB
BB
BB

 */
