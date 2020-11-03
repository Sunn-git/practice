package Collatz;

public class Collatz_1st {

	public static void main(String[] args) { //(0.09ms, 52.4MB)
		int n = collatz(626331, 0);
		
		System.out.println(n);

	}
	
	private static int collatz(long n, int cnt) { 
		// int를 사용하면 범위 초과로 오답이 나온다
		
		if(n == 1) {
			return cnt;
		}
		
		if(cnt >= 500) {
			return -1;
		}
		
		n = (n % 2 == 0) ? n/2 : (3*n)+1;
		
		return collatz(n, ++cnt);
	}

}
