package Arcade_TheCore;

public class TheCore03_Candies {
	public static void main(String[] args) {
		TheCore03_Candies thisClass = new TheCore03_Candies();
		
		int answer = thisClass.candies(3, 10);
		System.out.println(answer);
	}
	
	int candies(int n, int m) {
		return (m/n)*n;
	}

	
//	mikeconig's solution
	int candies_others(int n, int m) {
	    return m - m%n;
	}
}

/*


*/