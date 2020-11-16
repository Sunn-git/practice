package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_2941_1st { // 크로아티아 알파벳
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			cnt++;
			
			switch (c) {
				
			case 'd': if(i < s.length()-2) {
						if(s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') {
							i += 2;
						}
					  }
				
					  if(i < s.length()-1) {
						if(s.charAt(i+1) == '-') i += 1;
					  }
				break;
				
			case 'l':
			case 'n': if(i < s.length()-1) {
						if(s.charAt(i+1) == 'j') i += 1;
					  }
				break;
				
			case 'c': if(i < s.length()-1) {
						if(s.charAt(i+1) == '-') {
							i += 1;
							continue;
						}
					}
			case 's':
			case 'z': if(i < s.length()-1) {
						if(s.charAt(i+1) == '=') i += 1;
					  }
				break;
				
			} // switch end
		} // for end
		
		bw.write(Integer.toString(cnt));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
