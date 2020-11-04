package OneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ODA_4344_1st {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n, m, temp;
		double over, avg, sum;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());

		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			sum = 0;
			
			int[] arr = new int[m];
			
			for(int j = 0; j < m; j++) {
				temp = Integer.parseInt(st.nextToken());
				arr[j] = temp;
				sum += temp;
			}
			
			avg = sum/m;
			over = 0;
			
			Arrays.sort(arr);
			
			for(int j = m-1; j >= 0; j--) {
				if(arr[j] <= avg) break;
				++over;
			}
			
			bw.write(String.format("%.3f%%\n", over/m*100));
		}
		
		bw.flush();
	}

}
