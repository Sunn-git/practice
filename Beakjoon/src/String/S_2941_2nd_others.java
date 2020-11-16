package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_2941_2nd_others { // 크로아티아 알파벳
								 // switch 문을 사용하는 것 보다 훨씬 간결하다
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int cnt = 0;
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String st : arr) {
			s = s.replaceAll(st, "R");
		}
		
		bw.write(Integer.toString(s.length()));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
