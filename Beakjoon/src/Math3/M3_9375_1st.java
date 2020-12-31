package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class M3_9375_1st { // 패션왕 신해빈
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int k = Integer.parseInt(br.readLine());
		int n;
		String[][] clothes;
		
		for(int i = 0; i < k; i++) {
			n = Integer.parseInt(br.readLine());
			clothes = new String[n][2];
			
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				clothes[j][0] = st.nextToken();
				clothes[j][1] = st.nextToken();
			}
			
			int answer = 1;
			
			HashMap<String, Integer> closet = new HashMap<String, Integer>();
			
			for(int j = 0; j < clothes.length; j++) {
				if(closet.containsKey(clothes[j][1])) {
					closet.put(clothes[j][1], closet.get(clothes[j][1])+1);	
				}else {
					closet.put(clothes[j][1], 1);	
				}
			}
			
			Object[] keys = closet.keySet().toArray();
			
			for(Object o : keys) {
				answer *= (closet.get(o)+1);
			}

			sb.append(--answer).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
