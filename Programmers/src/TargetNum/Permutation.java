package TargetNum;

public class Permutation {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		int[] input = {1, -1};
		
//		int n = input.length;
//		int r = numbers.length;
		int[] answer = new int[numbers.length];
		
		permutationDup(input, numbers, answer, 0);
		
		
//		System.out.println();
		
	}

	public static void permutationDup
	(int[] input, int[] numbers, int answer[], int depth) {
		if(depth == numbers.length) {
			print(answer);
			return;
		}
		
		for(int i = 0; i < input.length; i++) {
			answer[depth] = input[i] * numbers[depth];
			permutationDup(input, numbers, answer, depth+1);
		}
		
	}
	
	public static void print(int[] answer) {
		int sum = 0;
		for(Integer ans : answer) {
			System.out.print(ans + " ");
			sum += ans;
		}
		System.out.print(" = " + sum);
		System.out.println();

	}
}
