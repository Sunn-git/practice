package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_11729_3rd {  // 하노이 탑 이동 순서. 다시 풀어보기
	public static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//2의 n승을 비트연산자를 사용해 이렇게 표현할 수 있었다...정말 깔끔하다
		sb.append((1<<n)-1).append("\n");
		
		hanoi(1, 3, n);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	//중간지점을 파라미터로 주지 않아도 된다.
	static void hanoi(int start, int end, int n) {
//		if(n == 1) {
//			sb.append(start).append(" ").append(end).append("\n");
//			return;
//		}
		
//		 함수를 덜 호출하는 쪽이 효율이 좋을거라고 생각했는데 이 쪽이 
//		시간도 메모리도 훨씬 덜 잡아먹는다.
		if(n == 0) return;
		
		//6은 각 기둥 번호의 합이다. (1+2+3)
		hanoi(start, 6-start-end, n-1);
		
		sb.append(start).append(" ").append(end).append("\n");
		
		hanoi(6-start-end, end, n-1);
		
	}
}


/*
https://www.youtube.com/watch?v=8vDDJm5EewM


*/