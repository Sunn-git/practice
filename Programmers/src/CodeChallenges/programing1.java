package CodeChallenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class programing1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = {2,1,3,4,1};
		
		HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				sum.put(numbers[i]+numbers[j], numbers[i]+numbers[j]);
			}
		}
		
		int[] answer = new int[sum.size()];
		int index = 0;
		
		for(int i : sum.values()) {
			answer[index++] = i;
		}
		
		
		Arrays.sort(answer);
		System.out.println(answer.toString());
		
	}
}
