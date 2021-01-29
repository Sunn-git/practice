package Arcade;

public class Intro45_buildPalindrome_1st { 
	public static void main(String[] args) {
		Intro45_buildPalindrome_1st thisClass = new Intro45_buildPalindrome_1st();
		
		String st = "abcdc";
		System.out.println(thisClass.buildPalindrome(st));
		
	}
	
	String buildPalindrome(String st) { 
		String added = new String(st);
		StringBuffer sb = new StringBuffer();
	    
	    loop : for(int i = 0; i < st.length(); i++){
		    	sb.append(st.substring(0, i)).reverse();
	//	    	System.out.println(sb.toString());
		    	added = added.concat(sb.toString());
		    	sb.setLength(0);
		    	
		    	for(int j = 0; j < added.length()/2; j++) {
		    		if(added.charAt(j) != added.charAt(added.length()-1-j)) break;
		    		if(j == (added.length()/2)-1) break loop;
		    	}	
		    	added = added.substring(0, st.length());
		    }
	    return added;
	}
	
	
//	thucnguyen's solution
	String buildPalindrome_others(String str) {
	    int i = 0;
	    while (!isPalindrome(str.substring(i))) i++;
	    
	    while (--i >= 0) str += str.charAt(i); 
	    
	    return str;
	}
	boolean isPalindrome(String s) {
	    if (s.length() < 2) return true;
	    
	    if (s.charAt(0) != s.charAt(s.length()-1)) return false;
	    
	    return isPalindrome(s.substring(1, s.length() - 1));
	}
}

/*

규칙을 찾아서 풀어보려고 했는데 생각대로 되지 않았다.
제일 첫 알파벳부터 하나하나 덧붙여서 Palindrome인지 확인하는 방식의 풀이.

*/