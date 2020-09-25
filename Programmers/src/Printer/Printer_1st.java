package Printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Printer_1st {
	public static void main(String[] args) {
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2; //1
		
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0; //5
		
		int[] priorities = {3,3,4,2};
		int location = 3; //4
		
		int answer = 0;
		
		int myPriority = priorities[location];
		int hightPriority = 0;
		int nextPriority = 0;
		int nextIndex = 0;
		
		Queue<Integer> printer 
		= new PriorityQueue<Integer>(Collections.reverseOrder());
		
		ArrayList<Integer> copy = new ArrayList<Integer>();
		
//		HashMap<Integer, Integer> kind = new HashMap<Integer, Integer>();
//		
//
		for(int i = 0; i < priorities.length; i++) {
			if(priorities[i] > myPriority) hightPriority++;
			
			printer.offer(priorities[i]);
			copy.add(priorities[i]);
			
//			kind.put(priorities[i], 0);
		}
//		
//		Object[] keys = kind.keySet().toArray();
//		
//		for(int i = 0; i < keys.length; i++) {
//			if((int)keys[i] == priorities[location]) {
//				if(i != keys.length-1)
//					nextPriority = (int)keys[i+1];
//			}
//		}
		
		
		System.out.println(printer);
		
		if( hightPriority > 0 
			&& hightPriority < priorities.length - 1) {
			
			
		}else {
			answer = hightPriority + 1;
		}
		
		
		
		 
		
		System.out.println(answer);
	}
}
