package Ternary;

public class Ternary2nd {

	public static void main(String[] args) { // (2.88ms, 53.3MB)
		int n = 125;
		
		String temp = rTernary(n);
		int answer = 0;
		
		for(int i = temp.length()-1; i >= 0; i--) {
			int k = temp.charAt(i) - '0';
			
			int num = (int) Math.pow(3, temp.length()-1-i);
			
			answer += (k * num);
		}

		System.out.println(answer);
	}
	
	private static String rTernary(int n) {
		
		if(n > 0 && n < 3) {
			return Integer.toString(n);
		}
		
		return Integer.toString(n % 3) + rTernary(n / 3);
	}
	

}
