package Algorithm_Steps;

import java.util.Scanner;

public class A_10953_1st {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		String[] arr = new String[2];

		for(int i = 0; i < t; i++) {
			arr = sc.nextLine().split(",", 2);	
			System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
		}
	}
}
