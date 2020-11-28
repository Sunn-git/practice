package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M2_4153_1st { // 직각삼각형 (숫자가 오름차순으로 주어지는 경우에만 작동)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			if(a == 0) break;
			
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
						
			sb.append((Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2))
						? "right" : "wrong").append("\n");
			
			st = new StringTokenizer(br.readLine());
		}

		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
