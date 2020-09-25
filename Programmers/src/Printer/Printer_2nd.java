package Printer;

import java.util.HashMap;

public class Printer_2nd {
	public static void main(String[] args) {
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2; //1
		
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0; //5
		
		int[] priorities = {3,3,4,1,2,4,3,5,4,1,2,2,1};
		int location = 1; //7
		
		int first = -1;
		int last = -1;
		
//		for(int i = 0; i < priorities.length; i++) {
//			for(int j = i+1; j < priorities.length; j++) {
//				
//				
//			}
//		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		while(true) {
			
			for(int i = 0; i < priorities.length; i++) {
				if(map.containsKey(priorities[i])) {
					map.put(priorities[i], map.get(priorities[i])+1);
				}else {
					map.put(priorities[i], 1);
				}
			}
			
			Object[] keys = map.keySet().toArray();
			
			
			
			for(int i = keys.length-1; i >= 0; i--) { // 제일 큰 우선순위인 경우
				
				int num = 0;
				
				for(int j = 0; j < priorities.length; j++) {

					if((int)keys[i] == priorities[j]) {
						
						if(first == -1) {
							num++;
							
							if (num == 1) first = j;
							if (num == map.get(keys[i])) last = j;
						}else {
							num++;
							
							
							
						}
					}
				}
				
				System.out.printf("%d, %d\n", first, last);
			}
			
			break;
		}
		
		System.out.println(map);
		
		
		int answer = 0;
		
//		System.out.println(answer);
	}
}
