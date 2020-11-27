package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2_9020_1st { // 골드바흐의 추측

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(br.readLine());
		int n; //, temp;
		int[] arr = new int[10001];
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < arr.length; i++) { // 에라토스테네스의 체
			for(int j = i+i; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
//			temp = 0;
			
//			if(arr[n/2] > 0) { // 짝수 n이 같은 소수를 더해 만들어진 경우
//				temp = n/2;
//				
//			}else { // 짝수 n이 서로 다른  소수를 더해 만들어진 경우
//				for(int j = n/2; j > 1; j--) { // n/2보다 작은 소수를 찾아가기
//					if(arr[j] > 0 && arr[n-j] > 0) { //j 가 소수면서 n-j도 소수인 경우 찾기
//						temp = j;
//						break;
//					}
//				}
//			}
//			sb.append(temp).append(" ").append(n-temp).append("\n");
			
			// 위의 if문을 나누지 않아도 된다. 속도는 똑같음
			for(int j = n/2; j > 1; j--) {
				if(arr[j] > 0 && arr[n-j] > 0) {
					sb.append(j).append(" ").append(n-j).append("\n");
					break;
				}
			}			
		}
	
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}

/*
 * 4	6	  8		10	  12	14	  16	18	  20 
 * 
 * 2	3	3(4)5	5	5(6)7	7	5(8)11	9	9(10)11
 * 
 */