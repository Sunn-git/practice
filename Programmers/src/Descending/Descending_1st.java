package Descending;

import java.util.ArrayList;

public class Descending_1st { //(7.64ms, 52.4MB)

	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		String answer = "";
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(char c : s.toCharArray()) {
			arr.add((int)c);
		}
		
		arr.sort(null);
		
		for(int i = arr.size()-1; i >= 0; i--) {
			answer += String.valueOf(Character.toChars(arr.get(i)));
		}

		System.out.println(answer);
	}

}
