package Interview_Arrays;

public class firstNotRepeatingCharacter_2nd {
	public static void main(String[] args) {
//		String s = "abacabad";
		String s = "abacabaabacaba";
		
	    char[] c = s.toCharArray();
	    
	    for(int i = 0; i < s.length(); i++) {
	    	if(s.indexOf(c[i]) == s.lastIndexOf(c[i])) {
	    		System.out.println(c[i]);
	    	} // if
	    } // for
	    System.out.println('_');
	    
	}
}

/* 
다른 사람의 답

반복되지 않는다 == 한번만 등장한다 == indexOf 와 lastIndexOf 가 같다.
*/