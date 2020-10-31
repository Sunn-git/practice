package WinterCoding;

public class Three {
	

	private static int[] x = {-1, 0, 1, 0};
	private static int[] y = {0, -1, 0, 1};
	private static int cnt = 1;

	public static void main(String[] args) { // 네이버때 한거 쓰자
//		int[][] v = {{0,0,1,1},{1,1,1,1},{2,2,2,1},{0,0,0,2}};
		
		int[][] v = {{0,0,1},{2,2,1},{0,0,0}};
		
//		int n = 6;
//		int[][] array = {{0, 1, 1, 0, 0, 0}
//						,{0, 1, 1, 0, 1, 1}
//						,{0, 0, 0, 0, 1, 1}
//						,{0, 0, 0, 0, 1, 1}
//						,{1, 1, 0, 0, 1, 0}
//						,{1, 1, 1, 0, 0, 0}}; //3	4 5 7
		
		int zero = 0;
		int one = 0;
		int two = 0;
		
		for(int i = 0; i < v.length; i++) {
			for(int j = 0; j < v[0].length; j++) {
				int cur = v[i][j];
				if (cur == 9) {
					continue;
				}
				
				if(cur == 1) {
					one++;
					dfs(v, i, j, 1);					
				}
				
				if(cur == 0) {
					zero++;
					dfs(v, i, j, 0);	
					
				}
				
				if(cur == 2) {
					two++;
					dfs(v, i, j, 2);
				}
			}
		}
		
		int[] answer = new int[] {zero, one, two};
		
		for(int i : answer) {
			System.out.printf("%d, ", i);
		}
		System.out.println();
		
		System.out.printf("0 : %d / 1 : %d / 2 : %d ", zero, one, two);


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
