package MoreSpicy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreSpicy_1st { // 런타임에러 4개 효율성 전부 시간초과
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;

		Arrays.sort(scoville);
		
//		if(scoville[scoville.length-1] == 0) return -1;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i : scoville) {
			list.add(i);
		}
		
		do {
			int temp = list.get(0) + list.get(1)*2;
			list.remove(0);
			list.remove(0);
			list.add(temp);
			
			list.sort(null);
			
		} while(list.get(0) < K);
		
		
		System.out.println(scoville.length - list.size());
	}
}
