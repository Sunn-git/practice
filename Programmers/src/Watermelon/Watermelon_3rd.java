package Watermelon;

import java.util.Scanner;

public class Watermelon_3rd { //(47.30ms, 115MB)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer = "";
		
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n/2; i++) { //반복횟수가 늘어나서 더 오래걸린 것 같다.
			switch ( i%2 ) {
			case 1: answer += "수";
				break;
			case 0: answer += "수박";
				break;
			}
		}

		
		
		System.out.println(answer);
	}
}
