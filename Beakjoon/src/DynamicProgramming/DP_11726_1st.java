package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_11726_1st { // 2xn 타일링
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		long[] d = new long[n+1];
		
		for(int i = 1; i <= n; i++) {
			if(i < 3) {
				d[i] = i;
				continue;
			}
			d[i] = d[i-1]+d[i-2];
		}
		
		d[n] %= 10007;
		
		bw.write(String.valueOf(d[n]));
		bw.flush();
		br.close();
		bw.close();
	}
}


/*

테이블 정의 : d[i]는 2xi크기의 직사각형을 채우는 방법의 수

d[i] = d[i-1]+d[i-2];
스스로 점화식을 찾아내긴 했지만 때려맞춘 느낌이 강하다.

https://www.youtube.com/watch?v=5leTtB3PQu0
제일 왼쪽 맨 윗 캔을 채우는 경우의 수 2가지
세로타일 : d[n-1]가지
가로타일 : d[n-2]가지
따라서 d[i] = d[i-1]+d[i-2];


출력조건 제대로 안봐서 한번 틀림 
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
>> 자릿수 고려도 안했다. int 배열로 계산하면 범위를 넘긴다. >> 그래도 여전히 틀리는 상황


 */
