package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class O_15885_1st {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int result = (int)Math.abs(2*(a-b)/b);
		// (a/b-1)*2ㅣ 로 하면 틀림 7 2의 인풋일 때 5가 나와야 하는데 4가 나옴
		// https://burningjeong.tistory.com/122 참고
		
		bw.write(Integer.toString(result));
		bw.flush();
		
		br.close();
		bw.close();
	}
}

/*

시침 한바퀴(12시간)마다 a/b-1회 만난다는 규칙은 찾았는데
분침, 초침도 완벽하게 일치한다는 확신이 없어서 헤맸다.

*/
