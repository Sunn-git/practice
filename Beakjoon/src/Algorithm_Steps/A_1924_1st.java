package Algorithm_Steps;

import java.util.Scanner;

public class A_1924_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int days = 0;
		String result = "";
		
		for(int i = 1; i < a; i++) {
			switch (i) {
			case 1: case 3: case 5: case 7: 
			case 8: case 10: case 12: days += 1;

			case 4: case 6: case 9: case 11: days += 2;
			
			case 2: days += 28;
			}
		}
		
		days += b;
		
		switch (days % 7) {
		case 1: result = "MON";
			break;

		case 2: result = "TUE";
			break;
			
		case 3: result = "WED";
			break;
			
		case 4: result = "THU";
			break;
			
		case 5: result = "FRI";
			break;
			
		case 6: result = "SAT";
			break;
			
		case 0: result = "SUN";
			break;
		}
		
		System.out.println(result);
	}
}
