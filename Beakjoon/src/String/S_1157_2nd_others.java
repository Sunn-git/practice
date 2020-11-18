package String;

import java.util.Scanner;

public class S_1157_2nd_others { // 단어 공부 다른 사람의 답
	public static void main(String[] args) {
		String s = new Scanner(System.in).next().toUpperCase();
		char R = 0;
		int[] T = new int[26];
		int M = 0;
		for (int i=0; i<s.length(); i++) {
			int a = ++T[s.charAt(i)-65];
			
			if (a == M)R = 63;
			else if (a>M) {
				M = a;
				R = s.charAt(i);
			}
		}
		System.out.println(R);
	}
}
