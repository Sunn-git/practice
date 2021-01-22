package Arcade;

public class Intro21_isIPv4Address_1st { 
	public static void main(String[] args) {
		Intro21_isIPv4Address_1st thisClass = new Intro21_isIPv4Address_1st();
//		String inputString = "172.16.254.1";
//		String inputString = "172.316.254.1";
//		String inputString = ".254.255.0";
//		String inputString = "1.1.1.1a";
		String inputString = "129380129831213981.255.255.255";
//		String inputString = "64.233.161.00";
//		String inputString = "1.1.1.1a";

//		String inputString = "1";
		
		System.out.println(thisClass.isIPv4Address(inputString));
	}
	
	boolean isIPv4Address(String inputString) {
		String[] arr = inputString.split("\\.");
		
		if(arr.length != 4) return false;
		
		int i;
		for(String s : arr) {
			if(s.length() == 0 || s.length() > 3) return false;
			//s의 길이가 0이거나(빈문자열) 3보다 길 때(1000 이상)
			
			for(int j = 0; j < s.length(); j++) { 
				if(s.charAt(0) == '0' && s.length() > 1) return false;
				// 00, 01 
				if(s.charAt(j) < '0' || '9' < s.charAt(j)) return false;
				// s에 숫자 이외의 문자가 들어가는 경우
			}

			i = Integer.parseInt(s);
			if(i < 0 || 255 < i) return false;
		}
		
		return true;
	}
}

/*

string.split을 사용할 때 특수문자를 구분자료 사용하려면 \\를 앞에 붙여줘야한다 !

*/