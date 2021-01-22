package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class O_2864_1st {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		sb.append(min(a)+min(b)).append(" ").append(max(a)+max(b));
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	public static int min(String s) {
		if(s.contains("6")) s = s.replace('6', '5');
		return Integer.parseInt(s);
	}
	
	public static int max(String s) {
		if(s.contains("5")) s = s.replace('5', '6');
		return Integer.parseInt(s);
	}
}

/*

최소값 : 모든 6을 5로 바꾼 값
최대값 : 모든 5를 6으로 바꾼 값

*/
