package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_1002_2nd { // 터렛 (두 점의 교점을 구하는 문제 https://canna90.tistory.com/15)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][3];
		
		double d;
		int r, R;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < arr[0].length; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			r = Math.min(arr[0][2], arr[1][2]);
			R = Math.max(arr[0][2], arr[1][2]);
			
			d = Math.sqrt(		// 두 점 사이의 거리를 완전 잘못 계산하고 있었음.. 예제는 어떻게 통과했지
					Math.pow(
							Math.abs(arr[0][0]-arr[1][0]), 2)
				  + Math.pow(
						    Math.abs(arr[0][1] - arr[1][1]), 2)  );
			
			if(d == 0 && r == R) { // 류재명이 있을 수 있는 위치의 개수가 무한대일 경우 
								   // == 두 원이 일치하는 경우
				sb.append(-1).append("\n");
				
			}else if(d == R+r || d == R-r) {
				sb.append(1).append("\n");
				
			}else if(d > R+r || d < R-r || d == 0) {
				sb.append(0).append("\n");
				
			}else if(R-r < d && d < R+r){
				sb.append(2).append("\n");
			}
			
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
