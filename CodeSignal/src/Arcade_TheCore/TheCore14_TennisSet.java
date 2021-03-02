package Arcade_TheCore;

public class TheCore14_TennisSet {
	public static void main(String[] args) {
		TheCore14_TennisSet thisClass = new TheCore14_TennisSet();
		
//		int answer = thisClass.largestNumber(8);
//		System.out.println(answer);
	}
	
	boolean tennisSet(int score1, int score2) {
	    int max = Math.max(score1, score2);
	    int min = Math.min(score1, score2);
	    
	    return (max == 6 && min < 5) || (max == 7 && min >= 5 && min != max);
	}

	
	
}

/*

문제를 제대로 해석하지 못해서 헤맸다.
테니스 셋의 승리를 위한 최소 승수는 6회
다만 상대가 5회 이긴 경우에는 먼저 7회 이기는 사람이 승자.
따라서 조건은 큰수가 6일때 작은 수가 5보다 작거나
큰수가 7일때 작은 수가 5보다 같거나 크고 7보다 작아야한다.

*/