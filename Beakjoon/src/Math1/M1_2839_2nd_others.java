package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1_2839_2nd_others { // 설탕 배달
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int answer = -1; //for문에서 값이 변하지 않는 경우(나누어 떨어지지 않을 경우)의 기본값
		
		for(int i = 0; i <= n / 3; i++) { // 3kg짜리 포대를 최소한으로 넣기 위한 for문 설정
			if((n - i*3) % 5 == 0) { // n이 3의 배수와 5의 배수의 합인 경우만 구해주면 되기 때문에 이중 for문을 사용할 필요가 업다
									 // for문에서 3의 배수가 몇개인지 세주고 있기 때문에  5로 나누어 떨어지는지만 확인하면 된다
				answer = i + ((n - i*3) / 5); // 3kg 포대의 개수(i) + 5kg 포대의 개수 ((n - i*3) / 5)
			}
		}
		
		bw.write(String.valueOf(answer));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
