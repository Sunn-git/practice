package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class R_14956_3rd { // Philosopher’s Walk 완료.
	public static int[][] xy = {{1,1}, {1,2}, {2,2}, {2,1}};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // size
		int m = Integer.parseInt(st.nextToken()); // length

		int[] result = recursive(n, --m);
		sb.append(result[0]).append(" ").append(result[1]);

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static int[] recursive(int n, int m) {
		if(n == 2) return xy[m];
		
		int half = n/2, temp;
		int quadrant = m / (half*half);
		
		int[] location = recursive(half, m % (half*half));
		
		if(quadrant == 0) { // xy반전
			temp = location[0];
			location[0] = location[1];
			location[1] = temp;

		}else if(quadrant == 1) { // half만큼 y축 이동
			location[1] += half;
			
		}else if(quadrant == 2) { // half만큼 x축, y축 이동
			location[0] += half;
			location[1] += half;

		}else { // 시작점에서 거꾸로 이동(ex. 원좌표에서 y 증가하는 만큼 x 감소), 시작 좌표가 (1,1)이기 때문에 각각 1씩 더해줘야한다.
			temp = location[0];
			location[0] = n-location[1]+1;
			location[1] = half-temp+1;	
		}
		
		return location;
	}
}

/*

https://jaimemin.tistory.com/1085

우하단 사각형에서 좌표가 변하는 규칙을 찾기가 너무 힘들었다.
규칙을 찾긴 해도 그걸 어떻게 코드에 적용시켜야할지 몰라서 많이 헤맸다.
다행히 블로그를 참조한 덕에 문제 해결.
코드를 내 방식대로 조금 고쳐봤다.

*/
