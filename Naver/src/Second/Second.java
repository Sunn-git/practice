package Second;

public class Second {

	public static void main(String[] args) {
//		int day = 2; 
//		int width = 6; 
//		int[][] blocks = {{6, 2, 11, 0, 3, 5}
//						, {6, 3, 0, 9, 0, 5}}; // 20
		
		int day = 3; 
		int width = 10; 
		int[][] blocks = {{6, 12, 0, 2, 8, 4, 0, 7, 3, 6}
						, {6, 1, 3, 0, 2, 8, 0, 0, 13, 8}
						, {6, 3, 0, 10, 6, 5, 7, 0, 0, 3}}; // 69
		
		int[] building = new int[width];
		
		int result = 0;
		
		for(int s = 0; s < blocks.length; s++) {
			
			int top = 0;
			int topIndex = 0;
			
			for(int i = 0; i < width; i++) {
				building[i] += blocks[s][i]; // 벽돌 쌓기
				
				if(building[i] > top) { // 최고점 찾기
					top = building[i];
					topIndex = i;
				}	
			}
			
			int nextL = 0;
			int nextLIndex = 0;
			
			int nextR = 0;
			int nextRIndex = 0;
			
			
			
			for(int i = 0; i < width; i++) {
				if(i < topIndex && building[i] > nextL) { // 최고점 좌측 두번째 고점 찾기
					nextL = building[i];
					nextLIndex = i;
				}
				
				if(i > topIndex && building[i] > nextR) { // 최고점 우측 두번째 고점 찾기
					nextR = building[i];
					nextRIndex = i;
				}	
			}
			
			
			for(int i = 0; i < width; i++) { // 시멘트 채우기
				if(i < topIndex && building[i] < nextL) { 
					result += (nextL - building[i]);
					System.out.print("i : "+i+">> ");
					System.out.print(nextL - building[i] + " \n");
					building[i] = nextL;
				}
				
				if(i > topIndex && building[i] < nextR) { 

					System.out.print("i : "+i+">> ");
					System.out.print(nextR - building[i] + " \n");
					result += (nextR - building[i]);
					building[i] = nextR;
				}
			}
			
//			System.out.println(result);
			
		}

		System.out.println(result);
	}

}
