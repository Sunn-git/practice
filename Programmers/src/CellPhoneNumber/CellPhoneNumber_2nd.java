package CellPhoneNumber;

public class CellPhoneNumber_2nd {// 다른 사람의 풀이

	public static void main(String[] args) {
		String phone_number = "01033334444";
		
		String answer = "";
		
//		//정규 표현식 이용
//		answer = phone_number.replaceAll(".(?=.{4})", "*");
////		뒤에 어떤 문자던 4글자가 있는 문자를 *로 치환하는 정규표현식
////		패턴 A(?=B) : 그 앞에 위치하는 표현식(A)이 패턴 내 표현식(B)에 일치하는 문자의 앞에 있어야함
		
		
		//String을 char Array로 바꿔서 푼 문제(이렇게 풀고 싶었음)
		char[] ch = phone_number.toCharArray();
		for(int i = 0; i < ch.length-4; i++) {
			ch[i] = '*';
		}

		answer = String.valueOf(ch);
		
		System.out.println(answer);
	}

}
