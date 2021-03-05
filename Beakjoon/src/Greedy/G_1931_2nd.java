package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class G_1931_2nd { // 회의실 배정
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[][] meeting = new int[n][2];
//		String[][] m = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
			
//			m[i] = br.readLine().split(" ");
			
		}
		
		
		bw.write(Integer.toString(0));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 


 */
