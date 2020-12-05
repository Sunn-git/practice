package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BF_7568_1st { // 덩치
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			int k = 1;
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) k++;
			}
			
			sb.append(k);
			if(i < n-1) sb.append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}
