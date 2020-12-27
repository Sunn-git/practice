package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M3_11051_2nd { // 이항계수 2. 왜 런타임에러가 나지?
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] cntDiv = new int[n+1];
		
		for(int i = 2; i < cntDiv.length; i++) { // n! 소인수분해 (이부분을 함수로 바꿀 수 있을 것 같다.)
			int temp = i;
			
			for(int j = 2; j <= i; j++) {
				if(temp % j == 0) {
					cntDiv[j]++;
					temp /= j--;
				}
				
				if(temp == 1)break;
			}
		}
		
//		System.out.println("======================");
//		for(int i = 1; i < cntDiv.length; i++) {
//			if(cntDiv[i] != 0) {
//				System.out.printf("%d : %d\n", i, cntDiv[i]);
//			}
//		}
		
		for(int i = 2; i <= k; i++) { //k! 소인수분해 후 나누기
			int temp = i;
			for(int j = 2; j <= i; j++) {
				if(temp % j == 0) {
					cntDiv[j]--;
					temp /= j--;
				}
				
				if(temp == 1) break;
			}
		}

		for(int i = 2; i <= n-k; i++) { //(n-k)! 소인수분해 후 나누기
			int temp = i;
			for(int j = 2; j <= i; j++) {
				if(temp % j == 0) {
					cntDiv[j]--;
					temp /= j--;
				}

				if(temp == 1) break;
			}
		}
		
//		System.out.println("======================");
		double result = 1;
		for(int i = 1; i < cntDiv.length; i++) { // 소인수분해 한 숫자들을 곱해서 합치기
			if(cntDiv[i] != 0) {
//				System.out.printf("%d : %d\n", i, cntDiv[i]);
				result *= Math.pow(i, cntDiv[i]);
			}
		}
		
		result %= 10007;
		
		bw.write(String.valueOf(Math.round(result)));
		bw.flush();
		bw.close();
		br.close();
	}
}

