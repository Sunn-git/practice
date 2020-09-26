package Printer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer_6th { // 내 답이랑 섞어보기
	public static void main(String[] args) { 
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2; //1
		
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0; //5
		
		int[] priorities = {3,3,4,1,2,4,3,5,4,1,2,2,1};
		int location = 4; //8

		
		Queue<Integer[]> printer 
			= new LinkedList<Integer[]>();
		
		
		for(int i = 0; i < priorities.length; i++) {
			Integer[] temp = new Integer[2];
			temp[0] = priorities[i];
			temp[1] = (i == location) ? 1 : 0;
			
			printer.offer(temp);
		}
		
		Arrays.sort(priorities);
		
		int size = priorities.length-1;
		int answer = 0;
		
		while(!printer.isEmpty()){
				
				Integer[] temp = printer.peek();
				
				if(temp[0] == priorities[size - answer]) {
					printer.poll();
					answer++;
					
					if(temp[1] == 1) break;

				}else {
					printer.offer(printer.poll());
				}	
		};
		
		
		System.out.println(answer);
	}
}
