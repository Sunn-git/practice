package Arcade_TheCore;

public class TheCore06_CircleofNumbers {
	public static void main(String[] args) {
		TheCore06_CircleofNumbers thisClass = new TheCore06_CircleofNumbers();
		
		int answer = thisClass.circleOfNumbers(6, 2);
		System.out.println(answer);
	}
	
	int circleOfNumbers(int n, int firstNumber) {
	    return (firstNumber < (n/2))? firstNumber+(n/2) : firstNumber-(n/2);
	}


//	mikeconig's solution
	int circleOfNumbers_others(int n, int firstNumber) {
	    return (firstNumber + n/2) % n;
	}
	
}

/*

intro에서 이 문제를 봤을때 분명 저 답을 봣는데 이번에 생각나지 않았다.

*/