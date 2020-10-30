package ReversedArray;

import java.util.Stack; // stack을 쓸 필요가 없었음(역순이라)

public class RA_1st {

	public static void main(String[] args) {
		long n = 12345;
		Stack<Integer> stack = new Stack<Integer>();
		long temp = 0;
		
		while(n  >= 1) {
			temp = n % 10;
			
			stack.add((int)temp);
			
			n /= 10;
		}
		
		System.out.println(stack);
		
		Object[] sArray = stack.toArray();
		
		int[] answer = new int[stack.size()];
//		
		for(int i = 0; i < stack.size(); i++) {
			answer[i] = (int)sArray[i];
		}
//		
		for(int i : answer) {
			System.out.printf("%d, ", i);
		}

	}

}
