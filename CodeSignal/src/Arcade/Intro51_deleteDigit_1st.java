package Arcade;

public class Intro51_deleteDigit_1st { 
	public static void main(String[] args) {
		Intro51_deleteDigit_1st thisClass = new Intro51_deleteDigit_1st();
		
		System.out.println(thisClass.deleteDigit(100));
		
	}
	
	int deleteDigit(int n) {
		String num = String.valueOf(n);
		
		char temp = num.charAt(0);
		for(int i = 1; i < num.length(); i++) {
			if(temp < num.charAt(i)) {
				num = num.substring(0, i-1).concat(num.substring(i));
//				System.out.println(num);
				break;
			}
			if(i == num.length()-1) return Integer.parseInt(num.substring(0, i));
			temp = num.charAt(i);
		}
		
		return Integer.parseInt(num);
	}
	
	
//	it_m1's solution
	int deleteDigit_others(int n) {
	    int max = 0;
	        String num = String.valueOf(n);
	        StringBuilder sb;

	        for (int i = 0; i < num.length(); i++) {
	            sb = new StringBuilder(num);
	            max = Math.max(max, Integer.parseInt(sb.deleteCharAt(i).toString()));
	        }

	        return max;
	        /* 정말 한자리씩 지워서 비교하는 방법 */
	}
	
}

/*

숫자 하나만 없애 가장 큰 수를 만드려면 
수의 제일 큰 자릿수부터 두자리씩 비교해 작은 숫자가 큰 숫자보다 앞에 위치한 경우에 작은 수를 제거해주면 된다.
만일 숫자가 내림차순으로 정렬되어 for문을 다 돌 경우에는 가장 마지막 숫자를 지운다.

*/