package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BF_2231_1st { // 분해합
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int min = n;
		
		for(int i = 0; i < n; i++) {
			int m = i;
			int sum = m;
			
			while(m > 0) {
				sum += (m % 10);
				m /= 10;
			}
			
			if(sum == n) {
				if(i < min) min = i;
			}	
		}
		
		if(min == n) min = 0;
		
		bw.write(Integer.toString(min));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
