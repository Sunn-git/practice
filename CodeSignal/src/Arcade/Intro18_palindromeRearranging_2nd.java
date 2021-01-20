package Arcade;

public class Intro18_palindromeRearranging_2nd { // 여러 접근법이 있을 것 같다. 같이 풀어볼 문제
	public static void main(String[] args) {
//		String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
		String inputString = "zaa";

		
		
		System.out.println(palindromeRearranging(inputString));
	}
	
	static boolean palindromeRearranging(String inputString) {
	    if(inputString.length() == 1) return true;
	    
	    int[] cnt = new int[28];
	    
	    for(int i = 0; i < inputString.length()-1; i++){
	    	String c = String.valueOf(inputString.charAt(i));
	    	String temp = inputString.substring(i+1);
	    	
	    	if(temp.contains(c)) {
	    		inputString = inputString.substring(0, i)
	    					.concat(temp.replaceFirst(c, ""));
	    		i--;
	    	}
	    	
	    }
	    
	    return (inputString.length() > 1)? false : true;
	}
}

/*

이번 풀이는 같은 문자 두개를 동시에 없애는 방법
처음 시도했다 실패한 replaceFirst를 사용.
inputString을 재정의하는 부분에서  inputString.substring(0, i) 를 놓쳐서 실패했었다.

*/