package Divisibility;

import java.util.ArrayList;

public class Divisibility_1st { //(0.98ms, 52.5MB)

	public static void main(String[] args) {
//		int[] arr = {5, 9, 7, 10};
//		int divisor = 5; // 5,10
		
		int[] arr = {2, 36, 1, 3};
		int divisor = 1; // 1,2,3,36
		
//		int[] arr = {3,2,6};
//		int divisor = 10; // -1
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				temp.add(arr[i]);
			}
		}
		
		if(temp.size() == 0) temp.add(-1);
		
		temp.sort(null);
		
		int[] answer = new int[temp.size()];
		int index = 0;
		
		for(int i : temp) {
			answer[index++] = i;
		}
		
		
		
	}

}
