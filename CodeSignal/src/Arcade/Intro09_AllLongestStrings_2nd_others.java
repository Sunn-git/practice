package Arcade;

public class Intro09_AllLongestStrings_2nd_others { 
	public static void main(String[] args) {
		String[] inputArray = {"aba", 
				 "aa", 
				 "ad", 
				 "vcd", 
				 "aba"};

	    String l = ""; //full string with "-" separator
	    
	    for( String s: inputArray )
	    {
	        //length is first index of substring
	        //if list has same size strings, add this one
	        if( l.indexOf("-") == s.length() ) l += s + "-";
	        //reset if list has smaller strings
	        else if ( l.indexOf("-") < s.length() ) l = s + "-"; 
	    }
	    
	    System.out.println(l.split( "-" ));
	    //.split(String reg)는 String[]을 리턴한다..
	}
}
