package Watermelon;

import java.util.Scanner;

public class Watermelon_2nd { //(26.78ms, 79.9MB)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer = "";
		
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n/2; i++) {
			answer += "수박";
		}
		
		if(n % 2 != 0) answer += "수";
		
		System.out.println(answer);
	}
}
