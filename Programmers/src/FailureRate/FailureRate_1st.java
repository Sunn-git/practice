package FailureRate;

import java.util.ArrayList;
import java.util.Arrays;

public class FailureRate_1st {

	public static void main(String[] args) {
//		int N = 5;
//		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 3,4,2,1,5
		
		int N = 4;
		int[] stages = {4,4,4,4,4}; // 4,1,2,3
		
		Arrays.sort(stages);
		
		ArrayList<Double> failureRate = new ArrayList<Double>();

		int before = stages[0];
		double cnt = 0;
		int people = 8;
		
		for(int i = 0; i < stages.length; i++) {
			
			if(stages[i] != before) {
				failureRate.add( cnt/people);
				people -= cnt;
				cnt = 0;
				before = stages[i];
			}
			
			cnt++;
		}
		
		for(int i : stages) {
			System.out.printf("%d, ", i);
		}
		
		for(double d : failureRate) {
			System.out.println(d);
		}

	}

}
