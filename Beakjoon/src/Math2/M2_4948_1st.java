package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2_4948_1st { // 베르트랑 공준 ( 시간초과 ) 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int cnt;
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			cnt = 0;
			if(n == 0) break;
			
			loop : for(int i = n+1; i <= 2*n; i++) {
				for(int j = 2; j < i; j++) {
					if(i == 2 || i == 3) break;
					if(i % j == 0) continue loop;
				}
				cnt++;
			}
			sb.append(cnt).append("\n");
		}
	
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
