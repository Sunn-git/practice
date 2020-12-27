package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M3_11051_1st { // 이항계수 2. 왜 런타임에러가 나지?
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = (factorial(n) / (factorial(n-k)* factorial(k))) % 10007;
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int factorial(int i) {
		if(i == 1 || i == 0) return 1;
		return i * factorial(i-1);
	}
}

