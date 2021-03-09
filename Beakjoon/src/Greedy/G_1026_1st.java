package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G_1026_1st { // 보물
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n], B = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		n = 0;
		
		for(int i = 0; i < A.length; i++) {
			n += A[i]*B[B.length-1-i];
		}
		
		bw.write(Integer.toString(n));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
 문제에서는 B를 정렬하지 말라고 나와있지만 
 답은 B의 순서와 전혀 상관없기 때문에 B도 정렬해도 된다고 한다.
 정렬하지 않는 방법을 고민했는데 괜한 고민이었다.

 */
