package Add;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Add_1st { //HashMap(1.61ms, 52.4MB), HashSet(1.20ms, 52.1MB)

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1}; //2,3,4,5,6,7
		
//		int[] numbers = {5,0,2,7}; //2,5,7,9,12

//		HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>(); 
		HashSet<Integer> sum = new HashSet<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
//				sum.put(numbers[i] + numbers[j], 0);
				sum.add(numbers[i] + numbers[j]);
			}
		}
		
//		Object[] temp = sum.keySet().toArray();
		Object[] temp = sum.toArray();
		Arrays.sort(temp);
		int[] answer = new int[sum.size()];
		int index = 0;
		
		for(Object o : temp) {
			answer[index++] = (int)o;
		}
		
		
//		System.out.println(answer);
	}

}
