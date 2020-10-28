package CaesarCipher;

public class Caesar_1st {
	public static void main(String[] args) {
//		String s = "AB";
//		int n = 1;
		
		String s = "AaZz";
		int n = 25; //ZzYy
		
//		String s = "a B z";
//		int n = 4; 
		
		String answer = caesar(s, n);
		
		System.out.println(answer);
	}
	
	private static String caesar(String s, int n) {
		String result = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				int ascii = s.charAt(i)+n;
				
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') { //대문자인 경우 (41.16ms, 71.8MB)
//				if(Character.isUpperCase(s.charAt(i))) { // (36.21ms, 70.2MB). 파라미터로 int와 char 모두가능
					ascii = (ascii > 'Z') ? ascii -= 26 : ascii;
				} else { //소문자인 경우
					ascii = (ascii > 'z') ? ascii -= 26 : ascii;
				}
				
				result += (char)ascii;
				
			}else {
				result += " ";
			}
		}
		
		return result;
	}
}
