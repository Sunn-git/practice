package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class G_11047_2nd { // 동전 0
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()),
			k = Integer.parseInt(st.nextToken()),
			coinCnt = 0;
		int[] coins = new int[n];
		
		for(int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = n-1; i >= 0; i--) {
			if(k < coins[i]) continue;
			
			coinCnt += k/coins[i];
			k %= coins[i];
			
			if(k == 0) break;
		}
		
		bw.write(Integer.toString(coinCnt));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
뒤쪽부터 내려오면 되는걸 왜 그렇게 복잡하게 생각했지?
이 풀이로 문제 통과는 되지만
여전히 1 9 10 으로 18원 만드는 풀이는 풀지 못한다.
 
 

 */
