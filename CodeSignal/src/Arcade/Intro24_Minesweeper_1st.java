package Arcade;

public class Intro24_Minesweeper_1st { 
	public static void main(String[] args) {
		Intro24_Minesweeper_1st thisClass = new Intro24_Minesweeper_1st();
		boolean[][] matrix = {{true,false,false},
							  {false,true,false},
							  {false,false,false}};
		
		thisClass.minesweeper(matrix);
	}
	
	int[][] minesweeper(boolean[][] matrix) {
	    int[][] result = new int[matrix.length][matrix[0].length];
	    
	    for(int i = 0; i < matrix.length; i++){
	        for(int j = 0; j < matrix[0].length; j++){
	            int cnt = 0;
	            
	            for(int k =(i > 0)? i-1 : 0; k <= ((i<matrix.length-1)? i+1 : i); k++){
	                for(int l =(j > 0)? j-1 : 0; l <= ((j<matrix[0].length-1)? j+1 : j); l++){
	                    if(!(k == i && l == j) && matrix[k][l] == true) cnt++;
	                }
	            }
	            
	            result[i][j] = cnt;
	        }
	    }
	    
	    return result;
	}

}

/*

구간별 합으로 구해보려 했지만 아래와 같은 이유로 실패. 결국 지뢰의 개수를 세어야했다.

C나 C++에서는 true는 1, false는 0으로 표현할 수 있었지만 JAVA에서는 불가능 하다. 
즉, 정수값을 논리형으로 형변환 할 수 없다.
(출처 : https://luckyyowu.tistory.com/178)

*/