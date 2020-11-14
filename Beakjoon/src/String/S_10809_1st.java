package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S_10809_1st { // 알파벳 찾기
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int[] temp = new int[26];
		String s = br.readLine();
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = s.indexOf(i+97); 
			// indexOf는 해당하는 값이 없으면 -1, 있으면 가장 처음 만나는 index를 리턴
//		}
		
//		이건 필요 없었음.
//		for(int i = 0; i < temp.length; i++) {
//			temp[i] = -1;
//		}
		
//		for(int i = 0; i < s.length(); i++) {
//			temp[s.charAt(i)-97] = s.indexOf(s.charAt(i));
//		}
		
//		for(int i = 0; i < temp.length; i++) {
			sb.append(temp[i]);
			
			if(i == temp.length-1) break;
			sb.append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
