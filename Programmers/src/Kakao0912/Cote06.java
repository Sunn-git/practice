package Kakao0912;

public class Cote06 {

	public static void main(String[] args) { //테스트케이스 11/28 밖에 못함..
//		int[][] board = {{3,0,0,2},
//						 {0,0,1,0},
//						 {0,1,0,0},
//						 {2,0,0,3}};
//		
//		int r = 0; // 세로
//		int c = 1; // 가로
		
		int[][] board = {{1,0,0,3},
						 {2,0,0,0},
						 {0,0,0,2},
						 {3,0,1,0}};
		
		int r = 1; // 세로
		int c = 0; // 가로
		
		int mr = 0;
		int mc = 0;
		
		int sum = 0;
		int answer = 0;
		
		//한쌍의 카드를 없애기 위해서는 무소건 enter가 2회 들어가야함
		// 카드 종류 * 2
		// 현재 enter는 6회 들어감. enter를 제외한 이동수 8회
		// 최단거리 >> 시작 위치가 카드 위 이고 다른 쌍의 카드가 같은 줄에 있는 경우
//								(r, c 중 1개라도 일치) : 1회 이동
		//			시작 위치가 카드 위이고 다른 쌍의 카드가 다른 줄에 있는 경우 : 2회 이동
		//			시작 위치가 카드 위가 아니고 쌍인 카드가 시작 위치와 같은 줄에 있는 경우 3회 이동
		// 최장거리 >> 시작 위치가 카드 위가 아니고 쌍인 카드가 각각 다른 줄에 있는 경우 : 4회 이동
		
		do {
			

			if(board[r][c] != 0) { // 카드 위에서 시작하는 경우
				mr = 0;
				mc = 0;
				
				loop : for(int i = 0; i < board.length; i++) { // 카드 위치 찾기
					for(int j = 0; j < board[i].length; j++) {
	
						if(board[r][c] == board[i][j]) {
							if(r == i && c == j) continue;
							mr = i;
							mc = j;
							break loop;
						}
					}
				}
				
				if(r == mr || c == mc) { // 같은 줄
					answer += 3;
					
					board[r][c] = 0;
					board[mr][mc] = 0;
					
					if(r == mr) {
						c = mc;
					}else {
						r = mr;
					}
				}else { // 다른 줄 
					answer += 4;
					
					board[r][c] = 0;
					board[mr][mc] = 0;
					
					r = mr;
					c = mc;
				}
			}else { // 0에서 시작하는 경우 : 카드로 이동 후 위쪽 if문 다시타게해야함
			
				loop2 : for(int i = 0; i < board.length; i++) {
					if(board[r][i] > 0) {
						answer += 1;
						c = i;
						break;
					}else if(board[i][c] > 0 && i != r) {
						answer += 1;
						r = i;
						break;
					}else { // 같은 줄에 카드가 없는 경우
						for(int j = 0; j < board.length; j++) {
							if(board[i][j] > 0) {
								answer += 2;
								r = i;
								c = j;
								break loop2;
							}
						}
					} // 같은 줄에 카드가 없는 경우 end
				} // for end

			}
			
			sum = 0;
			System.out.println("=============");
			System.out.printf("r : %d, c: %d\nmr : %d, mc : %d\n", r,c,mr,mc);
			System.out.println("=============");
			for(int[] i : board) {
				for(int j : i) {
					System.out.printf("%d, ", j);
					if(j > 0) sum++;
				}
				System.out.println();
			}
			

		}while(sum > 0);
		
		
		
		
		System.out.println(answer);
	}

}


//for(int i = 0; i < board[r].length; i++) {
//if((board[r][i] == board[r][c])) {
//	answer += 3;
//	
//	board[r][c] = 0;
//	board[r][i] = 0;
//	
//	c = i;
//	break;
//}else if(board[i][c] == board[r][c]) {
//	if(i == r) continue;
//	
//	answer += 3;
//	
//	board[r][c] = 0;
//	board[i][c] = 0;
//	
//	r = i;
//	break;
//}else {
//	answer += 4;
//}
//}
