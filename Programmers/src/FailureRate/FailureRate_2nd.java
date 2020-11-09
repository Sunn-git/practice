package FailureRate;

import java.util.Arrays;

public class FailureRate_2nd {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 3,4,2,1,5
		
//		int N = 4;
//		int[] stages = {4,4,4,4,4}; // 4,1,2,3
		
		double[] failureR = new double[N];
		int[] stay = new int[N+1];
		int[] pass = new int[N+1];
		
		double total = stages.length;
		
		
		for(int i = 0; i < stages.length; i++) {
			stay[stages[i]-1]++;	
		}
		
		for(int i = 0; i < stay.length-1; i++) {
			failureR[i] = stay[i] / total;
			total -= stay[i];
		}
		
		Arrays.sort(failureR);
		
		for(double d : failureR) {
			System.out.println(d);
		}
		

	}

}
