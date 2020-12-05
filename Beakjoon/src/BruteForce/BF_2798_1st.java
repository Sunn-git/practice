package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BF_2798_1st { // 블랙잭
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] s = br.readLine().split(" ");
		
		int sum = 0;
		String[] answer = new String[3];
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s.length; j++) {
				if(i == j) break;
				
				for(int k = 0; k < s.length; k++) {
					if(i == k) break;
					if(j == k) break;
					
					int temp = Integer.parseInt(s[i])
							 + Integer.parseInt(s[j])
							 + Integer.parseInt(s[k]);
					
					if(temp <= m && temp >= sum) {
						sum = temp;
					}
				}
			}
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
