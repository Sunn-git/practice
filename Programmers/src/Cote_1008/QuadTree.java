package Cote_1008;

public class QuadTree {

	public static void main(String[] args) {
		int[][] arr = {{1,1,0,0}
					 , {1,0,0,0}
					 , {1,0,0,1}
					 , {1,1,1,1}}; //4,9
		
//		int[][] arr = {{1,1,1,1,1,1,1,1}
//					 , {0,1,1,1,1,1,1,1}
//					 , {0,0,0,0,1,1,1,1}
//					 , {0,1,0,0,1,1,1,1}
//					 , {0,0,0,0,0,0,1,1}
//					 , {0,0,0,0,0,0,0,1}
//					 , {0,0,0,0,1,0,0,1}
//					 , {0,0,0,0,1,1,1,1}}; // 10,15
		
		int[] answer = {0, 0};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				makeQuadTree(i, j, arr.length, arr, answer);
			}
		}
		
		
		System.out.println(answer);
	}
	
	static boolean isAllSame(int x, int y, int len, int[][] arr) {
		int base = arr[x][y];
		for(int i = x; i < x + len; i++) {
			for(int j = y; j < y + len; j++) {
				if(base == arr[i][j]) continue;
				return false;
			}
		}
		
		return true;
	}
	
	static void makeQuadTree(int x, int y, int len, int[][] arr, int[] answer) {
		if (isAllSame(x, y, len, arr)) {
			answer[arr[x][y]]++;
			return;
		}
		
		int half = len / 2;
		
		makeQuadTree(x, y, half, arr, answer);
		makeQuadTree(x, y+ half, half, arr, answer);
		makeQuadTree(x+ half, y, half, arr, answer);
		makeQuadTree(x+ half, y+ half, half, arr, answer);
	
	}
	

}
