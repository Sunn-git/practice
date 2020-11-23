package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_1978_1st { // 소수 찾기 132ms로 체를 만들어 쓰는 것과 속도 동일(소수를 전부 다 구하는게 아니라서 그런듯)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int length = st.countTokens();
		int answer = 0;
		
		for(int i = 0; i < length; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 2) answer++; // 2를 소수로 세지 않았기 때문에 틀렸었음.
			
			for(int j = 2; j < num; j++) {
				if(num % j == 0) break;
				if(j == num-1) answer++;	
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
