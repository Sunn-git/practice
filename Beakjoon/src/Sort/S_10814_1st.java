package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S_10814_1st { // 나이순 정렬 진행중
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
				if(arg0[0].equals(arg1[0])) { // 틀린 이유가 equals가 아니었다.
					String a1 = arg0[1].substring(arg0[1].indexOf(" "));
					String a2 = arg1[1].substring(arg1[1].indexOf(" "));
					return a1.compareTo(a2);
				}
				return arg0[0].compareTo(arg1[0]);
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
