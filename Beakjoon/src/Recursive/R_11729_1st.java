package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_11729_1st {  // 하노이 탑 이동 순서. 
//								https://st-lab.tistory.com/96 블로그 도움받음
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int)Math.pow(2, n) -1).append("\n");
		hanoi(n, 1, 2, 3, sb);
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	private static void hanoi(int n, int from, int mid, int to, StringBuffer sb) {
		if(n == 1) {
			sb.append(from).append(" ").append(to).append("\n");
			return;
		}
		
		hanoi(n-1, from, to, mid, sb); // n-1개의 탑을 from에서 mid로 옮기기

		sb.append(from).append(" ").append(to).append("\n"); // n번쨰 원반을 1에서 3으로 옮기기
		
		hanoi(n-1, mid, from, to, sb); // n-1개의 탑을 mid에서 to로 옮기기
	}
	// 이런식으로 재귀함수를 만드는건 전혀 생각을 못하고 계속 규칙만 찾으려 했었다.
	//	나름대로 규칙을 찾았었는데 도저히 표현을 못하겠었음..
}


/*

하노이의 탑 n개를 옮기는 이동횟수는 n-1개를 옮기는 이동횟수 * 2 + 1 이다.

1개 : 1 3 >> 1
2개 : 1 2 / 1 3 / 2 3  >> 3
3개 : 1 3 / 1 2 / 3 2 / 1 3 / 2 1 / 2 3 / 1 3 >> 7
4개 : 3개를 2로 옮기기 : 7 + 4를 3으로 옮기기 : 1 + 3개를 3으로 옮기기 : 7 = 15
     1 2 / 1개를 2로
      1 3 / 2 3 / 2개를 3으로
       1 2 / 3 1 / 3 2 / 1 2 / 3개를 2로
        1 3 / 2 3 / 2 1 / 3 1 / 2 3 / 1 2 / 1 3 / 2 3 4개를 3으로  

*/