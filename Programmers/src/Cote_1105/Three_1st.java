package Cote_1105;

import java.util.ArrayList;
import java.util.HashMap;

public class Three_1st {

	public static void main(String[] args) {
//		int[] a = {0}; //	0
		int[] a = {5,2,3,3,5,3}; //	4
//		int[] a = {0,3,3,0,7,2,0,2,2,0}; //	8
		
		int answer = -1;
		
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < a.length; i++) {
			if(count.containsKey(a[i])) {
				count.put(a[i], count.get(a[i])+1);
			}else {
				count.put(a[i], 1);
			}
		}
		
		
		Object[] keys = count.keySet().toArray();
		int intersection = 0;
		int max = 0;
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int i = 0; i < keys.length; i++) {
//			System.out.printf("%d %d\n", keys[i] ,count.get(keys[i]));
			
			if(count.get(keys[i]) > max) {
				intersection = (int)keys[i];
				max = count.get(keys[i]);
			}
			
			if(count.get(keys[i]) >= 2) {
				arrList.add((int)keys[i]);
			}
		}
		
		for(int i : arrList) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		int iSize = count.get(intersection);
		
		System.out.println(intersection);
		System.out.println(iSize);
		System.out.println(keys.length-1);
		
		if(iSize <= keys.length-1) {
			answer = iSize * 2;
		}else {
			int rest = iSize - keys.length-1;
			
			if(rest <= arrList.size()-1) {
				answer = iSize * 2;
			}else {
				answer = (keys.length-1 + arrList.size()-1) * 2;
			}
		}
		
		
		
		System.out.println(answer);

	}

}
