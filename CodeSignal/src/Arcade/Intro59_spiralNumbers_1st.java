package Arcade;

public class Intro59_spiralNumbers_1st { 
	public static void main(String[] args) {
		Intro59_spiralNumbers_1st thisClass = new Intro59_spiralNumbers_1st();
		
		int[][] arr = thisClass.spiralNumbers(7);
		
		for(int[] a : arr) {
			for(int num : a) {
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
	}
	
	int[][] spiralNumbers(int n) {
		int[][] result = new int[n][n];
		
		return recursive(result, 0, 0, 0, 0);
	}
		
	int[][] recursive(int[][] arr, int i, int j, int n, int last){
//		System.out.println("==="+i+", "+j+", "+n+" : "+last+"===");
		if(last == arr.length*arr.length) return arr;
		
		if(i == n && i == j) { // 우로
			for(int k =(n == 0)? 0 : n; k < arr.length-n; k++) {
				arr[i][k] = ++last;
				if(k == arr.length-1-n) j = k;
			}
			
		}else if(i == n && j == arr.length-1-n) { // 하로
			for(int k = n+1; k < arr.length-n; k++) {
				arr[k][j] = ++last;
				if(k == arr.length-1-n) i = k;
			}
			
		}else if(i == arr.length-1-n && i == j) { // 좌로
			for(int k = n+1; k < arr.length-n; k++) {
				arr[i][j-k+n] = ++last;
				if(k == arr.length-1-n) j = n;
			}
			
		}else if(i == arr.length-1-n && j == n) { // 상으로
			for(int k = n+1; k < arr.length-1-n; k++) {
				arr[i-k+n][j] = ++last;
				if(k == arr.length-2-n) { 
					n++;
					i = n;
					j = n;
				}
			}
		}
		
		return recursive(arr, i, j, n, last);
	}
	
	
	
//	62734856293's solution
	int[][] spiralNumbers_others(int n) {
	    int[][] array = new int[n][n];
	    
	    int left = 0;
	    int right = n - 1;
	    int top = 0;
	    int down = n - 1;
	    
	    for (int counter = 1; counter <= n * n; ){
	        for (int x = left; x <= right; x++)
	            array[top][x] = counter++;
	        top++;
	        
	        for (int y = top; y <= down; y++)
	            array[y][right] = counter++;
	        right--;
	        
	        for (int x = right; x >= left; x--)
	            array[down][x] = counter++;
	        down--;
	        
	        for (int y = down; y >= top; y--)
	            array[y][left] = counter++;
	        left++;
	    }
	    
	    return array;
	}

	
}

/*



*/