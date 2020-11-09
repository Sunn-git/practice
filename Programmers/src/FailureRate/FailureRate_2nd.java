package FailureRate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class FailureRate_2nd {

	public static void main(String[] args) { // (9.89ms, 63MB)
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 3,4,2,1,5
		
//		int N = 4;
//		int[] stages = {4,4,4,4,4}; // 4,1,2,3
		
		
		HashMap<Integer, Double> fr = new HashMap<Integer, Double>();
		int[] stay = new int[N+1];
		double total = stages.length;
		
		int[] answer = new int[N];
		
		
		for(int i = 0; i < stages.length; i++) {
			stay[stages[i]-1]++;	
		}
		
		for(int i = 0; i < stay.length-1; i++) {
			
			if(total == 0) { // 1,6,7,9,13,23,24,25 테스트케이스 
				fr.put(i, (double) 0);
				continue;
			}
			
			fr.put(i, stay[i] / total);
			total -= stay[i];
		}
		
		Integer[] keyArr = new Integer[N];
		fr.keySet().toArray(keyArr); // https://includestdio.tistory.com/1

//		for(int i : keyArr) {
//			System.out.println(i);
//		}
		
		
		Arrays.sort(keyArr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return fr.get(o2).compareTo(fr.get(o1));
			}
		});
		
		int index = 0;
		
		for(int i : keyArr) {
			answer[index++] = i+1;
			System.out.println(i);
		}
		
		
//		ArrayList<Double> keyList = new ArrayList<Double>(fr.keySet());
//		
//		Collections.sort(keyList, new Comparator<Double>() {
//			@Override
//			public int compare(Double o1, Double o2) {
//				return fr.get(o2).compareTo(fr.get(o1));
//			}
//			
//		});
//		
//		int index = 0;
//		
//		for(double d : keyList) {
//			answer[index++] = (int)d + 1;
//		}
		
		
		
//		for(int i : answer) {
//			System.out.println(i);
//		}
		
	}

}
