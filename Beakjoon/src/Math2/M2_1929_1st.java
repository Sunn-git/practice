package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_1929_1st { // 소수 구하기 (시간초과)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i = m; i <= n; i++) {
			if(i == 2) sb.append(i).append("\n"); 
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) break;
				
				if(j+1 == i) sb.append(i).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
