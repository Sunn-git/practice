package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_1712_1st { // 손익분기점.. 시간초과
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] arr = br.readLine().split(" ", 3);
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		

//		long a = Integer.parseInt(arr[0]);
//		long b = Integer.parseInt(arr[1]);
//		long c = Integer.parseInt(arr[2]);
//		
		long n = -1;
		
		long cost = 0;
		long sales = 0;

		if(b < c) {
			while(sales <= cost) {
				n++;
				
				cost = a + b*n;
				sales = c*n;
			}
			
		}
		
		
//		a + (b - c)*n <0
//		1000 + 1000*n - n
//		손익분기점이 존재하지 않는 경우?? 개당 생산비용이 노트북 가격보다  같거나 비쌀때? !!!
//		1000 < 999 * n;
		
		
		bw.write(String.valueOf(n));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
