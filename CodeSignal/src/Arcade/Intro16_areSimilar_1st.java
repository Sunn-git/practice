package Arcade;

import java.util.Arrays;

public class Intro16_areSimilar_1st { 
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {3, 2, 1};
		
		System.out.println(areSimilar(a, b));
	}
	
	static boolean areSimilar(int[] a, int[] b) { // Arrays sort와 for문 2개를 쓰지 않고 풀 수 있는 다른 방법은 뭘까
	    int falseCnt = 0;

	    for(int i = 0; i < a.length; i++){        
	        if(a[i] != b[i]) falseCnt++;
	                
	        if(falseCnt > 2) return false;
	    }
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    for(int i = 0; i < a.length; i++){        
	        if(a[i] != b[i]) return false;
	    }
	    
	    return true;
	}
}
