package Arcade;

import java.util.Stack;

public class Intro13_reverseInParentheses_2nd { // 여전히 마지막 테스트케이스만 통과 못하는 상태
	public static void main(String[] args) {
//		String inputString = "foo(bar(baz))blim";
//		String inputString = "foo(bar)baz(blim)";
		String inputString = "a(bcdefghijkl(mno)p)q";
//		String inputString = "co(de(fight)s)";
		
		int startI = 0;
		int endI = 0;
		String temp = "";
		
		while(inputString.contains("(")) {
			startI = inputString.lastIndexOf('(');
			endI = inputString.indexOf(')');
			if(startI > endI) startI = inputString.indexOf('(');
			
			Stack<String> stack = new Stack<String>();
			for(int i = startI+1; i < endI; i++) {
				stack.add(String.valueOf(inputString.charAt(i)));
			}
			
			while(!stack.isEmpty()) {
				temp = temp.concat(stack.pop());
			}
			
//			System.out.println(temp);
			
			inputString = inputString.substring(0, startI)
									 .concat(temp)
									 .concat(inputString.substring(endI+1));

//	    	System.out.println(inputString);
	    	temp = "";
		}
		
    	System.out.println(inputString);
	}
}
