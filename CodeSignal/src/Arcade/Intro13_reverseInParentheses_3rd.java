package Arcade;

import java.util.Stack;

public class Intro13_reverseInParentheses_3rd { //통과됨 >> 블로그 참고 (https://greenhelix.tistory.com/28)
	public static void main(String[] args) {
//		String inputString = "foo(bar(baz))blim";
//		String inputString = "foo(bar)baz(blim)";
		String inputString = "a(bcdefghijkl(mno)p)q";
//		String inputString = "co(de(fight)s)";
		
    	System.out.println(f(inputString));
	}
	
	static String f(String inputString) {
		//재귀함수 종료 조건
		if(!inputString.contains("(")) return inputString;
		
		int startI = 0;
		int endI = 0;
		String temp = "";
		
		//가장 안쪽의 ()의 인덱스를 찾는 for문
		for(int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) == '(') {
				startI = i;
				continue;
			}
			
			if(inputString.charAt(i) == ')') {
				endI = i;
				break;
			}
		}
		
		//stack을 이용해서 거꾸로 뒤집어주기
		Stack<String> stack = new Stack<String>();
		for(int i = startI+1; i < endI; i++) {
			stack.add(String.valueOf(inputString.charAt(i)));
		}
		
		while(!stack.isEmpty()) {
			temp = temp.concat(stack.pop());
		}
		
		//가장 안쪽의 ()가 처리된 문장을 재귀함수로 다시 처리하기
		return f(inputString.substring(0, startI)
				 + temp
				 + inputString.substring(endI+1));
	}
	
}

/*
 
 내 코드에서 문제가 생길 수 있었던 부분은 while문 혹은 index를 찾는 부분.
 블로그에서 본 대로 for문으로 인덱스를 찾고 재귀함수로 실행하니 바로 통과됨.
 이거랑 똑같은 문제를 다른 코딩테스트에서 봤던 것 같다. 아마도 네이버? 확실하지 않음
 
 */
