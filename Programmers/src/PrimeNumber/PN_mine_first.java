package PrimeNumber;

import java.util.ArrayList;

public class PN_mine_first {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		
		for(int i = 2; i <= n; i++) {
			loop: for(int j = 0; j < result.size(); j++) {
				if(i % result.get(j) == 0) break loop;
				if( j == result.size()-1) result.add(i);
			}
            answer = result.size();
		}
        return answer;
    }
}
