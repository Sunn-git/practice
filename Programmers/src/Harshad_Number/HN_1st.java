package Harshad_Number;

public class HN_1st {

	public static void main(String[] args) { // (0.04ms, 52.5MB)
		int x = 12;
		
		boolean answer = harshad(x);
		
		System.out.println(answer);

	}
	
	private static boolean harshad(int x) {
		int n = x;
		int sum = 0;
		
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		
		return (x % sum == 0) ? true : false;
	}

}
