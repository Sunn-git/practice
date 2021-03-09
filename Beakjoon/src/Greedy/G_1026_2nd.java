package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G_1026_2nd { // 보물
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()), sum = 0, idx = 0;
		int[] A = new int[n], B = new int[n], multi = new int[101];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			B[i] = Integer.parseInt(st.nextToken());
			multi[B[i]] = B[i];
		}
		
		Arrays.sort(A);
		
		for(int i = 100; i >= 0 && idx < n; i--) {
			if(multi[i] > 0) {
				sum += A[idx++]*multi[i];
			}
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
B를 정렬하지 않고 풀어보기

 */
