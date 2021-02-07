package Arcade;

import java.util.Arrays;

public class Intro60_sudoku_1st { 
	public static void main(String[] args) {
		Intro60_sudoku_1st thisClass = new Intro60_sudoku_1st();
		
		int[][] grid = { {1, 3, 2, 5, 4, 6, 9, 8, 7},
						 {4, 6, 5, 8, 7, 9, 3, 2, 1},
						 {7, 9, 8, 2, 1, 3, 6, 5, 4},
						 {9, 2, 1, 4, 3, 5, 8, 7, 6},
						 {3, 5, 4, 7, 6, 8, 2, 1, 9},
						 {6, 8, 7, 1, 9, 2, 5, 4, 3},
						 {5, 7, 6, 9, 8, 1, 4, 3, 2},
						 {2, 4, 3, 6, 5, 7, 1, 9, 8},
						 {8, 1, 9, 3, 2, 4, 7, 6, 5} };
		
		System.out.println(thisClass.sudoku(grid));
		
	}
	
	boolean sudoku(int[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				int num = grid[i][j];
				
				for(int k = 0; k < 9; k++) {
					if(k != i && grid[k][j] == num) return false;
					if(k != j && grid[i][k] == num) return false;
				}
				
				for(int k = i/3*3; k < (i/3*3)+3; k++) {
					for(int l = j/3*3; l < (j/3*3)+3; l++) {
						if(k != i && l != j && grid[k][l] == num) return false;
					}
				}
				
			}
		}
		
		
		return true;
	}
	
	
//	boterogomezalex's solution
	boolean sudoku_others(int[][] grid) {
	    int[] rowsSumary = new int[9];
	    int[] colsSumary = new int[9];
	    int[] sectSumary = new int[9];
	    for(int row = 0; row < 9; row++){
	        for(int col = 0; col < 9; col++){
	            rowsSumary[row] += grid[row][col];
	            colsSumary[col] += grid[row][col];
	            sectSumary[(col / 3) + ((row / 3) * 3)] += grid[row][col];
	        }
	    }
	    return Arrays.stream(grid[0]).distinct().count() == 9 &&  
	           Arrays.stream(rowsSumary).allMatch(x -> x == 45) && 
	           Arrays.stream(colsSumary).allMatch(x -> x == 45) &&
	           Arrays.stream(sectSumary).allMatch(x -> x == 45);
	    
	    /*
	     
	     	가로, 세로, 사각형 안의 숫자들의 합이 45인지 확인하는 풀이
	      
	     */
	}
	
//	mehdirizvi's solution
	boolean sudoku_others2(int[][] grid) {
	    for (int i=0; i<3; i++) {
	        for (int j=0; j<3; j++) {
	            int[][] counts = new int[3][9];
	            for (int x=0; x<3; x++) {
	                for (int y=0; y<3; y++) {
	                    counts[0][grid[i*3+x][j*3+y]-1] = 1;
	                    counts[1][grid[i*3+j][x*3+y]-1] = 1;
	                    counts[2][grid[x*3+y][i*3+j]-1] = 1;
	                }
	            }
	            for (int k=0; k<9; k++) {
	                if (counts[0][k] == 0 || counts[1][k] == 0 || counts[2][k] == 0) {
	                    return false;
	                }
	            }
	        }
	    }
	    return true;
	    
	    /*
	     
     	
      
	     */
	}

	
}

/*

백준에서 스도쿠를 푸는 문제를 먼저 풀어서 코드는 쉽게 구현했는데 더 효율적인 코드가 생각 안나서 아쉽다.

*/