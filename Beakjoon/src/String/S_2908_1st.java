package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S_2908_1st { // 상수
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = null;
		
		int length = st.countTokens(); //countTokens는 고정된 값이 아니다.
		int[] arr = new int[length];
		
		
		for(int i = 0; i < length; i++) {
			sb = new StringBuffer(st.nextToken()).reverse();
			arr[i] = Integer.parseInt(sb.toString());
		}
		
		int n = (arr[0] > arr[1]) ? arr[0] : arr[1];
		
		bw.write(Integer.toString(n));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
