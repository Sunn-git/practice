package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_1712_2nd { // 손익분기점
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int n = (b < c) ? (a / (c-b))+1  : -1;
		
		bw.write(String.valueOf(n)); // 여기서 +1 하면 틀림.. 이거 때문에 계속 틀렸다
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
