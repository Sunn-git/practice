package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.TreeSet;

public class M3_2981_2nd { // 검문  16%에서 시간초과.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int gap = arr[1] - arr[0];
		int maxM = 0;
		
		for(int i = 1; i <= arr.length-1; i++) {
			maxM = euclidean(gap, arr[i]-arr[i-1]);
//			System.out.println("maxM : " + maxM);
		}
		
		int[] m = new int[maxM+1];
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		for(int i = 2; i <= maxM; i++) {
			for(int j = i; j <= maxM; j += i) {
				if(m[j] == -1) continue;
				if(maxM % j == 0) {
					tree.add(j);
					m[j] = -1;
				}
			}
		}
		
		for(int i : tree) {
			sb.append(i).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int euclidean(int a, int b) { 
		int r = a % b;
		if(r == 0) return b;
		return euclidean(b, r);
	}
}
