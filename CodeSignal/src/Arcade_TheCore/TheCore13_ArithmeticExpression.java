package Arcade_TheCore;

public class TheCore13_ArithmeticExpression {
	public static void main(String[] args) {
		TheCore13_ArithmeticExpression thisClass = new TheCore13_ArithmeticExpression();
		
//		int answer = thisClass.largestNumber(8);
//		System.out.println(answer);
	}
	
	boolean arithmeticExpression(int a, int b, int c) {
	    return (a+b == c) || (a-b == c) || (a*b == c) || (a/b == c && a%b == 0);
	}

//	mssk's solution
	boolean arithmeticExpression_others(int A, int B, int C) {
	    return A+B==C || A-B==C || A*B==C || A == B*C;
	    //나누어 떨어지는 조건을 더하는 것 보다 A == B*C 조건이 더 간단하다
	}


	
	
}

/*


*/