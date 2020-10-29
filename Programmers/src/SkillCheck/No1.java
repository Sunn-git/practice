package SkillCheck;

import java.util.Arrays;

public class No1 {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;

		String[] answer = new String[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		
		Arrays.sort(strings);
		
		for(int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].substring(1);
		}
		
		
		
		for(String s : answer) {
			System.out.printf("%s ", s);
		}
	}

}
