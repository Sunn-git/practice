package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_1149_2nd { // RGB거리 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine()), answer = 0;
		int[][] cost = new int[n+1][3],
				d = new int[n+1][3];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
		d[1][0] = cost[1][0];
		d[1][1] = cost[1][1];
		d[1][2] = cost[1][2];

		for(int i = 2; i <= n; i++) {
			d[i][0] = Math.min(d[i-1][1], d[i-1][2])+cost[i][0];
			d[i][1] = Math.min(d[i-1][0], d[i-1][2])+cost[i][1];
			d[i][2] = Math.min(d[i-1][1], d[i-1][0])+cost[i][2];
			
			if(i == n) {
				answer = Math.min(Math.min(d[n][0], d[n][1]), d[n][2]);
			}
		}
		
		bw.write(Integer.toString(answer));
		bw.flush();
		br.close();
		bw.close();
	}
}


/*

테이블 정의하기 : i번째에 R0 G1 B2 색의 집을 칠하는 최소비용
	d[i][0] = Math.min(d[i-1][1], d[i-1][2])+cost[i][0];
	d[i][1] = Math.min(d[i-1][0], d[i-1][2])+cost[i][1];
	d[i][2] = Math.min(d[i-1][1], d[i-1][0])+cost[i][2];


 */
