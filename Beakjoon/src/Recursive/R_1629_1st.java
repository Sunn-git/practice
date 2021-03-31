package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class R_1629_1st { // 곱셈
//	public static BigInteger a, c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger a = BigInteger.valueOf(Long.parseLong(st.nextToken()));
//		a = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		long b = Long.parseLong(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		c = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		BigInteger c = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		
//		String result = pow(b).toString();
		String result = pow(a, b, c).toString();
		
		bw.write(result);
		bw.flush();
		
		br.close();
		bw.close();
	}
	
//	private static BigInteger pow(int b) {
//		/*a b c 모두 int의 최대크기까지가 범위이므로 연산중에 a가 int와 long의 범위를 벗어날 수 있다.
//		  따라서 BigInteger로 계산하는 것이 안전하다.
//		 c는 계산상 편의를 위해 BigInteger로 설정.
//		*/
//		
//		if(b == 1) return a.mod(c);
//		BigInteger val = pow(b/2);
//		val = val.multiply(val).mod(c);
//		
//		
//		if(b % 2 == 0) return val; // b가 짝수일 때
//		return val.multiply(a).mod(c); // b가 홀수일 때
//	}
	
	private static BigInteger pow(BigInteger a, long b, BigInteger m) {
		/*a b c 모두 int의 최대크기까지가 범위이므로 연산중에 a가 int와 long의 범위를 벗어날 수 있다.
		  따라서 BigInteger로 계산하는 것이 안전하다.
		 c는 계산상 편의를 위해 BigInteger로 설정.
		 이 함수의 시간복잡도는 O(log b)이다.
		*/
		
		if(b == 1) return a.mod(m);
		BigInteger val = pow(a, b/2, m);
		val = val.multiply(val).mod(m);
		
		
		if(b % 2 == 0) return val; // b가 짝수일 때
		return val.multiply(a).mod(m); // b가 홀수일 때
	}
}

/*
 * 
 * https://www.youtube.com/watch?v=8vDDJm5EewM
 * static변수를 사용하지 않고 함수의 파라미터로 가지고다니는 쪽이
 * 코드 길이는 약간 더 길지만(+30B) 시간 (-4ms)과 메모리(-304KB)를 약간 덜 사용했다.
 * 
 */
