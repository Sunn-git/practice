package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_9095_1st { // 1, 2, 3 더하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr= new int[11];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i = 4; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3]; 
		}
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 index 1, 2, 3을 먼저 할당하기 위해 배열의 크기를 n+4로 설정한다.
 for문은 n까지만 돌려서 메모리낭비를 방지한다.
 ============= 윗 내용은 입력값 n에 대한 값만 찾을 경우 ===============
 알고리즘만 짜고 입출력 형식을 맞추지 않아서 한번 틀림
 
 입출력 형식을 맞추고 효율성을 높이기 위해 아예 입력받기 전에 계산을 다 끝내도록 수정.


 */
