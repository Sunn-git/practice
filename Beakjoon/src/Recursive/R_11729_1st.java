package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_11729_1st { // 하노이 탑 이동 순서 진행중.. 이걸 재귀로?
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		
		
//		bw.write("");
//		bw.flush();
		
		br.close();
		bw.close();
	}
}


/*

하노이의 탑 n개를 옮기는 이동횟수는 n-1개를 옮기는 이동횟수 * 2 + 1 이다.

1개 :  1 3 >> 1
2개 : 1 2 / 1 3 / 2 3  >> 3
3개 : 1 3 / 1 2 / 3 2 / 1 3 / 2 1 / 2 3 / 1 3 >> 7
4개 : 1 3 / 1 2 / 3 2 / 1 3 / 1

*/