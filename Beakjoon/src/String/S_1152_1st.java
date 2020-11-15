package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_1152_1st { // 단어의 개수
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		String[] arr = s.split(" ");
		
		int n = 0;
		
		for(String st : arr) {
			if(!st.equals("")) n++;
		}
		
		bw.write(String.valueOf(n));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
