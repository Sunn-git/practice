package TargetNum;

public class TargetNum_2nd {
	
	public static void main(String[] args) {
//		int[] numbers = {1,1,1,1,1};
//		int target = 3;
		
		int[] numbers = {2, 3, 5, 7, 9};
		int target = 2;
		
		int answer = dfs(target, 0, 0, numbers);


		System.out.println(answer);
	}	
	
	private static int dfs(int target, int sum, int depth, int[] numbers) {
		
		if(depth == numbers.length) return (sum == target) ? 1 : 0;

		return dfs(target, sum+numbers[depth], depth+1, numbers)
				+  dfs(target, sum-numbers[depth], depth+1, numbers);
	}
}
