package Algorithm_Steps;

import java.util.Scanner;

public class B_1463_1st { // 틀림. 스스로 해결 못함.
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int cnt = 0;

		while(x > 1) {
			
			if(x % 3 == 0) {
				x /= 3;
			}else if(x % 3 == 1) {
				x--;
			}else if(x % 2 == 0) {
				x /= 2;
			}else {
				x--;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
}

/*
 * 
 * 
 * 
 * 
 */