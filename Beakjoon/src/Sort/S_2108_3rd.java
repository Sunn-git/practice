package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class S_2108_3rd { // 통계학 진행중.. 런타임 에러 이클립스에선 잘 실행되는데 왜지..
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(br.readLine());
			if(input[i]  > max) max = input[i];
			sb.append(input[i]);
		}
		

		
		
		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
