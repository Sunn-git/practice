package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_2839_1st { // 설탕 배달 작성중
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		
		while(n >= 3) {
			if(n % 5 == 0 || n / 5 > 0) {
				answer += n/5;	
				n -= (n/5)*5;
			} else if(n % 3 == 0 || n / 3 > 0) {
				answer += n/3;
				n -= (n/3)*3;
			} else {
				break;
			}
		}
		
		
//		System.out.println(answer);
//		System.out.println(n);
		if(n != 0) answer = -1;
		
		bw.write(String.valueOf(answer));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
