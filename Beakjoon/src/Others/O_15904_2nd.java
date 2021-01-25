package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class O_15904_2nd { // 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		String input = br.readLine();
		
		input = input.replaceAll("[^UCP]", "")
				// 반례 : UCCPC 보완 >> 10퍼 넘기기도 전에 틀림
				.replaceAll("[U]+", "U")
				.replaceAll("[C]+", "C")
				.replaceAll("[P]+", "P");
		
		System.out.println(input);

		sb.append("I ")
		  .append((input.contains("UCPC")? "love" : "hate"))
		  .append(" UCPC");
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}

/*



*/
