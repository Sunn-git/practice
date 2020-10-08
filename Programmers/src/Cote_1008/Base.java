package Cote_1008;

public class Base {

	public static void main(String[] args) {
		int n = 45; //7
//		int n = 125; //229
		
		int answer = 0;
		
        String temp = "";
        
		while(n > 0) {
			temp = (n % 3) + temp;
			n /= 3;
		}
		
        char[] c = temp.toCharArray();

        temp = new StringBuilder(new String(c)).reverse().toString();

        answer = Integer.valueOf(temp, 3);
		
		System.out.println(answer);
	}

}
