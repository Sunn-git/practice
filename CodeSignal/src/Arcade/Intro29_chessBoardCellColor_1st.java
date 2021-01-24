package Arcade;

public class Intro29_chessBoardCellColor_1st { 
	public static void main(String[] args) {
		Intro29_chessBoardCellColor_1st thisClass = new Intro29_chessBoardCellColor_1st();
		String cell1 = "A1";
		String cell2 = "C3";
		
		System.out.println(thisClass.chessBoardCellColor(cell1, cell2));
	}
	
	boolean chessBoardCellColor(String cell1, String cell2) {
	    boolean first = ((cell1.charAt(0)-'A'+1)%2) == ((cell1.charAt(1)-'0')%2); // true면 black false면 white
	    boolean second = ((cell2.charAt(0)-'A'+1)%2) == ((cell2.charAt(1)-'0')%2);

	    return first == second;
	}
	
//	viet_tran's solution
	boolean chessBoardCellColor_others(String cell1, String cell2) {
	    return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;
//	두 char의 차가 홀수인지 짝수인지를 판별. 짝수, 홀수끼리면 짝 / 짝 홀수가 섞였으면 홀
	}

}

/*

첫 시도에 return에 &&로 잘못 써서 히든테스트 두 개 통과 못함

*/