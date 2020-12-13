package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S_11650_2nd_others { // 좌표 정렬하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		long[] xy = new long[N];
		long tot = 1000000; 
		long check = 100000; // -100,000 ≤ 좌표의 범위 ≤ 100,000
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long x = Integer.parseInt(st.nextToken()) + check;
			long y = Integer.parseInt(st.nextToken()) + check;
			xy[i] = (x * tot + y); // x와 y를 자리수로 분류해주기
		}
		
		Arrays.sort(xy); // x가 앞에 있기 때문에 x를 먼저 비교하고 같으면 y로 비교해서 정렬하게 됨
		
		for(int i=0; i<N; i++) {
			sb.append(String.valueOf((xy[i] / tot) - check) //x
				+" " + String.valueOf((xy[i] % tot) - check)).append("\n");
		}													//y
		
		System.out.print(sb);

		br.close();
	}
}
