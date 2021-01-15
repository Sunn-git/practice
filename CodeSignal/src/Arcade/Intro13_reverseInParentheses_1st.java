package Arcade;

public class Intro13_reverseInParentheses_1st { 
	public static void main(String[] args) {
//		String inputString = "foo(bar(baz))blim";
		String inputString = "foo(bar)baz(blim)";
		int startI = 0;
		int endI = 0;
		StringBuffer temp = new StringBuffer();
		
		while(inputString.contains("(")) {
			startI = inputString.lastIndexOf('(');
			endI = inputString.indexOf(')');
			
			if(startI > endI) startI = inputString.indexOf('(');
			
//			System.out.printf("%d %d\n", startI, endI);
			temp.setLength(0);
			temp.append(inputString.substring(startI+1, endI));
//			System.out.println(temp.toString());
			
			inputString = inputString.substring(0, startI)
					    + temp.reverse().toString()
					    + inputString.substring(endI+1);
//			System.out.println(inputString);
		}
		
    	System.out.println(inputString);
	}
}
