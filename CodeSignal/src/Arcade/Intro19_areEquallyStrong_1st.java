package Arcade;

public class Intro19_areEquallyStrong_1st { 
	public static void main(String[] args) {
		Intro19_areEquallyStrong_1st thisClass = new Intro19_areEquallyStrong_1st();
		
		System.out.println(thisClass.areEquallyStrong1(10, 15, 15, 10));
		System.out.println(thisClass.areEquallyStrong1(0, 15, 0, 0));
		

		System.out.println(thisClass.areEquallyStrong2(10, 15, 15, 10));
		System.out.println(thisClass.areEquallyStrong2(0, 15, 0, 0));
	}
	
	boolean areEquallyStrong1(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
	    return yourLeft*yourRight == friendsLeft*friendsRight;
	}
	
	boolean areEquallyStrong2(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
	    boolean multi = yourLeft*yourRight == friendsLeft*friendsRight;
	    boolean sum = yourLeft+yourRight == friendsLeft+friendsRight;
	    
	    return multi&&sum;
	}
}

/*

처음에 areEquallyStrong1로 풀었다가 히든테스트 한개를 통과 못함. (0으로 곱하는 경우에 예외발생)
areEquallyStrong2처럼 합과 곱으로 모두 비교해서 해결.

*/