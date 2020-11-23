package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_1929_2nd { // 소수 구하기 에라토스테네스의 체를 사용하면 시간 내에 통과됨

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		
		for(int i = 2; i <= n; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i <= n; i++) { // m부터 시작해서 틀렸음. 2부터 시작해줘야한다 !
			if(arr[i] == 0) continue;
			
			for(int j = i+i; j <= n; j += i) {
				arr[j] = 0;
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(arr[i] != 0) sb.append(i).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
