package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M3_11050_2nd { // 이항계수. 왜 런타임 에러가 나지?
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
		if(i == 1 || i == 0) return 1;
		//팩토리얼 0 == 1 을 설정하지 않아서 런타임 에러가 발생한 것 같다. >> 진짜 이거 때문이었음 ..
		return i * factorial(i-1);
	}
}

