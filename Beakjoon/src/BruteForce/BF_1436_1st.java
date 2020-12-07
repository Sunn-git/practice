package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BF_1436_1st { // 영화감독 숌
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		
		for(i = 666; n > 0; i++) {
			String s = Integer.toString(i);
			if(s.contains("666")) n--;
		}
		
		i--;

		bw.write(Integer.toString(i));
		bw.flush();
		br.close();
		bw.close();
	}
}
