package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.TreeSet;

public class M3_2981_3rd { // 검문  25%에서 틀림
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
		
		for(int i = 1; i < arr.length; i++) {
//			maxM = euclidean(gap, arr[i]-arr[i-1]);
			int gap2 = arr[i]-arr[i-1]; // a>b 조건 때문에 틀린줄 알았는데 아니었음..
			maxM = (gap >= gap2)?
					euclidean(gap, gap2) : euclidean(gap2, gap);
//			System.out.println("maxM : " + maxM);
		}
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		for(int i = 2; i*i <= maxM; i++) {
			if(maxM % i == 0) {
				tree.add(i);
				tree.add(maxM / i);
			}
		}
		tree.add(maxM);

		
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
