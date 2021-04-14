package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S_18870_1st { // 좌표 압축 시간초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			arr[i] = value;
			
			if(!list.contains(value)) {	
				if(i == 0) list.add(value);
				
				for(int j = list.size()-1; j >= 0 ; j--) {
					if(list.get(j) < value) {
						list.add(j+1, value);
						break;
					}
					
					if(i > 0 && j == 0) {
						list.add(0, value);
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = list.indexOf(arr[i]);
		}
		
		for(int i : arr) {
//			System.out.printf("%d ", i);
			sb.append(i).append(" ");
		}
//		System.out.println();
//		
//		System.out.println(list);


		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
