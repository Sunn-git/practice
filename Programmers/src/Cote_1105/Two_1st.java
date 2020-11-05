package Cote_1105;

public class Two_1st {

	public static void main(String[] args) {
		String s = "110010101001"; //	[3,8]
//		String s = "01110"; //	[3,3]
//		String s = "1111111"; // [4,1]
		
		int[] answer = new int[2];
		
		String[] arr = binary(s, 0, 0).split(" ");
		
		int index = 0;
		
		for(String o : arr) {
			answer[index++] = Integer.parseInt(o);
			System.out.println(o);
		}

	}
	
	private static String binary(String s, int zero, int cnt) {
		int temp = zero;
		int length = 0;
		
		if(s.equals("1")) {
			return cnt + " " + zero;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				temp++;
				continue;
			}
			length++;
		}
		
		String sTemp = Integer.toBinaryString(length);
	
		return binary(sTemp, temp, ++cnt);
	}

}
