package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_10809_2nd { // 알파벳 찾기
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		String s = br.readLine();
		
		for(int i = 0; i < 26; i++) {
			sb.append(s.indexOf(i+97));
			
			if(i == 25) break;
			sb.append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
