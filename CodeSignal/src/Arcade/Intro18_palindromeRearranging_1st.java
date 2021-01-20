package Arcade;

public class Intro18_palindromeRearranging_1st { // 여러 접근법이 있을 것 같다. 같이 풀어볼 문제
	public static void main(String[] args) {
		String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
		
		System.out.println(palindromeRearranging(inputString));
	}
	
	static boolean palindromeRearranging(String inputString) {
	    if(inputString.length() == 1) return true;
	    
	    int[] cnt = new int[26]; //알파벳 갯수는 28개 아니고  26개 ...ㅋㅋㅋㅋㅋ
	    
	    for(int i = 0; i < inputString.length(); i++){
	        cnt[inputString.charAt(i)-97]++;
	    }
	    
	    int odd = 0;
	    for(int i : cnt){
	        if(i == 0) continue;
	        if(i % 2 == 1) odd++;
	    }
	    
	    return (odd > 1)? false : true;
	}
}

/*

처음에 replace로 풀려다가 전부 다 바뀌는 바람에 실패.
replace fisrt는 본인만 바꿔버린다.

*/