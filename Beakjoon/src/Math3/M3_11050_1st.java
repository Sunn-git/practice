package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M3_11050_1st { // 이항계수. 왜 런타임 에러가 나지?
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = factorial(n) / (factorial(n-k)* factorial(k));
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int factorial(int i) {
		int facto = i--;
		while(i > 0) {
			facto *= i--;
		}
		return facto;		
	}
}

