package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class G_13305_1st {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[] distance = new int[n-1];
		int[] price = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n-1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		long min = price[0];
		long total = 0;
		
		for(int i = 0; i < distance.length; i++) {
			if(price[i] < min) min = price[i];
			total += distance[i]*min;
		}

		bw.write(String.valueOf(total));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
 아예 입력값을 받는 배열을 long으로 만들어줘도 됐었다.
 거리를 먼저 받고 가격을 받을 때 바로 계산해줬어도 된다.

 */
