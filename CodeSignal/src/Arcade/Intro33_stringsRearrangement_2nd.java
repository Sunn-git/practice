package Arcade;

public class Intro33_stringsRearrangement_2nd { // 블로그 참고 https://greenhelix.tistory.com/61
	public static void main(String[] args) {
		Intro33_stringsRearrangement_2nd thisClass = new Intro33_stringsRearrangement_2nd();
		
//		String[] inputArray = {"abc", 
//							   "bef", 
//							   "bcc", 
//							   "bec", 
//							   "bbc", 
//							   "bdc"};
		
//		String[] inputArray = {"aba", 
//				 "bbb", 
//				 "bab"};
		
//		String[] inputArray = {"ab", 
//				 "bb", 
//				 "aa"};
		
		String[] inputArray = {"ab", 
				 "aa"};
//		String[] inputArray = {};
		
		System.out.println(thisClass.stringsRearrangement(inputArray));
		
	}
	
	boolean stringsRearrangement(String[] inputArray) {
		boolean[] check = new boolean[inputArray.length];
		
		DFS(inputArray, "", check, 0);
		
		return success;
	}
	
	boolean success = false;
	
	void DFS(String[] inputArray, String prev, boolean[] check , int depth) {
		if(depth == inputArray.length) {
			success = true;
			return;
		}
		
		for(int i = 0; i < inputArray.length; i++) {
			if(!check[i] && (depth == 0 || isDifferOne(prev, inputArray[i]))) {
				check[i] = true;
				DFS(inputArray, inputArray[i], check, depth+1);
				check[i] = false;
			}	
		}
	}
	
	
	boolean isDifferOne(String s1, String s2) {
		int cnt = 0;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) cnt++;
		}
		
		return cnt == 1;
	}
}

/*

진짜 너무 답이 안나와서 블로그 글을 찾아보니 DFS로 푼 예시가 있었다.
아직 DFS공부가 모자란 것 같다.
코드시그널 랭커들 답도 공부하기.

*/