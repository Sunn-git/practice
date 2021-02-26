package Arcade_TheCore;

public class TheCore05_MaxMultiple {
	public static void main(String[] args) {
		TheCore05_MaxMultiple thisClass = new TheCore05_MaxMultiple();
		
		int answer = thisClass.maxMultiple(3, 10);
		System.out.println(answer);
	}
	
	int maxMultiple(int divisor, int bound) {
	    return (bound/divisor)*divisor;
	}


	
	
}

/*


*/