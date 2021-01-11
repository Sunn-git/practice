package Arcade;

import java.util.ArrayList;

public class Intro09_AllLongestStrings_1st { 
	public static void main(String[] args) {
		String[] inputArray = {};
	    int max = 0;
	    for(String s : inputArray){
	        if(s.length() > max) max = s.length();
	    }
	    
	    ArrayList<String> newStrings = new ArrayList();
	    for(String s: inputArray){
	        if(max == s.length()) newStrings.add(s);
	    }
	    
	    String[] result = new String[newStrings.size()];
	    newStrings.toArray(result);
		
		System.out.println(result);
	}
}
