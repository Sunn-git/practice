package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_12852_1st { // 1로 만들기 2
	public static StringBuffer sb = new StringBuffer();
	public static int[] pre;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] d = new int[n+1];
		pre = new int[n+1];
		
		d[1] = 0;
		pre[1] = 0;
		
		for(int i = 2; i <= n; i++) {
			if(i < 4) {
				d[i] = 1;
				pre[i] = 1;
				continue;
			}
			
			d[i] = d[i-1]+1;
			pre[i] = i-1;
			
			if(i % 2 == 0 && d[i/2]+1 < d[i]) {
				d[i] = d[i/2]+1;
				pre[i] = i/2;
			}
			
			if(i % 3 == 0 && d[i/3]+1 < d[i]) {
				d[i] = d[i/3]+1;
				pre[i] = i/3;
			}
		}
		
//		for(int i : pre) {
//			System.out.printf("%d ", i);
//		}
//		System.out.println();
		
		sb.append(d[n]).append("\n");
		
		printRoute(n);

		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void printRoute(int i) {
		if(i == 0) return;
		
		sb.append(i).append(" ");
		printRoute(pre[i]);
	}
}


/*

경로를 역추적하려면 내 값이 어디서 온 것인지 저장한 후 나중에 따로 경로를 복원하면 된다.
BFS에서 경로를 복원할때도 마찬가지이다 !

 */
