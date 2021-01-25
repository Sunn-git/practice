package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class O_15904_1st { // 30퍼센트에서 계속 틀림. 반례 UUCUCCCPPU : hate가 답
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		String input = br.readLine();
		String abbr = "UCPC";
		
		if(input.length() == 0) input = "*"; // 이게 문제가 아니었음
		
		for(int i = 0; i < abbr.length(); i++) {
			String s = String.valueOf(abbr.charAt(i));
			if(input.contains(s)) {
				input = input.replaceFirst(s, "");
				continue;
			}
			input = "*";
			break;
		}
		
		sb.append("I ")
		  .append((input.equals("*")? "hate" : "love"))
		  .append(" UCPC");
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}

/*



*/
