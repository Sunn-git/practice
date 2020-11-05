package Cote_1105;

import java.util.HashMap;

public class Three_2nd { // 순서를 바꾸면 안되나봄...

	public static void main(String[] args) {
//		int[] a = {0}; //	0
//		int[] a = {5,2,3,3,5,3}; //	4
//		int[] a = {0,3,3,0,7,2,0,2,2,0}; //	8
//		int[] a = {1,2,1,3,4,1,1,3}; //
		int[] a = {2,1,1,1,1,1,1,1,2,3,2,6,2,6};
		
		int answer = -1;
		
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for(int i = 1; i < a.length; i++) {
			if(a[i-1] == a[i]) {
				continue;
			}
			
			if(count.containsKey(a[i])) {
				count.put(a[i], count.get(a[i])+1);
			}else {
				count.put(a[i], 1);
			}
		}
		
		
		String temp = "";
		
		Object[] keys = count.keySet().toArray();
		int intersection = 0;
		int max = 0;
		
		for(int i = 0; i < keys.length; i++) {
			
			if(count.get(keys[i]) > max) {
				
				
				intersection = (int)keys[i];
				max = count.get(keys[i]);
			}
			
		}
		
		
		
		int length = 0;
		int cnt = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			if(cnt == 1) {
				if(a[i] == intersection) continue;
			}
			
			if(length % 2 == 1 && cnt == 0) {
				if(a[i] != intersection) continue;
			}
		
			if(a[i] == intersection) cnt++;
			
			temp += a[i];
			length++;
			
			if(length % 2 == 0) cnt = 0;
			
		}
		
		answer = (temp.length() % 2 == 0) ? temp.length() : temp.length()-1;
		
		System.out.println(temp);
		System.out.println(answer);
		

	}

}
