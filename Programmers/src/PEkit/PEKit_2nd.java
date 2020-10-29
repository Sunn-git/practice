package PEkit;

import java.util.Arrays;

public class PEKit_2nd {

	public static void main(String[] args) { // (1.96ms, 52.3MB)
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {3};
		
//		int n = 3;
//		int[] lost = {3};
//		int[] reserve = {1};
		
		int answer = 0;
	
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] != 0 && lost[i] == reserve[j]) {
					lost[i] = 0;
					reserve[j] = 0;
				}
			}
		}
        
		Arrays.sort(lost);
		Arrays.sort(reserve);
        
		int k = 0;
		
		for(int i = 0; i < lost.length; i++) {
			if(lost[i] != 0) {
				for(int j = k; j < reserve.length; j++) {			
					if(reserve[j] != 0 && 
						(lost[i]-1 == reserve[j] 
                            || lost[i]+1 == reserve[j])) {
						lost[i] = 0;
						reserve[j] = 0;
						k = j+1;
						break;
					}
				}
			}
		}
        
        for(int i : lost) {
			if(i != 0) n--;
		}
		
		answer = n;
		
		
		System.out.println(answer);
	}

}
