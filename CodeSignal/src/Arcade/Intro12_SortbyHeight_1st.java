package Arcade;

import java.util.ArrayList;

public class Intro12_SortbyHeight_1st { 
	public static void main(String[] args) {
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		ArrayList<Integer> heights = new ArrayList<Integer>();
	    for(int i : a){
	        if(i != -1) heights.add(i);
	    }
	    
	    heights.sort(null);

	    int index = 0;
	    for(int i = 0; i < a.length; i++){
	        if(a[i] == -1) continue;
	        a[i] = heights.get(index++);
	    }

	    for(int i : a) {
	    	System.out.printf("%d ", i);
	    }
	}
}
