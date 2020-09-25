package Printer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Printer_3rd {
	public static void main(String[] args) {
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2; //1
		
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0; //5
		
		int[] priorities = {3,3,4,1,2,4,3,5,4,1,2,2,1};
		int location = 1; //7
		
//		for(int i = 0; i < priorities.length; i++) {
//			for(int j = i+1; j < priorities.length; j++) {
//				
//				
//			}
//		}
		
		Queue<Integer> printer = new LinkedList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < priorities.length; i++) {
			printer.offer(priorities[i]);
			
			if(map.containsKey(priorities[i])) {
				map.put(priorities[i], map.get(priorities[i])+1);
			}else {
				map.put(priorities[i], 1);
			}
		}
		
		Object[] keys = map.keySet().toArray();
		
		int index = keys.length;
		int done = 0;
		int lastIndex = 0;
		
		loop : do {
			
			int count = map.get(keys[--index]);
			lastIndex = -1;
			
			System.out.println();
			System.out.println("location : "+location);

			int size = printer.size();
			
			System.out.println(printer);
			System.out.println("length : "+size);
			
			while(true) {

				lastIndex++;
				
				if(printer.peek() == keys[index]) {
					printer.poll();
					count--;
					
//					if(priorities[location] == (int)keys[index]) {
//						break loop;
//					}
					
					if(count == 0) {
						System.out.println("LI : "+lastIndex);
						System.out.println("gap : "+(size - (lastIndex+1)));
						
						location += (size - (lastIndex+1));
						if(location > printer.size()-1) location = printer.size()-1;
						
						break;
					}
	
				}else {
					printer.offer(printer.poll());
				}	
				
			}

			
			
			
		}while(index > 0);
//		(int)keys[index] >= priorities[location]
		
		
		int answer = 0;
		
//		System.out.println(answer);
	}
}
