package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BT_1759_1st { // 암호 만들기
	static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	static int vCnt = 0;
	static int nonVCnt = 0;
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		char[] cArr = br.readLine().replace(" ", "").toCharArray();
		Arrays.sort(cArr);
		
		for(char ch : cArr) {
			System.out.printf("%s ", ch);
		}
		System.out.println();
		
		
		dfs(cArr, l, 0, "");
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(char[] cArr, int l, int start, String password) {
		if(password.length() == l) {
			if(vCnt >= 1 && nonVCnt >= 2) sb.append(password).append("\n");
			return;
		}
		
		for(int i = start; i < cArr.length; i++) {
			int temp1 = vCnt;
			int temp2 = nonVCnt;
			for(int j = 0; j < vowels.length; j++) {
				if(cArr[i] == vowels[j]) {
					vCnt++;
					break;
				}
				if(j == vowels.length-1) nonVCnt++;
			}
			
			dfs(cArr, l, i+1, password+cArr[i]);
			vCnt = temp1;
			nonVCnt = temp2;
		}
		
	}

}


/*
 
 

 */
