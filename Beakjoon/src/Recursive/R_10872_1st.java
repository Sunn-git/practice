package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_10872_1st {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		bw.write(Integer.toString(factorial(n)));
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	private static int factorial(int n) {
		if(n <= 1) return 1; // 0! == 1 이다...
		
		return n * factorial(n-1);
	}
}
