package SkillCheck;

import java.util.ArrayList;
import java.util.HashSet;

public class No2 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		int[] supo1 = {1,2,3,4,5};
		int[] supo2 = {2,1,2,3,2,4,2,5};
		int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
		
		int[] count = new int[3];
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == supo1[(i % supo1.length)]) count[0]++;
			if(answers[i] == supo1[(i % supo2.length)]) count[1]++;
			if(answers[i] == supo1[(i % supo3.length)]) count[2]++; 
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : count) set.add(i);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		
		if(set.size() == 3) {
			int max = 0;
			int maxI = 0;
			for(int i = 0; i < count.length; i++) {
				if(count[i] > max) {
					max = count[i];
					maxI = i;
				}
			}
			
			array.add(maxI);
			
		}else if(set.size() == 2) {
			for(int i = 0; i < count.length; i++) {
				if(!set.add(count[i])) {
					array.add(i+1);
				}
			}
		}else if(set.size() == 1){
			array.add(1);
			array.add(2);
			array.add(3);
		}
		
		
		
		
//		for(int i : answer) {
//			System.out.printf("%d, ", i);
//		}
	}

}
