package PrimeNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class PN {	//µ¿ºû³ª
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int answer = 0;
		int n = scanner.nextInt();
		int[] nums = new int[n+1];
		
		for(int i = 2; i < n+1; i++) {
			nums[i] = i;
		}
		
		for(int i = 2; i < n+1; i++) {
			if(nums[i] == 0) continue;
			for(int j = i + i; j < n+1; j += i) {
				nums[j] = 0;
			}
		}
		
		for(int i : nums) {
			if(nums[i] != 0) {
				System.out.printf("%d,", nums[i]);
				answer++;
			}
			
		}
		
		System.out.println("/"+answer);
		
	}

}
