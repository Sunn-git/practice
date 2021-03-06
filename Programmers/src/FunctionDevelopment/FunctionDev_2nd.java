package FunctionDevelopment;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionDev_2nd { // 주석 제거 ver 거의 0.xx 1.xx대인대 테스트 7만 (7.81ms, 52.9MB)
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5}; // 2,1
		
//		int[] progresses = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1}; // 1,3,2
		
		HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
		ArrayList<Integer> answers = new ArrayList<Integer>();
		
		int index = 0;
		
		do {
			
			for(int i = 0; i < progresses.length; i++) {
				if(progresses[i] < 100) {
					progresses[i] += speeds[i];
					
				}else {
					if(!temp.containsKey(i)) temp.put(i, index);
					progresses[i] = 100;
				}
			}
			index++;
		}while(temp.size() != progresses.length);
		
		Object[] keys = temp.keySet().toArray();
		
		for(int i = 0; i < temp.size(); i++) {
			int length = 0;
			int sum = 0;
			
			for(int s : answers) {
				sum += s;
			}
			
			if(sum == progresses.length) break;
			
			for(int j = i; j < temp.size(); j++) {
				if(temp.get(i) < temp.get(j)) {
					i = j-1;
					break;
				}else {
					length++;
				}
			}
			
			if(length != 0)answers.add(length);
		}
		
		System.out.println(answers.toString());
		
	}

}
