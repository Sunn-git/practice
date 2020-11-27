package Math2;

import java.util.Scanner;

public class M2_3009_2nd_others { // 네 번째 점 (비트연산자를 이용한 풀이)
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		int i=0,x=0,y=0;
		
		for(; i++<3; x^=s.nextInt(), y^=s.nextInt());
		
		/*
		 * 비트연산자는 같으면 0을 반환하기 때문에 
		 * 하나의 숫자만 다른 경우  0^다른숫자 가 되므로
		 * 다른 숫자가 return 된다. 대단...
		 * 하나만 다른 숫자를 찾아야 하는 경우 비트연산자 사용하기 !!
		 * 
		 * for문을 이렇게 쓸 수 있다는 것도 처음 알았다..
		 */
		
		System.out.print(x+" "+y);
		
	
	}
}
