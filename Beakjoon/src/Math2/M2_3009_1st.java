package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M2_3009_1st { // 네 번째 점

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i = 0 ; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		for(int i = 0; i < 3; i++) {
			if(i+1 < 3 && x[i] == x[i+1]) {
				x[i] = -1;
				x[i+1] = -1;
			}
			
			if(i+1 < 3 && y[i] == y[i+1]) {
				y[i] = y[i+1] = -1;
			}
		}

		for(int i : x) {
			if(i != -1) sb.append(i).append(" ");
		}
		
		for(int i : y) {
			if(i != -1) sb.append(i);
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
