package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class R_14956_2nd { // Philosopher’s Walk 진행중
	public static StringBuffer sb = new StringBuffer();
	public static int[] rotation = new int[2];
	public static int[][] move = {{0,0}, {0,1}, {1,1}, {1,0}};
//	public static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // size
		int m = Integer.parseInt(st.nextToken()); // meter
		
		int k = 0;
		while(1 << k != n) {
			k++;
		}
		
		int[] result = recursive(--m, k);
		
		System.out.println(result[0]+ " " +result[1]);

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static int[] recursive(int m, int k) {
		if(k == 1) {
			if(m == 0) return new int[]{1,1};
			if(m == 1) return new int[]{1,2};
			if(m == 2) return new int[]{2,2};
			if(m == 3) return new int[]{2,1};
		}
		
		int p2 = 1 << k;
		int square = m / (1<<(2*k-2));
		int[] location = recursive(m - square*(1<<(2*k-2)), k-1);
		
		if(square == 0) return new int[] {location[1], location[0]};
		if(square == 1) return new int[] {location[0], location[0]+p2/2};
		if(square == 2) return new int[] {location[0]+p2/2, location[1]+p2/2};
		return new int[] {p2+1-location[1], p2+1-location[0]};

	}
}

/*





*/
