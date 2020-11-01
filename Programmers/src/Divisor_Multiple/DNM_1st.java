package Divisor_Multiple;

public class DNM_1st { // 최대공약수 : 유클리드 호제법 ,  최소공배수 = 두 자연수의 곱 / 최대공약수
//	https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
//	https://myjamong.tistory.com/138
	
	public static void main(String[] args) { //(0.03ms, 53.1MB)
		int n = 3;
		int m = 12; // {3,12}

//		int n = 2;
//		int m = 5; // {1, 10}
		
		int[] answer = new int[2];
		
		if(n > m) {
			answer[0] = euclidean(n, m);
		}else {
			answer[0] = euclidean(m, n);
		}
		
		answer[1] = (n * m) / answer[0];
		
		
		for(int i : answer) {
			System.out.printf("%d, ", i);
		}
		
	}
	
	private static int euclidean(int a, int b) {
		int r = a % b;
		
		if(a % b == 0) {
			return b;
		}
		
		return euclidean(b, r);
	}

}
