package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_11726_2nd { // 2xn 타일링
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] d = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			if(i < 3) {
				d[i] = i;
				continue;
			}
			d[i] = (d[i-1]+d[i-2]) % 10007;
		}
		
		
		bw.write(Integer.toString(d[n]));
		bw.flush();
		br.close();
		bw.close();
	}
}


/*

d[i] = (d[i-1]+d[i-2]) % 10007;
long으로 설정해줘도 범위를 벗어내기 때문에
 애초에 나머지를 배열에 저장해야한다.
 
 나머지끼리 더해서 나눠도 원래 수에서 나눈 나머지와 값은 동일하다

 */
