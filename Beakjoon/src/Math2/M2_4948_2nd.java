package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2_4948_2nd { // 베르트랑 공준 ( 에라토스테네스의 체 ) 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int cnt;
		int[] arr = new int[(123456*2)+1];
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] == 0) continue;
			
			for(int j = i+i; j < arr.length; j += i) { // 에라토스테네스의 체
				arr[j] = 0;
			}
		}
		
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			cnt = 0;
			if(n == 0) break;
			
			for(int i = n+1; i <= 2*n; i++) {
				if(arr[i] != 0) cnt++;
			}
			sb.append(cnt).append("\n");
		}
	
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
