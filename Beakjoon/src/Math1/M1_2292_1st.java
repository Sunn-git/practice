package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1_2292_1st { // 벌집
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int temp = 1;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(temp >= n) {
				answer = i;
				break;
			}
			
			temp += i * 6;
		}
		
		bw.write(String.valueOf(answer));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}


/*
 * 0(6*0) 1-6(6*1) 7-18(6*2) 19-36(6*3) 37-60(6*4) 61-		
 * 1 / 2-7(6) / 8-19(12) / 20-37(18) / 38-61(24) / 62-
 * 1	2		 3			 4			 5			 6   
 */