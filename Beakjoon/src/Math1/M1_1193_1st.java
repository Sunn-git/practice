package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1_1193_1st { // 분수 찾기
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();

		int n = Integer.parseInt(br.readLine());
		int a = 1;
		
		while(n > a) {
			n -= a++;
		}
		
//		System.out.println(n); // 해당 줄의 몇번째 숫자인지 알아내기 
//		System.out.println(a); // 몇번째 줄인지 알아내기 
		
//		순서가 지그재그 !!! (a가 홀수면 거꾸로 짝수면 순서대로)
		
		if(a % 2 == 0) {
			sb.append(n).append("/").append(a+1 -n);			
		}else {
			sb.append(a+1 -n).append("/").append(n);
		}
		
		bw.write(sb.toString());		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}


/*

  1/1 	1
  1/2 2/1	2 
  1/3 2/2 3/1	3 
  1/4 2/3 3/2 4/1	4
  1/5 2/4 3/3 4/2 5/1	5
  
  
 */