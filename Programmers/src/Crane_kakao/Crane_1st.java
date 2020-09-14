package Crane_kakao;

import java.util.ArrayList;

public class Crane_1st {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}
						,{0,0,1,0,3}
						,{0,2,5,0,1}
						,{4,2,4,4,2}
						,{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		ArrayList<Integer> basket = new ArrayList<Integer>();
		
		int answer = 0;
		
		int[] length = new int[board.length];
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[j][i] > 0) {
					length[i] = board.length-j; // length[0] = 2
					break;
				}
			}
		}
		
		for(int i = 0; i < moves.length; i++) { // i = 0
			int lane = moves[i]-1; // 0
			if(length[lane] > 0) {
				basket.add(board[board.length-length[lane]][lane]);
				length[lane]--;
			}
			
			if(basket.size() >= 2) {
				int bLastIndex = basket.size()-1;
				if(basket.get(bLastIndex) == basket.get(bLastIndex-1)) {
					basket.remove(bLastIndex);
					basket.remove(bLastIndex-1);
					answer += 2;
				}
			}
		}
			 
		System.out.println(answer);
	}
}
