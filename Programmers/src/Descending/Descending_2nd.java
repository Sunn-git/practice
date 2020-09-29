package Descending;

import java.util.Arrays;

public class Descending_2nd { //(27.36ms, 53.3MB) 어째선지 이게 훨씬 더 오래걸린다..

	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		String answer = "";
		
		char[] ch = s.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i = ch.length-1; i >= 0; i--) {
			answer += ch[i];
		}
		
		System.out.println(answer);
	}

}
