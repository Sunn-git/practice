package TargetNum;

public class TargetNum_1st {
	
	public static void main(String[] args) {
//		int[] numbers = {1,1,1,1,1};
//		int target = 3;
		
		int[] numbers = {2, 3, 5, 7, 9};
		int target = 2;
		
//		int[] sign = {1, -1};
		
		int answer = 0;
		
		answer = dfs(numbers, 0, 0, target);


		System.out.println(answer);
	}

	private static int dfs(int[] numbers, int depth, int sum, int target) {
		if(depth == numbers.length) {
			if(sum == target) {
				return 1;
			}
			return 0;
		}
		
		return dfs(numbers, depth+1, sum + numbers[depth], target) 
				+ dfs(numbers, depth+1, sum - numbers[depth], target);
	}
	
}
