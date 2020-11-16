package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_1316_1st { // 그룹 단어 체커
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String s = "";
		int cnt = 0;
		
		
		loop : for(int i = 0; i < n; i++) {
			s = br.readLine();
			
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				
				if(j < s.length()-1 && s.charAt(j+1) != c) {
					if(s.substring(j+1).contains(String.valueOf(c)))
						continue loop;
				}
			} // j for end
			
			cnt++;			
		}
		
		bw.write(String.valueOf(cnt));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
