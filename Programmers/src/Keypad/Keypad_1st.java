package Keypad;

public class Keypad_1st {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}; 
		String hand = "right"; //LRLLLRLLRRL
		
//		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}; 
//		String hand = "left"; //LRLLRRLLLRR
		
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; 
//		String hand = "right"; //LLRLLRLLRL
		
		String answer = "";
		
		int[] location = new int[] {74, 67}; //ascii code
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				location[0] = numbers[i];
				answer += "L";
				
			}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				location[1] = numbers[i];
				answer += "R";
				
			}else {
				System.out.printf("i = %d : %d, %d", i, location[0], location[1]);
				System.out.println();
				answer += "*";
				
//				for(int j = 0; i < location.length; j++) {
//					if(location[j] == numbers[i]-1 || location[j] == numbers[i]+1) {
//						location[j] = numbers[i];
//						
//						if((location[0] + location[1]) / 2 == numbers[i]) {
//							answer += (char)(hand.charAt(0)-32);
//						}else {
//							if(j == 0) answer += "L";
//							if(j == 1) answer += "R";
//							
//						}
//	
//					}
//				}
				
			}
			
		}
		
		
		System.out.println(answer);

	}

}
