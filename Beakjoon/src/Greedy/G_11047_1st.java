package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class G_11047_1st { // 동전 0	시간초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()),
			k = Integer.parseInt(st.nextToken()),
			coinCnt = 0, idx = 0;
		int[] coins = new int[n];
		
		while(k > 0) {
			for(int i = 0; i < n; i++) {
				if(coins[i] == 0) coins[i] = Integer.parseInt(br.readLine());
				
				if(coins[i] < k) idx = i;
				if(coins[i] > k) break;
			}
			
			coinCnt += k / coins[idx];
			k %= coins[idx];
			
			n = idx;
		}
		
		bw.write(Integer.toString(coinCnt));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
제일 큰 동전부터 차례대로 소모하는 풀이법.
시간초과가 나온다.

동전이 1, 9, 10 인 경우 18원을 만들 때
9짜리 2개를 쓰는 방법이 최선이지만
내가 짠 코드대로 풀면 10짜리 1개 1짜리 8개가 나와서 9개가 된다.

 */
