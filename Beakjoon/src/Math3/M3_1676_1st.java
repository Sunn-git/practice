package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M3_1676_1st { // 팩토리얼 0의 개수 진행중
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		System.out.println(factorial(500));
		
//		sb.append(factorial(500));
		
//		bw.write(sb.toString());
//		bw.flush();
		bw.close();
		br.close();
	}
	
	public static double factorial(int n) {
		if(n == 1 || n == 0) return 1;
		return n * factorial(n-1);
	}
}

/*
 * 2 5 = 10
 * 4 5 = 20
 * 6 5 = 30
 * 8 5 = 40
 * 
 * 
 * 
 */