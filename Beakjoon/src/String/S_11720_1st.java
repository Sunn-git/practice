package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_11720_1st { // 숫자의 합
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		
		int answer = 0;
		
		for(int i = 0; i < num.length(); i++) {
			answer += (num.charAt(i) - '0');
		}
		
		bw.write(String.valueOf(answer));
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}
