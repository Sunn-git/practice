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
		
		int h, n;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			h = Integer.parseInt(st.nextToken());
			st.nextToken();
			n = Integer.parseInt(st.nextToken());

			System.out.printf("%d%02d\n", (n%h>0) ? n%h:h, (n+h-1)/h);
		}
		
		bw.write(sb.toString());		
		bw.flush();
		
		br.close();
		bw.close();			
	}
}


/*

  (n+h-1)/h
  
 */