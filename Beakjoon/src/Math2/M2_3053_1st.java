package Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2_3053_1st { // 택시 기하학 
					//택시 기하학에서의 반지름이 R인 원의 넓이란, “두 대각선의 길이가 2R인 마름모의 넓이”

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		double r = Double.parseDouble(br.readLine());
		
		sb.append(String.format("%.6f", (Math.PI * r * r))) // 원의 넓이는 파이*r제곱..
			.append("\n").append(String.format("%.6f", (r*r*2)));
		
		System.out.println((9999*9999*2));
		System.out.println(r*r*2);
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
