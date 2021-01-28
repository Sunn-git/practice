package Arcade;

public class Intro40_longestDigitsPrefix_1st { 
	public static void main(String[] args) {
		Intro40_longestDigitsPrefix_1st thisClass = new Intro40_longestDigitsPrefix_1st();
		
//		String inputString = "inputString: \"  3) always check for whitespaces\"";
//		String inputString = "inputString: \"the output is 42\"";
		String inputString = "123aa1";
		thisClass.longestDigitsPrefix(inputString);
		
	}
	
	String longestDigitsPrefix(String inputString) {
	    for(int i = 0; i < inputString.length(); i++) {
	        char c = inputString.charAt(i);
	        if(i == 0 && !Character.isDigit(c)) return "";
	        if(!Character.isDigit(c)) return inputString.substring(0, i);
	    }
	    
	    return inputString;
	}

	
//	pixelstorm's solution
	String longestDigitsPrefix_others(String inputString) {
	    return inputString.replaceAll("^(\\d*).*","$1");
//	    심지어 정규표현식으로 풀면 더 간단한 문제.. 이 정규표현 알아두자 !
	}
}

/*

숫자로 이루어진 가장 긴 전치사를 찾으라고해서 문장 중간 단어에 답이 들어있는 함정도 있을 줄 알았더니
그냥 입력값 앞부분만 검사하면 되는 문제였다.. 너무 꼬아서 생각했나? 좀 허무함

*/