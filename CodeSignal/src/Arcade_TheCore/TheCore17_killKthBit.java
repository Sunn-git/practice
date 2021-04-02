package Arcade_TheCore;

public class TheCore17_killKthBit {
	public static void main(String[] args) {
		TheCore17_killKthBit thisClass = new TheCore17_killKthBit();
		
//		int answer = thisClass.largestNumber(8);
//		System.out.println(answer);
		
		
//		1	1		1 1
//		2	2		0
//		3	4		1 4
//		4	8		0
//		5	16		0
//		6	32		1 32
		
		
		System.out.println(37 & ~(1 << (3)));
		
	}
	
	
//	블로그 도움 받음 
//	https://wachino.github.io/codefights/codefights-arcade/codefights-arcade-thecore/17_killKthBit/README.html
	int killKthBit(int n, int k) { 		  
		return n & ~(1 << (k-1));
	}


	
	
}

/*

비트연산자를 활용하는 문제 !

return ...; 라고 되어있고 주어진 코드를 바꾸지 말라고 하길래
...부분을 남겨놔야 하는 줄 알았는데
반대로 ...이외의 부분을 남기고 ...부분에 코드를 작성해야 했다.

1을 k-1만큼 왼쪽으로 이동(<<)시키고 반전(~)시킨다 : 오른쪽에서 k번째만 빼고 모두 1인 상태
n과 &연산을 한다 : n의 이진수와 비교하여 둘 다 1인 부분에만 1을 적용시킨다. 오른쪽에서 k번째는 자연히 0이 됨.

*/