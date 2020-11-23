package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_2581_1st { // 소수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = 0;
		
		for(int i = m; i < n+1; i++) {
			
			if(i == 2) {
				if(sum == 0) min = i;
				sum += i;	
			}
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) break;
				
				if(j+1 == i) {
					if(sum == 0) min = i;
					sum += i;	
				}
			}
		}
		
		if(sum != 0) {
			sb.append(sum).append("\n").append(min);			
		}else {
			sb.append(-1);
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
