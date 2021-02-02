package Arcade;

import java.util.Arrays;

public class Intro52_longestWord_1st { 
	public static void main(String[] args) {
		Intro52_longestWord_1st thisClass = new Intro52_longestWord_1st();
		
		
	}
	
	String longestWord(String text) {
	    String[] arr = text.split("[^a-zA-Z]"); 
	    // \\W+ 는 히든테스트 한개를 통과하지 못한다. [^W]+는 아예 0개
	    
	    int max = 0;
	    String result = "";
	    for(String s : arr){
	        if(s.length() > max){
	            max = s.length();
	            result = s;
	        }
	    }
	    
	    return result;
	}
	
//	ben_w6's solution
	String longestWord_others(String text){
	    return Arrays.stream(text.split("\\W+"))
	    						 .max((a, b) -> a.length() - b.length())
	    						 .get();
	}


	
}

/*

왜 스트림을 이용할 땐 \\W+가 되는걸까?

*/