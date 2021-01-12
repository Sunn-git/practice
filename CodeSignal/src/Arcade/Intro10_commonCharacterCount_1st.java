package Arcade;

public class Intro10_commonCharacterCount_1st { 
	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "adcaa";
		
		int result = 0;
	    
	    for(int i = 0; i < s1.length(); i++){
	        char a = s1.charAt(i);
	        for(int j = 0; j < s2.length(); j++){
	            if(a == s2.charAt(j)){
	                result++;
	                s2 = s2.substring(0, j) + s2.substring(j+1);
	                break;
	            }
	        }
	    }
		
		System.out.println(result);
	}
}
