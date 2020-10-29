package PEkit;

import java.util.Arrays;

public class PEKit_1st {

	public static void main(String[] args) { // 통과 못함
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {1, 3, 5};
		
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {3};
		
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
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

		
		for(int i : lost) {
			System.out.printf("%d, ", i);
		}
		System.out.println();
		for(int i : reserve) {
			System.out.printf("%d, ", i);
		}
		System.out.println();

		int k = 0;
		
		for(int i = 0; i < lost.length; i++) {
			System.out.println(k);
			if(lost[i] != 0) {
				for(int j = k; j < reserve.length; j++) {
										
					if(lost[i]-1 == reserve[j]) {
						lost[i] = 0;
						reserve[j] = 0;
						k = j+1;
						break;
					}else if(lost[i]+1 == reserve[j]) {
						lost[i] = 0;
						reserve[j] = 0;
						k = j+1;
						break;
					}
				}
			}
		}

		for(int i : lost) {
			System.out.printf("%d, ", i);
			if(i != 0) {
				n--;
			}
		}
		System.out.println();
		
		answer = n;
		
		
		System.out.println(answer);
	}

}
