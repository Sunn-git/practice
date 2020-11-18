package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1_2839_1st { // 설탕 배달
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int answer = 5000;
		
		for(int i = 0; i * 5 <= n; i++) {
			for(int j = 0; j * 3 <= n; j++) {
				if(5*i+3*j == n) {
//					System.out.printf("i : %d, j : %d?\n", i, j);
					if(i+j < answer) answer = i+j;
				}
			}
		}
		
		answer = (answer == 5000) ? -1 : answer;
		
		bw.write(String.valueOf(answer));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
