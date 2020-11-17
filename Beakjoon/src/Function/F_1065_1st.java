package Function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class F_1065_1st { // 한수

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n;
		int cnt = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		if(n < 100) {
			cnt = n;
			
		} else {
			cnt = 99;
			
			for(int i = 100; i <= n; i++) {
				String s = Integer.toString(i);
				char temp = s.charAt(0);
				
				loop : for(int j = -4; j < 5; j++) {
					for(int k = 1; k < s.length(); k++) {
						if(temp != s.charAt(k)-(k*j)) break; 
						
						if(k == s.length()-1)  {
							cnt++;
							break loop;
						}
					}
				}
					
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
	}
}


// 1000�� �Ѽ��� �ƴ�

// 111(1~9) 123(1~7) 135(1~5) 147(1~3) 159(1) : 4�̻��� ���̴� ���� �� ����

// 1 ~ 99 �� ������ �Ѽ�