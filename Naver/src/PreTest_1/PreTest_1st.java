package PreTest_1;

public class PreTest_1st {

	public static void main(String[] args) {
		int n = 6;
		int[][] array = {{0, 1, 1, 0, 0, 0}
						,{0, 1, 1, 0, 1, 1}
						,{0, 0, 0, 0, 1, 1}
						,{0, 0, 0, 0, 1, 1}
						,{1, 1, 0, 0, 1, 0}
						,{1, 1, 1, 0, 0, 0}}; //3	4 5 7
		
//		int n = 4;
//		int[][] array = {{0, 0, 0, 0}
//						,{0, 0, 0, 0}
//						,{0, 0, 0, 0}
//						,{0, 0, 0, 0}
//						,{0, 0, 0, 0}
//						,{0, 0, 0, 0}}; //0
		
//		int n = 4;
//		int[][] array = {{1, 0, 0, 0}
//						,{1, 0, 0, 0}
//						,{0, 0, 0, 0}
//						,{0, 0, 0, 0}
//						,{0, 0, 0, 0}
//						,{0, 0, 1, 1}}; //2		2 2
		
		int one = 0;
//		int zero = 0;
		int size = 0;
		
		
			
		
//		boolean[][] visitied;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				int cur = array[i][j];
				if (cur != 1) {
					continue;
				}
				
				if(cur == 1) {
					one++;
					size += dfs(array, i, j, 1);					
				}
				
//				if(cur == 0) {
//					zero++;
//					dfs(array, i, j, 0);	
//					
//				}
			}
		}
		
		
		System.out.printf("1 : %d / size : %d", one, size);
	}
	
	public static int dfs(int[][] array, int i, int j, int num) {
		array[i][j] = 9;
		
		int count = 0;
		
		//r
		if(j+1 < array[0].length && array[i][j+1] == num) 
			count += dfs(array, i, j+1, num);
		//l
		if(j-1 >= 0 && array[i][j-1] == num) 
			count += dfs(array, i, j-1, num);
		//u
		if(i+1 < array.length && array[i+1][j] == num) 
			count += dfs(array, i+1, j, num);
		//d
		if(i-1 >= 0 && array[i-1][j] == num) 
			count += dfs(array, i-1, j, num);
		
		return 1 + count;

	}
	

}
