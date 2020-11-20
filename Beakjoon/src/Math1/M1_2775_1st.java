package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1_2775_1st { // 부녀회장이 될테야
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		int k, n;
		
		for(int i = 0; i < t; i++) {
			k = Integer.parseInt(br.readLine()); // 층
			n = Integer.parseInt(br.readLine()); // 호
					
			bw.write(String.valueOf(capacity(k, n)+"\n"));		
		}
				
		bw.flush();
		
		br.close();
		bw.close();	
	}
	
	private static int capacity(int k, int n) {
		if(k == 0) return n;
		if(n == 1) return 1;
		
		return capacity(k, n-1) + capacity(k-1, n);
	}
}


/*

	0층부터 시작
	0층 i호에는 i명이 산다. 1 2 3 4 5 ...n
	
	k층 n호에 사는 인원수를 구하기 위해서는 k-1층 1부터 n호까지 사는 사람들의 수가 필요함
	
	3	1	(1+ 1+ 1+2) (1+ 1+ 1+2+ 1+ 1+2+ 1+2+3) 
	2	1	(1+ 1+2) 	(1+ 1+2+ 1+2+3) (1+ 3+ 6+ 10) (1+ 3+ 6+ 10+ 15) >> n호 : 1부터 n까지, 각 수 까지의 합
	1	1	(1+2)	 		(1+2+3)		(1+2+3+4) 	  (1+2+3+4+5) >> n호 : 1부터 n까지의 합
	0	1	 2				3			4			5 ... n >> n호 : n명
  
  	k층 n호의 인원 = k층 n-1호의 인원 + k-1층 n호의 인원
  	1층 n호의 인원은 시그마n 
  	어떤 층이던 1호의 인원은 무조건 1
  	
 */

