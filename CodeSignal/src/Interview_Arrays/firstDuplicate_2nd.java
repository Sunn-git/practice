package Interview_Arrays;

import java.util.HashSet;

public class firstDuplicate_2nd {
	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 3, 2};
		
		int duplicate = -1;
		int idx = a.length;

	    HashSet<Integer> set = new HashSet<Integer>();
	    
	    for(int i = 0; i < a.length; i++){
	        if(!set.add(a[i]) && i < idx){
	            duplicate = a[i];
	            idx = i;
	        }
	    }


	}
}

/* 

단순 중복값을 구하는 문제는 Set을 사용하는게 훨씬 빨랐다.

*/