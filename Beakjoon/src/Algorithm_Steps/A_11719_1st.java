package Algorithm_Steps;

import java.util.Scanner;

public class A_11719_1st { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		while(s.length() > 10) {			
			System.out.println(s.substring(0, 10));
			s = s.substring(10);
		}
		System.out.println(s);
	}
}
