package Arcade;

public class Intro11_isLucky_2nd_others { // jocke93's solution 
	public static void main(String[] args) {
		int n = 1230;
		
		String s = n+"";
    	int sum = 0;
		    
	    for(int i=0; i<s.length()/2; i++)
	        sum+=(s.charAt(i)-s.charAt(s.length()-1-i));
		
		System.out.println(sum == 0);
	}
}
