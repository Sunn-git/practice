package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_1002_2nd { // 터렛 진행중 (두 점의 교점을 구하는 문제)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][3];
		
		int d, r, R;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < arr[0].length; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			r = Math.min(arr[0][2], arr[1][2]);
			R = Math.max(arr[0][2], arr[1][2]);
			d = Math.abs(arr[0][0]-arr[1][0])+Math.abs(arr[0][1] - arr[1][1]);
			
			if(d == R+r || d == R-r) {
				sb.append(1).append("\n");
			}else if(d > R+r || d < R-r || d == 0) {
				sb.append(0).append("\n");
			}else {
				sb.append(2).append("\n");
			}
			
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
