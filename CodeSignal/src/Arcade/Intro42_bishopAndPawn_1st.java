package Arcade;

public class Intro42_bishopAndPawn_1st { 
	public static void main(String[] args) {
		Intro42_bishopAndPawn_1st thisClass = new Intro42_bishopAndPawn_1st();
		
		
	}
	
	boolean bishopAndPawn(String bishop, String pawn) {
	    char[] bArr = bishop.toCharArray();
	    char[] pArr = pawn.toCharArray();
	    
	    for(int i = 0; i < 8; i++){
	        int c1 = bArr[0]-i;
	        int c12 = bArr[0]+i;
	        int c2 = bArr[1]-i;
	        int c22 = bArr[1]+i;
	        
	        boolean r1 = pArr[0] == c1 && pArr[1] == c2; 
	        boolean r2 = pArr[0] == c1 && pArr[1] == c22; 
	        boolean r3 = pArr[0] == c12 && pArr[1] == c2;
	        boolean r4 = pArr[0] == c12 && pArr[1] == c22;
	        
	        if(r1 || r2 || r3 || r4) return true;
	    }    
	    return false;
//	   	잠이 덜깼나.. 너저분하네
	}
	
	
	
	
//	ben_s24's solution
	boolean bishopAndPawn_others(String bishop, String pawn) {
	    return(Math.abs(bishop.charAt(0) - pawn.charAt(0)))
	    		== (Math.abs(bishop.charAt(1) - pawn.charAt(1)));
	    
//		비숍과 폰 사이의 가로 세로가 같다 == 서로 대각선에 위치한다.
	}

	
}

/*



*/