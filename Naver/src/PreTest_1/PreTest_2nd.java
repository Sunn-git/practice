package PreTest_1;

import java.util.ArrayList;

public class PreTest_2nd {
	
	private static int[] x = {-1, 0, 1, 0};
	private static int[] y = {0, -1, 0, 1};
	private static int cnt = 1;

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
		
		ArrayList<Integer> size = new ArrayList<Integer>();
		
		boolean[][] check = new boolean[array.length][array[0].length];
		
		
		
			
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				int cur = array[i][j];
				if (cur != 1) {
					continue;
				}
				
				if(cur == 1) {
					one++;
					dfs(array, check, i, j);
					size.add(cnt);
					cnt = 1;
				}
				
			}
		}
		
		size.sort(null);
		
//		System.out.printf("1 : %d / size :", one);
		
		System.out.println(one);
		
		for(int s : size) {
			System.out.printf("%d ", s);
		}
	}
	
	
	
	public static void dfs(int[][] array, boolean[][] check, int i, int j) {

//		System.out.println(i + " " + j);
		check[i][j] = true;
		array[i][j] = 0;
		
		for(int k = 0; k < 4; k++) {
			int nextI = i + x[k];
			int nextJ = j + y[k];
			
			if(nextI < 0 || nextJ < 0 || nextI >= check.length || nextJ >= check.length) {
				continue;
			}
			
			if(check[nextI][nextJ]) {
				continue;
			}
			
			if(array[nextI][nextJ] == 0) {
				check[nextI][nextJ] = true;
				continue;
			}
			
			dfs(array, check, nextI, nextJ);
			cnt++;
			
		}
		
		


	}
	

}
