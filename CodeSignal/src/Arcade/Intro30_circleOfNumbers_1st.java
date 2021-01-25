package Arcade;

public class Intro30_circleOfNumbers_1st { 
	public static void main(String[] args) {
		Intro30_circleOfNumbers_1st thisClass = new Intro30_circleOfNumbers_1st();
		
		int n = 10;
		int firstNumber = 2;
		
		System.out.println(thisClass.circleOfNumbers(n, firstNumber));
	}
	
	int circleOfNumbers(int n, int firstNumber) {
	    boolean overHalf = firstNumber >= n/2;
	    int gap = firstNumber - (overHalf? n/2 : 0);
	    return overHalf? gap : n/2+gap;
	}
	
//	jocke93's solution
	int circleOfNumbers_others(int n, int firstNumber) {
	    return (firstNumber+n/2)%n;
//	    return값이 원 안에서 n/2부터 시작하게 된다. 대박 
	}
}

/*

0 과 n/2를 기준으로 대칭
기준점(0 n/2)과 firstNumber의 거리를 구해서 대척점을 구한다.

*/