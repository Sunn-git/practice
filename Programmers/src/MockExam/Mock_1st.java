package MockExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Mock_1st {

	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int[] count = new int[3];
	
		for(int i = 0; i < answers.length; i++) {
			if( answers[i] == a[(i % 5)] ) count[0]++;
			if( answers[i] == b[(i % 8)] ) count[1]++;
			if( answers[i] == c[(i % 10)] ) count[2]++;
		}
		
		hash.put(count[0], 1);
		hash.put(count[1], 2);
		hash.put(count[2], 3);
		
		Object[] keys = hash.keySet().toArray();
		Arrays.sort(keys);
		
		if(keys.length == 3) {
			answer.add(hash.get(keys[keys.length-1]));
		}else if(keys.length == 2) {
			for(int i = 0; i < count.length; i++) {
				if(count[i] == (int)keys[keys.length-1]) {
					answer.add(i+1);
				}
			}
		}else if(keys.length == 1){
			answer.add(1);
			answer.add(2);
			answer.add(3);
		}
		
		System.out.println(answer);
	}

}
