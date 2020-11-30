package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_2447_1st { // 별 찍기 - 10 재귀를 어떻게 사용해야 할지 잘 몰랐다.
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String s;
		
		for(int i = 0; i < n; i++) {
			s = "";
			for(int j = 0; j < n; j++) {
//				s += (i % 3 == 1 && j % 3 == 1) ? " " : "*";
				s += (i >= n/3 && i < n/3*2 && j >= n/3 && j < n/3*2) 
				? " " : ((i % 9 >= 3 && i % 9 < 6) && (j % 9 >= 3 && j % 9 < 6))
					? " " : ((i % 3 > 0 && i % 3 < 2) && (j % 3 > 0 && j % 3 < 2))
								? " " : "*";
			}
			
			System.out.println(s);
		}
		
//		bw.write("");
//		bw.flush();
		
		br.close();
		bw.close();
	}
}
