package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_10757_1st { // 큰 수 A+B 완료. 연속으로 합이 십의자리수를 넘기는 경우에 대한 처리가 제대로 돼있지 않아서 한번 틀림.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		int length = (a.length() > b.length())? a.length() : b.length();
		int[] sum = new int[length];
		
		sb.append("%").append(length).append("s");
		a = String.format(sb.toString(), a);
		b = String.format(sb.toString(), b);
		
		for(int i = length-1; i >= 0; i--) {
			int A =(a.charAt(i) != ' ')?  a.charAt(i) - '0' : 0;
			int B =(b.charAt(i) != ' ')?  b.charAt(i) - '0' : 0;
			
			if(A+B+sum[i] >= 10 && i > 0) {
				sum[i-1] += (A+B+sum[i]) / 10; // 이걸 먼저 설정해주지 않으면 sum[i]값이 바뀌어서 결과가 제대로 나오지 않는다.
				sum[i] = (A+B+sum[i]) % 10;
				continue;
			}
			
			sum[i] += A+B;
		}
		
		sb.setLength(0);
		for(int i : sum) {
			sb.append(i);
		}
				
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();	
	}
}


