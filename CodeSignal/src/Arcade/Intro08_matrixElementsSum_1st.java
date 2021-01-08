package Arcade;

import java.util.HashSet;

public class Intro08_matrixElementsSum_1st { 
	public static void main(String[] args) {
		int[][] matrix = {
							{0, 1, 1, 2},
							{0, 5, 0, 0},
							{2, 0, 3, 3}
							};
		
		int sum = 0;
		HashSet<Integer> idx = new HashSet<Integer>();
		
		for(int i = 0; i < matrix.length; i++) {
			loop: for(int j = 0; j < matrix[i].length; j++) {
				for(int num : idx) {
					if(num == j) continue loop;
				}
				
				if(matrix[i][j] == 0) {
					idx.add(j);
					continue;
				}
				
				sum += matrix[i][j];
			}
		}
		
		System.out.println(sum);
	}
}
