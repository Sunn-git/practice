package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class O_15904_3rd { // 완료
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		String input = br.readLine();
		String abbr = "UCPC";

//		이렇게 input 길이를 줄여도 메모리와 시간이 더 증가한다. 의미없음 
//		input = input.replaceAll("[^UCP]", "");
		
		int idx = 0;
		for(int i = 0; i < input.length(); i++) {
			if(idx > abbr.length()-1) break;
			
			
//			이부분 있는경우 메모리 +92KB 시간 -8ms
			char c = input.charAt(i);
			if(!(c == 'U' || c == 'C' || c == 'P')) continue;
			
			c = abbr.charAt(idx);
			
			if(input.charAt(i) == c) idx++;
		}
		
//		System.out.println(idx);
		
		sb.append("I ")
		  .append(idx < abbr.length()? "hate" : "love")
		  .append(" UCPC");
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}

/*
1st에서 UUCUCCCPPU는 hate가 나와야 하는데 love가 나왔다.
C가 여러개 있어서 contains로 찾으면 안된다.





*/
