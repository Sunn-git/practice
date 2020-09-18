package FunctionDevelopment;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionDev_1st {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5}; // 2,1
		
//		int[] progresses = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1}; // 1,3,2
		
//		ArrayList<Integer> temp = new ArrayList<Integer>();
		HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
		ArrayList<Integer> answers = new ArrayList<Integer>();
		
		int index = 0;
		
		
		do {	
			
			for(int i : progresses) {
				System.out.printf("%d, ", i);
			}
			System.out.println();
			
			for(int i = 0; i < progresses.length; i++) {
				if(progresses[i] < 100) {
					progresses[i] += speeds[i];
					
				}else {
//					if(!temp.contains(i))temp.add(index++, i);
					if(!temp.containsKey(i)) temp.put(i, index);
					progresses[i] = 100;
				}
			}
			index++;
		}while(temp.size() != progresses.length);
		
		Object[] keys = temp.keySet().toArray();
		
//		int[] answer = {};
		
//		for(int i : temp) {
//			System.out.printf("%d", i);
//		}
		
		for(Object o : keys) {
			System.out.printf("%d ", temp.get(o));
		}
		System.out.println();
		
		for(Object o : keys) {
			System.out.printf("%d ", o);
		}
		System.out.println();
		
		for(int i = 0; i < temp.size(); i++) {
			int length = 0;
			int sum = 0;
			
			for(int s : answers) {
				sum += s;
			}
			
			if(sum == progresses.length) break;
			
			for(int j = i; j < temp.size(); j++) {
				System.out.printf("i : %d, length : %d\n", i , length);
				if(temp.get(i) < temp.get(j)) {
					i = j-1;
					break;
				}else {
//					if(i == temp.size()-1) break;
					length++;
				}
			}
			
			if(length != 0) {
				answers.add(length);
//				System.out.printf("i : %d, length : %d\n", i , length);
			}
		}
		
//		int[] answer = new int[answers.size()];
		

		
		System.out.println(answers.toString());
		
	}

}
