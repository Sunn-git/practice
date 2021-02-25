package Arcade_TheCore;

public class TheCore02_LargestNumber {
	public static void main(String[] args) {
		TheCore02_LargestNumber thisClass = new TheCore02_LargestNumber();
		
		int answer = thisClass.largestNumber(8);
		System.out.println(answer);
	}
	
	int largestNumber(int n) {
	    int result = 0;
	    while(n-- > 0){
	        result = result*10 + 9;
	    }
	    return result;
	}

//	mikeconig's solution
	int largestNumber_others(int n) {
	    return (int)Math.pow(10,n) - 1;
	}

	
	
}

/*

간단한건데 생각하지 못했네
다시 기억하기 !!

*/