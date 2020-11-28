package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M2_4153_2nd { // 직각삼각형 (숫자 순서 상관없이 나와도 작동)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		
		loop : while(st.hasMoreTokens()) {
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i] == 0) break loop;
				
				arr[i] *= arr[i];
			}
			
			Arrays.sort(arr); 
			// (a*a+b*b==c*c)||((a*a+c*c==b*b)||(a*a==b*b+c*c)
			// 이런식으로 모든 경우의 수를 명시해주면 정렬하지 않아도 된다.
							
			bw.write(((arr[0]+arr[1] == arr[2])
							? "right" : "wrong").concat("\n"));
			
			st = new StringTokenizer(br.readLine());
		}

		bw.flush();
		
		br.close();
		bw.close();
	}
}