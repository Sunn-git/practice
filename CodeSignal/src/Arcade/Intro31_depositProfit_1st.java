package Arcade;

public class Intro31_depositProfit_1st { // log , Math.ceil()
	public static void main(String[] args) {
		Intro31_depositProfit_1st thisClass = new Intro31_depositProfit_1st();
		
		System.out.println(thisClass.depositProfit(100, 20, 170));
		System.out.println(Math.ceil(0.1));
	}
	
	int depositProfit(int deposit, int rate, int threshold) {
	    double r = 1 + (0.01*rate);
	    double x = threshold*1.0 / deposit;
	    double n = baseLog(x, r);
	    int result = (n - (int)n > 0)? (int)n+1 : (int)n;

	    return result;
	}

	double baseLog(double x, double base){ //밑이 base인 log 만들기
	    return Math.log(x) / Math.log(base);
	}
	
//	4g4n's solution
	int depositProfit_others(int deposit, int rate, int threshold) {
	    return (int)Math.ceil(Math.log((double)threshold / deposit) / Math.log(1 + (rate / 100.0)));
	}
	/*
	 
	Math.ceil() :  주어진 숫자보다 크거나 같은 숫자 중 가장 작은 숫자를 integer 로 반환합니다.
	 			   Math.ceil(0.1) >> 1.0
	 */
}

/*

r^n = t/d 일 때, n을 구하기 위해 밑이 r인 log를 양 변에 덧씌운다.


*/