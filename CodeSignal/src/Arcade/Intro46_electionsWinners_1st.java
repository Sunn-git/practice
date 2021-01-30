package Arcade;

import java.util.Arrays;

public class Intro46_electionsWinners_1st { 
	public static void main(String[] args) {
		Intro46_electionsWinners_1st thisClass = new Intro46_electionsWinners_1st();
		 int[] votes = {1, 3, 3, 1, 1};
		 int k = 0;
//		 int[] votes = {1, 3, 4, 2, 5, 4};
//		 int k = 3;
//		 int[] votes = {5, 1, 3, 4, 1};
//		 int k = 0; // 1
//		 int[] votes = {1, 1, 1, 1};
//		 int k = 1; // 4
		 
		 System.out.println(thisClass.electionsWinners(votes, k));
	}
	
	int electionsWinners(int[] votes, int k) {
	    int max = Arrays.stream(votes).max().getAsInt();
	    long temp = Arrays.stream(votes).filter(i -> i == max).count();
	    
	    if(k == 0) return (temp == 1)? 1 : 0;
	    return (int)Arrays.stream(votes).filter(i -> i+k > max).count();
	}
	
	
//	int electionsWinners(int[] votes, int k) {
//	    Arrays.sort(votes);
//	    int max = votes[votes.length-1];
//	    int num = 0;
//	    
//		    int check = votes[0];
//	        int cnt = 0;
//		    if(max == check) return(k == 0)? 0 : votes.length;
//
//		    for(int i = 0; i < votes.length; i++) {
//		    	if(votes[i] == max) cnt++;
//		    	if(i > 0  && check == votes[i]) continue;
//		    	check = votes[i];
//		    	if(i+1 < votes.length && check == votes[i+1]) continue;
//		    	if((k != 0)? votes[i]+k > max : votes[i]+k >= max) {
//		    		num++;
//		    	}
//		    }
//	    return (k != 0 && cnt > 1)? cnt : num;
//	}

	
}

/*

처음에 시도했던게 안돼서 처음으로 혼자 stream을 사용해본 풀이 !! 이게 되다니 뿌듯 :)
k가 0인경우와 아닌경우에서 최대값이 한 개인 경우와 아닌 경우를 나누어서 생각하는 것이 핵심!
다른 랭커의 풀이는 내 식에서 return값을 삼항연산자로 다 합친 것.

*/