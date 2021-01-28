package NationOf124;

import java.util.Stack;

public class NationOf124 {
	public static void main(String[] args) {
		NationOf124 thisClass = new NationOf124();
		
//		int n = 12;
		int n = 3;
		
		String answer = "";
        if(n == 1) {
        	System.out.println("1");
        	return;
        };
        
        int temp = n;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        while(temp > 0) {
        	stack.push(thisClass.to124(--temp));
        	temp /= 3;
        }
        
        while(!stack.isEmpty()) {
        	answer = answer.concat(Integer.toString(stack.pop()));
        }
        
        System.out.println(answer);
		
	}
	
	public int to124(int i) {
//		System.out.println(i%3);
		if(i%3 == 0) return 1;
		if(i%3 == 1) return 2;
		return 4;
	}
}


/*

012 012 012

123/456/789
120/120/120

몫을 제외하고 3진수를 만들기 위해서 숫자에서 -1 해줘야한다.




*/