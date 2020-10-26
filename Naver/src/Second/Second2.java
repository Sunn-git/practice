package Second;

public class Second2 {

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
		
		for(int i = 0; i < width; i++) {
			building[i] += blocks[0][i];
		}
		
		for(int i = 0; i < width; i++) {
			int top = 0;
			int next = 0;
			
			for(int j = i+1; j < width; j++) {
				if(building[i] < building[j]) {
					top = building[j];
					i = j-1;
				}else if(building[i] > building[j]) {
					if(building[j] > next) {
						next = building[j];
					}
					
					if(next > building[j]) {
						
					}
				}
			}
		}

		System.out.println(result);
	}

}
