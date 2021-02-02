package Arcade;

import java.util.HashSet;
import java.util.Set;

public class Intro55_differentSquares_1st { 
	public static void main(String[] args) {
		Intro55_differentSquares_1st thisClass = new Intro55_differentSquares_1st();
		
	}
	
	int differentSquares(int[][] matrix) {
	    int x = matrix.length-1;
	    int y = matrix[0].length-1;
	    
	    HashSet<String> set = new HashSet<String>();
	    String temp;
	    
	    for(int i = 0; i < x; i++){
	        for(int j = 0; j < y; j++){
	            temp = "";
	            for(int k = 0; k < 2; k++){
	                for(int l = 0; l < 2; l++){
	                    temp += matrix[i+k][j+l];
	                }
	            }
	            set.add(temp);
	        }
	    }
	    
	    return set.size();
	}
	
	
//	pyska-ratzinger's solution
	int differentSquares_others(int[][] matrix) {
	    HashSet<String> set = new HashSet<>();
	    for(int i=0; i<matrix.length-1; i++){
	        for(int j=0; j<matrix[0].length-1; j++){
	            String temp = String.valueOf(matrix[i][j]) + ";" +
	                String.valueOf(matrix[i+1][j]) + ";" +
	                String.valueOf(matrix[i][j+1]) + ";" +
	                String.valueOf(matrix[i+1][j+1]);
	            set.add(temp);
	        }
	    }
	    return set.size();
	}
	
//	Aleksandra's solution
	int differentSquares_others2(int[][] matrix) {
	    Set<String> squaresSet = new HashSet<String>();
	    
	    for(int i = 0; i < matrix.length - 1; i++) {
	        for(int j = 0; j < matrix[0].length - 1; j++) {
	            squaresSet.add(String.format("%d%d%d%d", matrix[i][j], matrix[i+1][j], matrix[i][j+1], matrix[i+1][j+1]));
	        }
	    }
	    return squaresSet.size();
	}

	
}

/*

풀이법이 표현의 차이일뿐 거의 비슷하다.

*/