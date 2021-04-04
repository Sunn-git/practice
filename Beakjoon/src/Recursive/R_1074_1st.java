package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class R_1074_1st { // Z
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
	
		int result = z(n, r, c);
		
		bw.write(Integer.toString(result));
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	// 2^n x 2^n 배열에서 (r, c)를 방문하는 순서를 반환한는 함수
	public static int z(int n, int r, int c) {
		if(n == 0) return 0;
		
		//비트연산자로 2의^(n-1) 구하기
		int half = 1<<(n-1);
		
		//첫번째 사각형일 때
		if(r < half && c < half) return z(n-1, r, c);
		//두번째 사각형일때
		if(r < half && c >= half) return half*half + z(n-1, r, c-half);
		//세번째 사각형일 때
		if(r >= half && c < half) return half*half*2 + z(n-1, r-half, c);
		//네번째 사각형일 때
		return half*half*3 + z(n-1, r-half, c-half);
	}

}

/*
https://www.youtube.com/watch?v=8vDDJm5EewM
*/
