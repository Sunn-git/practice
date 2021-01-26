package Arcade;

import java.util.Arrays;
import java.util.HashSet;

public class Intro36_differentSymbolsNaive_1st { 
	public static void main(String[] args) {
		Intro36_differentSymbolsNaive_1st thisClass = new Intro36_differentSymbolsNaive_1st();
		
		String s = "cabca";
		System.out.println(thisClass.differentSymbolsNaive3(s));
	}
	
	int differentSymbolsNaive(String s) {
	    char[] arr = s.toCharArray();
	    Arrays.sort(arr);
	    
	    int cnt = 1;
	    for(int i = 1; i < arr.length; i++){
	        if(arr[i-1] != arr[i]) cnt++;
	    }
	    return cnt;
	}
	
	int differentSymbolsNaive2(String s) {
	    HashSet<Character> set = new HashSet<Character>();
	    for(int i = 0; i < s.length(); i++) {
	    	set.add(s.charAt(i));
	    }
	    return set.size();
	}

	int differentSymbolsNaive3(String s) {
		int cnt = 0;
	    while(s.length() > 0) {
	    	cnt++;
	    	s = s.replaceAll(String.valueOf(s.charAt(0)), "");
	    }
	    return cnt;
	}
	
	
//	ben_w6's solution
	int differentSymbolsNaive_others(String s){
	    return (int) s.chars().distinct().count();
	    //와 미쳤다.. STREAM 공부하기 !!!!!!!!!!!!!
	}
	
	
	//bandorthild's solution
	int differentSymbolsNaive_others2(String s) {
	    HashSet h = new HashSet();
	    for (char c : s.toCharArray()) { //향상된 for문으로 이렇게도 가능하다
	    	h.add(c);
	    }
	    return h.size();
	}

	
}

/*



*/