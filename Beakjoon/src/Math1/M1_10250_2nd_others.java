package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_10250_2nd_others { // ACM 호텔
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(br.readLine());
		
		int h, n, temp;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			h = Integer.parseInt(st.nextToken());
			st.nextToken();
			n = Integer.parseInt(st.nextToken());
			
			temp = (n%h == 0) ? h : n%h;
			n = n/h + ((n%h == 0) ? 0 : 1);
			
			sb.append(temp).append(String.format("%02d\n", n));

		}
		
		bw.write(sb.toString());		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}


/*

  %02d 의 의미
 % -  명령의시작
 0 - 채워질 문자
 2 - 총 자리수
 d - 십진정수
  
 */