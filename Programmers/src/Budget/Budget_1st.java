package Budget;

import java.util.Arrays;

public class Budget_1st { 

	public static void main(String[] args) { // (2.68ms, 51.9MB)
//		int[] d = {1,3,2,5,4};
//		int budget = 9; //3
		
		int[] d = {2,2,3,3};
		int budget = 10; //4
		
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {			
			if(budget - d[i] >= 0) {
				budget -= d[i];
			}else {
				answer = i;
				break;
			}
			
			if(i == d.length-1) {
				answer = d.length;
			}
		}
		
		System.out.println(answer);

	}

}
