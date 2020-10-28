package StrangerWords;

public class StrangerWords_2nd {

	public static void main(String[] args) { //(21.79ms, 53.6MB)
		String s = "try hello world";

		String answer = change(s);
		
		System.out.println(answer);
	}
	
	private static String change(String s) {
		
		s = s.toLowerCase();
		
		String result = "";
		int index = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if(c == ' ') {
				index = 0;
				result += c;
				continue;
			}
			
			result += (index % 2 == 0) ? Character.toUpperCase(c) : c;
			index++;
		}
		
		return result;
	}

}
