package Ternary;

public class Ternary_others {

	public static void main(String[] args) { // 다른사람의 풀이
		int n = 125;
		
		int answer = 0;
        
		String third = Integer.toString(n, 3); // n진법 변환을 이렇게도 하는구나...
		
		StringBuffer sb = new StringBuffer(third);
      
		String reversed = sb.reverse().toString();

        int exp = 0;
        
        for (int i = reversed.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(String.valueOf(
            					reversed.charAt(i))) * Math.pow(3, exp);
            exp++;
        }

		System.out.println(answer);
	}

	

}

