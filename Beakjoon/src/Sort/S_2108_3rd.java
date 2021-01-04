package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class S_2108_3rd { // 통계학 완료 !!!!!!!!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(br.readLine());
			sum += input[i];
		}
		
		Arrays.sort(input);
		int[] cnt = new int[n];
		int num = input[0]-1; // 최소값보다 작게
		int idx = 0;
		for(int i = 0; i < n; i++) {
			if(num != input[i]) {
				idx = i;
				num = input[i];
			}
			cnt[idx]++;
		}
		
//		for(int i : cnt) {
//			System.out.printf("%d, ", i);
//		}
//		System.out.println();
		
		int max = Integer.MIN_VALUE; //최대 반복 횟수 구하기
		for(int i : cnt) {
			if(i > max) max = i;
		}
		
		//최빈값 구하기: 숫자를 인덱스로 지정하지 않고(음수때문) 인덱스를 지표로 사용
		ArrayList<Integer> freq = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) { 
			if(cnt[i] == max) freq.add(input[i]);
		}
		
		int freqNum = (freq.size() == 1)? freq.get(0) : freq.get(1);
		
		sb.append(Math.round(sum/n)).append("\n")
			.append(input[n/2]).append("\n") //은 홀수
			.append(freqNum).append("\n")
			.append(input[n-1]-input[0]);
		
		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
