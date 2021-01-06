package Interview_Arrays;

public class firstNotRepeatingCharacter_1st {
	public static void main(String[] args) {
//		String s = "abacabad";
		String s = "abacabaabacaba";
		
	    String temp = s;
	    
	    for(int i = 0; i < s.length(); i++){
	        String c = s.substring(i, i+1);
	        if(s.substring(i+1).contains(c)){
	            temp = temp.replaceAll(c, "");
//	            System.out.println(temp);
	        }
	    }
	    
		System.out.println((temp.equals(""))? '_' : temp.charAt(0));
	}
}

/* 
replaceAll 한 결과를 변수에 넣어주지도 않고 작동 안하는 줄 알았음;; 
*/