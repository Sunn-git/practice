package Arcade;

public class Intro18_palindromeRearranging_3rd_others { 
	public static void main(String[] args) {
//		String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
		String inputString = "zaa";

		System.out.println(palindromeRearranging1(inputString));
	}
	
	static boolean palindromeRearranging1(String inputString) { //samantha_p5's solution
		int map = 0;
	    for(int i=0; i<inputString.length(); i++) {
	        map ^= 1 << (inputString.charAt(i) - 'a');
	    }
	    return map == 0 || (map & -map) == map;
	}
	
	static boolean palindromeRearranging2(String inputString) { //jocke93's solution
		int []niz = new int[26];
	    
	    for(int i=0; i<inputString.length(); i++)
	        niz[inputString.charAt(i)-97]++;
	    
	    int cnt=0;
	    for(int i=0; i<niz.length; i++)
	        if(niz[i]%2!=0)
	            cnt++;
	    
	    return cnt<=1;
	}
}

/*

와 대박.. 이거 풀이 공부하기 

*/