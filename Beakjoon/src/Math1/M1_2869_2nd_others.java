package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_2869_2nd_others { // 달팽이는 올라가고 싶다
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int days = (v-b-1)/(a-b)+1;
//		https://www.acmicpc.net/board/view/53443
		
		bw.write(String.valueOf(days));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}


/*


  
  
 */