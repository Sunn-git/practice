package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S_10814_2nd { // 나이순 정렬 완료. 코드가 길고 실행시간도 오래걸린다.
						   // 다른사람 풀이 공부하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		String[][] users = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			users[i][0] = st.nextToken();
			users[i][1] = st.nextToken()
							.concat(" ").concat(Integer.toString(i));
		}
		
		Arrays.sort(users, new Comparator<String[]>() {
			@Override
			public int compare(String[] arg0, String[] arg1) {
				int a, b;
				if(arg0[0].equals(arg1[0])) { // 틀린 이유가 equals가 아니었다.					
					a = Integer.parseInt(arg0[1].substring(arg0[1].indexOf(" ")+1));
					b = Integer.parseInt(arg1[1].substring(arg1[1].indexOf(" ")+1));
//					System.out.printf("a:%d  b:%d  a>b:", a, b);
//					System.out.println(a>b);
					
					return (a > b)? 1 : -1; 
					// 문자열인 숫자를 비교할 때는 compareTo를 사용하면 원하는 결과가 나오지 않는다.
				}
				
				a = Integer.parseInt(arg0[0]); // 뒷 인덱스
				b = Integer.parseInt(arg1[0]); // 앞 인덱스
//				System.out.printf("a:%d  b:%d  a>b:", a, b);
//				System.out.println(a>b);
				
				return (a > b)? 1 : -1;
			}
		});
		
		for(String[] s: users) {
			sb.append(s[0]).append(" ")
				.append(s[1].substring(0, s[1].indexOf(" "))).append("\n");
		}

		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
