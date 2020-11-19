package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1_2292_2nd_others { // 벌집
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int answer = 1;
		
		while(n > 1) {
			n -= 6 * answer++; // 변수를 새로 만들어서 기존 값이랑 비교하는게 아니라
							   // 아예 기존 값을 변화시키는 편이 코드가 간결해진다.
		}
		
		bw.write(String.valueOf(answer));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
