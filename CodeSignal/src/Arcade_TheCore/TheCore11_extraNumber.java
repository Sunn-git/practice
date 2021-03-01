package Arcade_TheCore;

public class TheCore11_extraNumber {
	public static void main(String[] args) {
		TheCore11_extraNumber thisClass = new TheCore11_extraNumber();
		
		System.out.println(15 & 15);
		System.out.println(1 | 1);
		System.out.println(15 ^ 6 ^ 15);
		
//		int answer = thisClass.largestNumber(8);
//		System.out.println(answer);
	}
	
	int extraNumber(int a, int b, int c) {
	    return a ^ b ^ c;
	}	
}

/*

비트 연산자
&: 두 비트 모두 1일 경우에만 연산 결과가 1
|: 두 비트 중 하나라도 1일 경우에 연산 결과가 1
^: 두 비트가 서로 다른 경우에만 연산 결과가 1
~: 비트 반전


*/