package Arcade_TheCore;

public class TheCore12_isInfiniteProcess {
	public static void main(String[] args) {
		TheCore12_isInfiniteProcess thisClass = new TheCore12_isInfiniteProcess();
		
//		int answer = thisClass.largestNumber(8);
//		System.out.println(answer);
	}
	
	boolean isInfiniteProcess(int a, int b) {
		//a가 b보다 크거나, 두 수의 차이가 홀수인 경우
	    if(a > b || Math.abs(a-b)%2 == 1) return true;
	    
	    return false;
	}


//	mssk's solution
	boolean isInfiniteProcess_others(int a, int b) {
		//b가 a보다 같거나 크고 두 수의 차가 짝수인 경우에만 false, 나머지 경우엔 true가 바로 리턴되게
	    return !(b>=a && (b-a)%2==0);           
	}

	
}

/*


*/