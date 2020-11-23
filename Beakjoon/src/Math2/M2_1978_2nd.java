package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_1978_2nd { // 소수 찾기 (에라토스테네스의 체)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int length = st.countTokens();
		int answer = 0;
		
		int[] arr = new int[1001];
		for(int i = 2; i < 1001; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < 1001; i++) {
			if(arr[i] == 0) continue;
			for(int j = i+i; j < 1001; j += i) { // i의 배수(소수가 아닌 수)
				arr[j] = 0;
			}
		}
		
		for(int i = 0; i < length; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(arr[num] != 0) answer++;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
