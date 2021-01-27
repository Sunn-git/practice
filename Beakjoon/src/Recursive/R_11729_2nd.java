package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_11729_2nd {  // 하노이 탑 이동 순서. 혼자서 풀어보기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int)(Math.pow(2, n)-1)).append("\n");
		hanoi(1, 2, 3, n);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	static StringBuffer sb = new StringBuffer();
	
	public static void hanoi(int start, int mid, int end, int n) {
		if(n == 1) {
			sb.append(start).append(" ").append(end).append("\n");
			return;
		}
		
		hanoi(start, end, mid, n-1);
		sb.append(start).append(" ").append(end).append("\n");
		hanoi(mid, start, end, n-1);
	}
	
}


/*
@@@@@@@@@ 하노이탑 재귀 문제풀이에서 제일 중요한 부분 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
하노이의 탑 n개를 옮기는 이동횟수는 n-1개를 옮기는 이동횟수 * 2 + 1 이다.
n-1 개를 중간지점으로 옮기는 이동횟수 + n번째 원을 종료지점으로 옮기는 이동횟수(1) + n-1개를 종료지점으로 옮기는 이동횟수
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

1개 : 1 3 >> 1
2개 : 1 2 / 1 3 / 2 3  >> 3
3개 : 1 3 / 1 2 / 3 2 / 1 3 / 2 1 / 2 3 / 1 3 >> 7
4개 : 3개를 2로 옮기기 : 7 + 4를 3으로 옮기기 : 1 + 3개를 3으로 옮기기 : 7 = 15
     1 2 / 1개를 2로
      1 3 / 2 3 / 2개를 3으로
       1 2 / 3 1 / 3 2 / 1 2 / 3개를 2로
        1 3 / 2 3 / 2 1 / 3 1 / 2 3 / 1 2 / 1 3 / 2 3 4개를 3으로  

*/