package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S_1181_1st { // 단어 정렬
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.parallelSort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) return o1.compareTo(o2);	
				
				return (o1.length() > o2.length()) ? 1 : -1;				
			}
		});
		
		for(int i = 0; i < n; i++) {
			if(i > 0 && arr[i].equals(arr[i-1])) continue;
			sb.append(arr[i]).append("\n");
		}
		
		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
