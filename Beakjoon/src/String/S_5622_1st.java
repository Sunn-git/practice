package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_5622_1st { // 다이얼
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int time = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			switch (c) {
			case 'Z': case 'Y': case 'X': case 'W': time++;
				
			case 'V': case 'U': case 'T': time++;
				
			case 'S': case 'R': case 'Q': case 'P': time++;
				
			case 'O': case 'N': case 'M': time++;
			
			case 'L': case 'K': case 'J': time++;
			
			case 'I': case 'H': case 'G': time++;
			
			case 'F': case 'E': case 'D': time++;
			
			case 'C': case 'B': case 'A': time++;

			default: time += 2;
				break;
			}
		}
		
		bw.write(Integer.toString(time));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
