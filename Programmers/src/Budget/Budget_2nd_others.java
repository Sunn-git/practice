package Budget;

import java.util.Arrays;

public class Budget_2nd_others {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9; //3
		
//		int[] d = {2,2,3,3};
//		int budget = 10; //4
		
		int answer = 0;
		
		Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0) break; // 이렇게 하는게 훨씬 간단하다

            answer++;
        }
		
		System.out.println(answer);

	}

}
