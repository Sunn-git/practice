package CellPhoneNumber;

public class CellPhoneNumber_1st {//(5.80ms, 52.9MB)

	public static void main(String[] args) {
		String phone_number = "01033334444";
		
		
		String answer = "";
		
		int length = phone_number.length()-4;
		
		if(phone_number.length() > 4) {
			for(int i = 0; i < length; i++) {
				answer += "*";
			}
			answer += phone_number.substring(length);
		}else {
			answer = phone_number;
		}

		System.out.println(answer);
	}

}
