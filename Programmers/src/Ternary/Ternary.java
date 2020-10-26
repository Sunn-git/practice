package Ternary;

public class Ternary {

	public static void main(String[] args) { // 2,8,9,10 런타임에러
											 // 재귀함수를 두번 쓰면 너무 오래걸리는 듯
		int n = 45;
		
		int temp = Integer.valueOf(rTernary(n));
		int answer = toTen(temp, 0);
		

		System.out.println(answer);
	}
	
	private static String rTernary(int num) {
		
		if(num > 0 && num < 3) {
			return Integer.toString(num);
		}
		
		return Integer.toString(num % 3) + rTernary(num / 3);
	}
	
	private static int toTen(int ternary, int power) {
		
		int num = (int) Math.pow(3, power);
		
		if(ternary > 0 && ternary < 10) {
			return ternary * num;
		}
		
		return ((ternary % 10)* num) 
						+ toTen(ternary / 10, power + 1);
	}

}
