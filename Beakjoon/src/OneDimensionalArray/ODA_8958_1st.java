package OneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ODA_8958_1st {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n, total, score;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			String answer = br.readLine();
			total = 0;
			score = 1;
			
			for(int j = 0; j < answer.length(); j++) {
				if(answer.charAt(j) != 'O') {
					score = 1;
					continue;
				}
				total += score++;
			}
			
			arr[i] = total;
		}
		
		for(int i : arr) {
			bw.write(Integer.toString(i)+"\n");
		}
		
		bw.flush();
	}

}
