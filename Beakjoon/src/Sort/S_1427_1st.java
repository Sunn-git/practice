package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class S_1427_1st { // 소트인사이드
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		String s = br.readLine();
		int[] arr = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
		Arrays.sort(arr);
		
		for(int i = arr.length-1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		
		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
