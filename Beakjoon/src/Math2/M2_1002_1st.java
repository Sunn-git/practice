package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M2_1002_1st { // 터렛 진행중 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < arr[0].length; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			
			
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
