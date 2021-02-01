package Arcade;

public class Intro50_chessKnight_1st { 
	public static void main(String[] args) {
		Intro50_chessKnight_1st thisClass = new Intro50_chessKnight_1st();
		
		System.out.println(thisClass.chessKnight("c2"));
	}
	
	
//	mehdirizvi's solution
	int chessKnight(String cell) {
		int moves = 8;
		char x = cell.charAt(0);
		char y = cell.charAt(1);
		
		// 경계선보다 한칸 안쪽에 위치한 경우 (가장 바깥쪽 이동범위 두개가 사라진다)
		if(x == 'b' || x == 'g') moves -= 2;
		if(y == '2' || y == '7') moves -= 2;

		// 경계선과 인접하게 위치한 경우(전체 이동범위 중 절반이 사라진다)
		if(x == 'a' || x == 'h') moves /= 2;
		if(y == '1' || y == '8') moves /= 2;
		
		return moves;
	}	
}

/*

논리적으로 풀 방식이 생각나지 않아서 구글링한 답안.

*/