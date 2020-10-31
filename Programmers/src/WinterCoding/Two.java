package WinterCoding;

public class Two {

	public static void main(String[] args) {
		String encrypted_text = "qyyigoptvfb";
		String key = "abcdefghijk";
		int rotation = 3; // hellopython
		
		int length = encrypted_text.length();
	
		String r = "";
		
		if(rotation < 0) {
			r = encrypted_text.substring(length - (-rotation % length));
			r += encrypted_text.substring(0, length - (-rotation % length));
		}else {
			r = encrypted_text.substring(rotation % length);
			r += encrypted_text.substring(0, rotation % length);
		}
		
		System.out.println(r);
		
		String[] temp = r.split("");
		String answer = "";
	
		for(int i = 0; i < key.length(); i++) {
			int n = key.charAt(i) - 'a' + 1 ;
//			System.out.println(n);
			answer += caesar(temp[i], n);
		}
		
//		for(String s : temp) {
//			System.out.printf("%s", s);
//		}
		
		System.out.println(answer);

	}
	
	private static String caesar(String s, int n) {
		String result = "";
		
		for(int i = 0; i < s.length(); i++) {
				int ascii = s.charAt(i)-n;
				ascii = (ascii < 'a') ? ascii += 26 : ascii;
				result += (char)ascii;
		}
		return result;
	}

}
