package Keypad;

public class Keypad_2nd {

	public static void main(String[] args) { //(8.74ms, 53.5MB)
//		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}; 
//		String hand = "right"; //LRLLLRLLRRL
		
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}; 
		String hand = "left"; //LRLLRRLLLRR
		
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; 
//		String hand = "right"; //LLRLLRLLRL
		
		String answer = "";
		
//		int[][] keypad = {{0,0}, {0,1}, {0,2}, 
//						  {1,0}, {1,1}, {1,2}, 
//						  {2,0}, {2,1}, {2,2}, 
//						  {3,0}, {3,1}, {3,2}};
		
		int[] right = {3,2};
		int[] left = {3,0};
		
		for(int i = 0; i < numbers.length; i++) {
			
			switch (numbers[i]) {
			case 1 :
			case 4 :
			case 7 : 
				left[0] = numbers[i] / 3;
				left[1] = 0;
				answer += "L";
				break;

			case 3 :
			case 6 :
			case 9 : 
				right[0] = numbers[i] / 4;
				right[1] = 2;
				answer += "R";
				break;
				
			case 0 :
				int l0 = Math.abs(left[0] - 3)
						+ Math.abs(left[1] - 1);
				int r0 = Math.abs(right[0] - 3)
						+ Math.abs(right[1] - 1);
				
				if(l0 < r0) {
					left[0] = 3;
					left[1] = 1;
					answer += "L";
				}else if(l0 == r0) {
					if(hand.equals("right")) {
						right[0] = 3;
						right[1] = 1;
						answer += "R";
					}else {
						left[0] = 3;
						left[1] = 1;
						answer += "L";
					}
					
				}else {
					right[0] = 3;
					right[1] = 1;
					answer += "R";
				}
				
				break;
				
			default : //2,5,8
				int l = Math.abs(left[0] - (numbers[i]/4))
						+ Math.abs(left[1] - 1);
				int r = Math.abs(right[0] - (numbers[i]/4))
						+ Math.abs(right[1] - 1);
				
				if(l < r) {
					left[0] = numbers[i] / 4;
					left[1] = 1;
					answer += "L";
				}else if(l == r) {
					if(hand.equals("right")) {
						right[0] = numbers[i] / 4;
						right[1] = 1;
						answer += "R";
					}else {
						left[0] = numbers[i] / 4;
						left[1] = 1;
						answer += "L";
					}
					
				}else {
					right[0] = numbers[i] / 4;
					right[1] = 1;
					answer += "R";
				}	
				break;
			}
				
		}
		
		
		System.out.println(answer);

	}

}
