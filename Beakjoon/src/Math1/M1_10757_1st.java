package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_10757_1st { // 큰 수 A+B 진행중.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		int lenght = (a.length() > b.length())? a.length() : b.length();
		int[] sum = new int[lenght];
		
		
		
				
		bw.write("");
		bw.flush();
		
		br.close();
		bw.close();	
	}
}


