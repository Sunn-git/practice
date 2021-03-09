package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class G_2217_1st { // 로프
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] w = new int[n];
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			w[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(w);
		
		for(int i = n-1; i >= 0; i--) {
			if(w[i]*(n-i) > max) max = w[i]*(n-i);
		}

		bw.write(Integer.toString(max));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
 		for(int i = n-1; i >= 0; i--) {
			if(w[i]*(n-i) > max) max = w[i]*(n-i);
		}
		
		위 for문에 else break; 때문에 처음에 틀림.
		작은값들의 합이 큰 수 하나보다 커지는 경우가 있기 때문에 break가 들어가면 틀린다.
		
반례
8
10
3
3
3
3
3
3
3


 */
