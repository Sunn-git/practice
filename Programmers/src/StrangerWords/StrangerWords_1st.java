package StrangerWords;

public class StrangerWords_1st {

	public static void main(String[] args) {
		String s = "try hello world";
//		String s = "  aaa a  b bbb ";

		String answer = change(s);
		
		System.out.println(answer);
	}
	
	private static String change(String s) {

		s = s.toLowerCase();
		
		String result = "";
		String[] temp = s.split(" ", -1); // -1 추가하니까 4,5,8,9,11 바로 통과
		
		/*
		 * The limit parameter controls the number of times the pattern is applied 
		 * and therefore affects the length of the resulting array. 
		 * 
		 * If the limit n is greater than zero 
		 * then the pattern will be applied at most n - 1 times, 
		 * the array's length will be no greater than n, 
		 * and the array's last entry will contain all input 
		 * beyond the last matched delimiter.
		 *  
		 * If n is non-positive 
		 * then the pattern will be applied as many times as possible 
		 * and the array can have any length. 
		 * 
		 * If n is zero 
		 * then the pattern will be applied as many times as possible, 
		 * the array can have any length, 
		 * and trailing empty strings will be discarded. 
		 */
		
//		for(String string : temp) {
//			System.out.println(string);
//		}
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length(); j++) {
				if(j % 2 == 0) {
					result += Character.toUpperCase(temp[i].charAt(j));
				}else {
					result += temp[i].charAt(j);
				}
			}
			
			if(i < temp.length-1) {
				result += " ";				
			}
		}
		
		return result;
	}

}
/*
문자열을 split해서 이중for문으로 푸는 방법
 */