package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M3_1037_1st { // 약수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());
		int[] divisors = new int[cnt];
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		for(int i = 0; i < cnt; i++) {
			divisors[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(divisors);
		
		bw.write(Integer.toString(divisors[0]*divisors[cnt-1]));
		bw.flush();
		bw.close();
		br.close();
	}
}
