package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_12865_3rd { // 평범한 배낭
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()),
			k = Integer.parseInt(st.nextToken());
		int[] w = new int[n+1], 
			  v = new int[n+1];
		int[][] dp = new int[k+1][n+1];
		
		for(int i = 1; i <= n; i++) { // 여기를 1로 바꿔주고 i < n 인채로 둬서 틀렸던 거 ㅠㅠㅠㅠㅠ
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken()); 
			v[i] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= n; j++) {
				if(i >= w[j]) { // j번째 짐을 담을 수 있는 경우
					dp[i][j] = Math.max(dp[i][j-1], //j-1번째 짐 까지 담았을때의 가치
										dp[i-w[j]][j-1]+v[j]);
									//	j번째 짐을 담을 수 있는 k와 n의 dp값에 j번째 짐의 가치를 추가
				}
				
				else { // j번째 짐을 담을 수 없는 경우 >> 이 부분때문에 틀렸다고 생각했는데 여전히 틀렸다.
//					이부분 때문에 틀리기도 했음 이부분 없으면 틀렸다고 나옴 ㅠ
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		
//		for(int[] a : dp) {
//			for(int i : a) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();
//		}
		
		bw.write(Integer.toString(dp[k][n]));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*

이 문제는 DP문제였다.
https://st-lab.tistory.com/141
구현부분 안보고 설명보고 이해해서 짜본 코드 >> 틀림

틀린 원인
1. 입력 범위 오류 >> i < n 로 잘못 설정
2. dp를 채우는 이중for문에서 if(i >= w[j]) 조건에 해당하지 않는 값을 처리하지 않음.


 */
