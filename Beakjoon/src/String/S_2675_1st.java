package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S_2675_1st { // 문자열 반복
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					sb.append(s.charAt(j));					
				}
			}
			sb.append("\n");	
		}
		
		bw.write(sb.toString());		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
