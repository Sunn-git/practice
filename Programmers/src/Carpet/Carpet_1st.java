package Carpet;

public class Carpet_1st {
	public static void main(String[] args) {
//		int brown = 10;
//		int yellow = 2;
		
		int brown = 8;
		int yellow = 1;
		
//		int brown = 24;
//		int yellow = 24;
		
		int[] answer = new int[2];
//		int[] cnt = new int[brown + yellow];

		int sum = brown + yellow;
		
		
//		for(int i = 2; i < brown + yellow; i++) { // 소인수분해하기
//			//처음에 for문을 sum(변하는 값)의 길이만큼 돌려서 제대로 실행되지 않았다. 고정값으로 수정함.
//			if(sum % i == 0) {
//				cnt[i]++;
//				sum /= i--;
//			}
//			
//			if(sum == 1) break;
//		}
		
//		for(int i = 0; i < cnt.length; i++) {
//			if(cnt[i] != 0) System.out.printf("i=%d : %d\n", i, cnt[i]);
//		}
		
		for(int w = sum; w >= 1; w--) {
			int h = sum/w;
			if(sum % w == 0 && w >= h) {
				if(brown == 2*(w+h)-4) {
					System.out.printf("w: %d / h: %d\n", w, h);
					answer[0] = w;
					answer[1] = h;
				}
			}
		}
		
		
		

	}
}
