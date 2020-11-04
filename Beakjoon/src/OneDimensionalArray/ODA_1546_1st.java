package OneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ODA_1546_1st {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n, temp, max = 0;
		double sum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			temp= Integer.parseInt(st.nextToken());
			max = (temp > max) ? temp : max;
			sum += temp;
		}
		
		bw.write(Double.toString((sum/max)*100/n));
		
		bw.flush();
	}

}
