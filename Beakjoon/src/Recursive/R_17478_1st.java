package Recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R_17478_1st { // 재귀함수가 뭔가요?
	public static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursive(n, "\n");
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void recursive(int n, String add) {
		sb.append(add).append("\"재귀함수가 뭔가요?\"");

		if(n == 0) {
			sb.append(add).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
		}else {
			sb.append(add).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.")
			.append(add).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.")
			.append(add).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			
			recursive(n-1, add.concat("____"));	
		}
		
		sb.append(add).append("라고 답변하였지.");
	}
}

/*





*/
