package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_1149_3rd { // RGB거리 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine()), 
			answer = 0, r, g, b;
		int[][] d = new int[n+1][3];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			r = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			d[i][0] = r + (i == 1? 0 : Math.min(d[i-1][1], d[i-1][2]));
			d[i][1] = g + (i == 1? 0 : Math.min(d[i-1][0], d[i-1][2]));
			d[i][2] = b + (i == 1? 0 : Math.min(d[i-1][1], d[i-1][0]));
			
			
			if(i == n) answer = Math.min(Math.min(d[n][0], d[n][1]), d[n][2]);
		}
		
		bw.write(Integer.toString(answer));
		bw.flush();
		br.close();
		bw.close();
	}
}


/*

집을 칠하는 비용을 굳이 배열로 저장할 필요가 없었다.
코드 정리 ( 집 칠하는 비용 배열 말고 int에 넣기, if문에 반복되는 코드 삼항연산자로 정리)
시간 +4ms, 메모리 +80KB 코드길이 -137B

 */
