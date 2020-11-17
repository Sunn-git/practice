package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_1712_1st { // 손익분기점
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] arr = br.readLine().split(" ", 3);
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		
		
//		총 생산 비용 = arr[0] + arr[1]*n대
//		총 가격 = arr[2]*n대
		int n = 0;
		
		long cost = a + b*n;
		long sales = c*n;
		
		while(sales <= cost) {
			n++;
		}
		
		System.out.println(n);
		
//		bw.write(Integer.toString(n));		
//		bw.flush();
		
		br.close();
		bw.close();	
	}
}
