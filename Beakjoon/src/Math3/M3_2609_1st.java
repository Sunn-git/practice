package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M3_2609_1st { // 최대공약수와 최소공배수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
	
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int GCF = (a > b)? euclidean(a, b) : euclidean(b, a);
		int LCM = a*b/GCF;
		
		sb.append(GCF).append("\n").append(LCM).append("\n");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int euclidean(int a, int b) { // a, b 크기비교는 밖에서 해야한다
		int r = a % b;
		if(r == 0) return b;
		return euclidean(b, r);
	}
}
