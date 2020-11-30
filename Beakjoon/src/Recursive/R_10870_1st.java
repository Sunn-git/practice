package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_10870_1st {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		bw.write(Integer.toString(fibonacci(n)));
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	private static int fibonacci(int n) {
		if(n <= 1) return n;
		
		return fibonacci(n-2) + fibonacci(n-1);
	}
}
