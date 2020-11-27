package Math2;

import java.util.Scanner;

public class M2_4948_3rd_others { // 베르트랑 공준 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(); // 먼저 입력값을 설정해주고
		
		while(a != 0) { // 종료 조건
			int i, j, x=0;
			
			for(i = 2*a; i > a; i--) {
				for(j = 2; j <= Math.sqrt(i); j++) { // 루트값 까지만 나눠줘도 된다
					if(i%j == 0) break;
				}
				if(Math.sqrt(i) < j) x++;
			}
			System.out.println(x);
			
			a = s.nextInt(); // 입력값을 다시 받는다
		}
		
	}
}
 